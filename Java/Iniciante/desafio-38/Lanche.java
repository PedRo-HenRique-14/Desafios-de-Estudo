import java.io.IOException;
import java.util.Scanner;
/* 
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
*/
public class Lanche {

    public static void main(String[] args) throws IOException {

        int id;
        int qtd;
        double total;
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        qtd = scanner.nextInt();
        if (id == 1) {
            // Cachorro quente R$4.00
            total = qtd * 4;
        } else if (id == 2) {
            // X-Salada R$4.50
            total = qtd * 4.5;
        } else if (id == 3) { 
            // X-Bacon R$5.00
            total = qtd * 5;
        } else if (id == 4) {
            // Torrada simples R$2.00
            total = qtd * 2;
        } else {
            // Refrigerante 1.5
            total = qtd * 1.5;
        }
        System.out.println(String.format("Total: R$ %.2f", total));
    }

}