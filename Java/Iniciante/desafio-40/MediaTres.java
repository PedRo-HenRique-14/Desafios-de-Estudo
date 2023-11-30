import java.io.IOException;
import java.util.Scanner;

/*
 * Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.". No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.
 * <ATENÇÂO> Esse desafio apresenta um erro devido a maneira como a média ponderada é arredondada, dependendo da linguagem. No segundo exemplo, a média deveria fechar 4.8, mas na linguagem java ela é arredondada para 4.9. Isso acontece devido ao fato da média ser 4.85, e como a ultima casa decimal é ocultada, ele é arredondado para cima (4.9).
 */

 public class MediaTres {

    public static void main(String[] args) throws IOException {

        double note1, note2, note3, note4, examNote, media, finalMedia;
        String msg, examMsg;
        Scanner scanner = new Scanner(System.in);
        note1 = scanner.nextDouble();
        note2 = scanner.nextDouble();
        note3 = scanner.nextDouble();
        note4 = scanner.nextDouble();
        note1 *= 2;
        note2 *= 3;
        note3 *= 4;
        media = (note1 + note2 + note3 + note4)/10;
        if (media >= 7) {
            msg = "Aluno aprovado.";
            System.out.println(String.format("Media: %.1f\n%s", media, msg));
        } else if (media >= 5 && media <= 6.9) {
            msg = "Aluno em exame.";
            examNote = scanner.nextDouble();
            finalMedia = (media + examNote) / 2;
            if (finalMedia >= 5) {
                examMsg = "Aluno aprovado.";
            } else {
                examMsg = "Aluno reprovado.";
            }
            System.out.println(String.format("Media: %.1f\n%s\nNota do exame: %.1f\n%s\nMedia final: %.1f", media, msg, examNote, examMsg, finalMedia));
        } else {
            msg = "Aluno reprovado.";
            System.out.println(String.format("Media: %.1f\n%s", media, msg));
        }

    }

 }