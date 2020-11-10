#AREA #1012

#Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
#a) a área do triângulo retângulo que tem A por base e C por altura.
#b) a área do círculo de raio C. (pi = 3.14159)
#c) a área do trapézio que tem A e B por bases e C por altura.
#d) a área do quadrado que tem lado B.
#e) a área do retângulo que tem lados A e B.

#Wrong answer (5%)

entrada = input().split()

area_triangulo = float(entrada[0]) * float(entrada[2]) / 2

area_circulo = float(entrada[2])**2 * 3.14159

area_trapezio = (float(entrada[0]) + float(entrada[1])) * float(entrada[2]) / 2

area_quadrado = 4 * float(entrada[1])

area_retangulo = float(entrada[0]) * float(entrada[1])

print('''TRIANGULO: {:.3f}
CIRCULO: {:.3f}
TRAPEZIO: {:.3f}
QUADRADO: {:.3f}
RETANGULO: {:.3f}'''.format(area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo))

