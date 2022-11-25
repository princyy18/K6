import http from 'k6/http';
import {check} from 'k6';

export const options={
    vus:1,
    duration : '1s',
}

export default function () {
  const url = 'http://restapi.adequateshop.com/api/authaccount/registration';
  const payload = JSON.stringify({
        "name":"Developer",
        "email":"Developer5@gmail.com",
        "password":123456
  });

  const params = {
    headers: {
      'Content-Type': 'application/json',
    },
  };
  

  const res=http.post(url, payload, params);

  check(res,{
    'is status 200': (r) => r.status === 200,
    'is res body has username': (r) => r.body.includes('success'),
  });
}
