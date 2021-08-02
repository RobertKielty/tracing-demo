#/bin/bash
set -o verbose
docker kill eshop 
docker rm eshop  
docker run -d --name eshop -p 127.0.0.1:80:8080/tcp rkielty/tracing-project:latest 
sleep 10

curl http://127.0.0.1:80/checkout
