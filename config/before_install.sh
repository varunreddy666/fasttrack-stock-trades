#!/usr/bin/env bash

cd /home/ec2-user/application/server/
now="$(date '+%Y%m%d%H%M%S')"
sudo mv stocktrades_$now.jar /home/ec2-user/application/archive