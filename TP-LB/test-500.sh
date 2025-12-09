#!/bin/bash

echo "Envoi de 500 requêtes..."

for i in {1..500}; do
    curl -s http://localhost:83
    echo ""
done
