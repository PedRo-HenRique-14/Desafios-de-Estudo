#AREA DO CIRCULO #1002

#A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

#- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

#Accepted

from math import sqrt

raio = float(input())
π = 3.14159

area = raio**2 * π

print("A={:.4f}".format(area))