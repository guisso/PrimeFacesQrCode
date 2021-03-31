@echo off
call mvn clean package
call docker build -t br.edu.ifnmg.enterprise/MyJakartaEE9Tests .
call docker rm -f MyJakartaEE9Tests
call docker run -d -p 9080:9080 -p 9443:9443 --name MyJakartaEE9Tests br.edu.ifnmg.enterprise/MyJakartaEE9Tests