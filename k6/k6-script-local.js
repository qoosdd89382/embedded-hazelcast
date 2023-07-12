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
  for (let i = 0; i < 500; i++) {
    const clientIP = generateRandomIP();
    const res = http.get('http://localhost:7777/listAll', {
      headers: {
        'X-Forwarded-For': clientIP,
        'Remote-Addr': clientIP,
      },
    });
    console.log(res.body);
    // 这里可以添加其他断言或处理逻辑
    sleep(1);
  }
}
