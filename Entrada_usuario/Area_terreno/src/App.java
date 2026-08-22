import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        double largura, comprimento, área;

        System.out.println("Seja Bem vindo a nossa loja");

        System.out.println("Qual a largura do terreno?");
        largura = inUser.nextDouble();

        System.out.println("Qual a comprimento do terreno?");
        comprimento = inUser.nextDouble();

        área = largura*comprimento;

   System.out.printf("Você informou que a largura é: %.2f m, e o comprimento é: %.2f m. A área do terreno é %.2f m. \n" , largura, comprimento, área);

   /* 
   Para as saídas formatadas ultilize
   %d para inteiros
   %s para textos String
   %f para numeros fracionados
   %b para bleanos
   %c para caracteres

   Ultilize System.out.printf

   Uttilize System.out.printf("%.2f" , largura)

   */




        inUser.close();
    }
}
