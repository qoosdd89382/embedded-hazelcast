import http from 'k6/http';
import { sleep } from 'k6';

function generateRandomIP() {
  const octets = [];
  for (let i = 0; i < 4; i++) {
    const octet = Math.floor(Math.random() * 256);
    octets.push(octet);
  }
  return octets.join('.');
}

export default function () {
  const clientIP = generateRandomIP();
  const headers = { 'X-Forwarded-For': clientIP };
  const res = http.get('http://embedded-hazelcast.default.svc.cluster.local:8888/listAll', { headers });
  console.log(clientIP, ' | ', res.body);
  sleep(1);
}
