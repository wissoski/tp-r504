print("Hello, World!")
import fonctions as f
while True:
    try:
        a = int(input("Entrez l'entier a : "))
        b = int(input("Entrez l'entier b : "))
        res = f.puissance(a, b)
        print(f"{a}**{b} = {res}")

