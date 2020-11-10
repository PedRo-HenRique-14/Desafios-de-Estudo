#SALARIO #1008

#Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

#Accepted

numero = int(input())
horas = int(input())
salario_por_hora = float(input())

salario = horas * salario_por_hora

print("NUMBER = {}".format(numero))
print("SALARY = U$ {:.2f}".format(salario))