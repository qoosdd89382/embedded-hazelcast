package com.cherry.hazelcast.controller;

import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.session.hazelcast.Hazelcast4IndexedSessionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 不同的 client 應該抓不到彼此的東西
 * 所有 pod 都應該要抓到彼此的所有東西
 */
@RestController
@RequestMapping("kv")
public class KeyValueController {

    private final static String PERSONAL_KEY = "test:key:personal";
    private final static String GLOBAL_KEY = "test:key:global";
    private final static String GLOBAL_MAP = "test:map:global";

    @Autowired
    private HazelcastInstance hazelcastInstance;

    @GetMapping
    public String index(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Object sessionObj = session.getAttribute(PERSONAL_KEY);
        String personalValue = null;
        if (sessionObj != null) {
            personalValue = (String) sessionObj;
        }

        Map<String, String> hazelcastGlobalMap = hazelcastInstance.getMap(GLOBAL_MAP);
        String globalValue = null;
        if (hazelcastGlobalMap != null) {
            globalValue = hazelcastGlobalMap.get(GLOBAL_KEY);
        }

        Map<String, String> resultMap = new HashMap<>();
        resultMap.put(PERSONAL_KEY, personalValue);
        resultMap.put(GLOBAL_KEY, globalValue);

        return resultMap.toString();
    }

    @GetMapping("/put")
    public String putThing(HttpServletRequest request, @RequestParam("str") String str) {
        HttpSession session = request.getSession();
        session.setAttribute(PERSONAL_KEY, str);

        Map<String, String> map = hazelcastInstance.getMap(GLOBAL_MAP);
        map.put(GLOBAL_KEY, str);

        return str;
    }



}
