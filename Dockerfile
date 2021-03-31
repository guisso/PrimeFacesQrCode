FROM open-liberty:kernel-java11
COPY --chown=1001:0  target/MyJakartaEE9Tests.war /config/dropins/
COPY --chown=1001:0  server.xml /config