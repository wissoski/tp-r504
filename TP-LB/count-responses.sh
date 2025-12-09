#!/bin/bash

echo "Comptage des réponses pour 500 requêtes..."

count1=0
count2=0

for i in {1..500}; do
    response=$(curl -s http://localhost:83)
    if [ "$response" = "<h1>Hello 1</h1>" ]; then
        ((count1++))
    elif [ "$response" = "<h1>Hello 2</h1>" ]; then
        ((count2++))
    fi
    # Affiche la progression tous les 50 requêtes
    if [ $((i % 50)) -eq 0 ]; then
        echo "Progression: $i/500"
    fi
done

total=$((count1 + count2))
percent1=$((count1 * 100 / total))
percent2=$((count2 * 100 / total))

echo ""
echo "=============== RÉSULTATS ==============="
echo "Serveur 1 : $count1 requêtes ($percent1%)"
echo "Serveur 2 : $count2 requêtes ($percent2%)"
echo "Total     : $total requêtes"
echo "========================================="
