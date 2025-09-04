def puissance(a, b):
    if not isinstance(a, int) or not isinstance(b, int):
        raise TypeError("Only integers are allowed")
    if a == 0 and b < 0:
        raise Exception("0 à une puissance négative est indéfini")
    if b == 0:
        return 1
    if b < 0:
      resultat = 1
    for _ in range(b):
        resultat *= a
    return 1 / resultat
    if b > 0:
      resultat = 1
    for _ in range(b):
        resultat *= a
    return resultat
