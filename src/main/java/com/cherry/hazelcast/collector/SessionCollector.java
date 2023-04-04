package com.cherry.hazelcast.collector;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SessionCollector {

    private static final Map<String, HttpSession> sessions = new HashMap<>();

    public static Map<String, HttpSession> getActiveSessionsMap() {
        return sessions;
    }

    public static List<String> getActiveSessionIds() {
        return new ArrayList<>(sessions.keySet());
    }

    public static List<HttpSession> getActiveSessions() {
        return new ArrayList<>(sessions.values());
    }

    public static void addActiveSession(HttpSession session) {
        sessions.put(session.getId(), session);
    }

    public static void removeActiveSession(String sessionId) {
        sessions.remove(sessionId);
    }
}
