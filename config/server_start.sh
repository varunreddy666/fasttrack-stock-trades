#!/usr/bin/env bash

cd /home/ec2-user/application/server

pat="$(pwd)"
echo $pat > /tmp/server_start.log

sudo java -jar -Dserver.port=80 \
    *.jar >> /tmp/server_start.log &