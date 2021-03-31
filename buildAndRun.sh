#!/bin/sh
mvn clean package && docker build -t br.edu.ifnmg.enterprise/MyJakartaEE9Tests .
docker rm -f MyJakartaEE9Tests || true && docker run -d -p 9080:9080 -p 9443:9443 --name MyJakartaEE9Tests br.edu.ifnmg.enterprise/MyJakartaEE9Tests