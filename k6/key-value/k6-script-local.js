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
  const res = http.get('http://localhost:8888/kv/put?str=' + generateRandomIP());
  console.log(res.body);
  for (let i = 0; i < 60; i++) {
    const res = http.get('http://localhost:8888/kv');
    console.log(res.body);
    sleep(1);
  }
}
