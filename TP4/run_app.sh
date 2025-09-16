echo "Lancement du conteneur tp4-app à partir de l'image im-tp4..."

docker run --rm -d \
  --name tp4-app \
  --network net-tp4 \
  -p 5000:5000 \
  im-tp4

echo "Conteneur tp4-app lancé, écoute sur http://localhost:5000"
