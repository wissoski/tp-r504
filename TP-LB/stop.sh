#!/bin/bash

docker stop nginx1 nginx2 load-balancer

docker network rm tplb

echo "Conteneurs arrêtés et réseau supprimé"
