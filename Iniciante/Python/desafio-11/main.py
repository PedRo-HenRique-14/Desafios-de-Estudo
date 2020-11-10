#CALCULO SIMPLES #1010

#Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

#Accepted

produto1 = input().split()
produto2 = input().split()

valor_a_pagar = float(produto1[1]) * float(produto1[2]) + float(produto2[1]) * float(produto2[2])

print("VALOR A PAGAR: R$ {:.2f}".format(valor_a_pagar))

