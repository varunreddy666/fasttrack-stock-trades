#!/usr/bin/env bash

cd /home/ec2-user/application/server/
now="$(date '+%Y%m%d%H%M%S')"
<<<<<<< HEAD
sudo mv stocktrades.jar /home/ec2-user/application/archive/stocktrades_$now.jar
=======
sudo mv stocktrades_$now.jar /home/ec2-user/application/archive
>>>>>>> 50761584f5ba6beaa4d8b7492f52b1e466522857
