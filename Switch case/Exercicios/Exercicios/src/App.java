import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner inUser = new Scanner(System.in);

         System.out.println("""
                 Seja bem vindo a nossa barraca de Frutas!

                 Informe qual fruta você quer levar hoje:

                 1-Maçã
                 2-Banana
                 3-Laranja

                 """);

                 int frutas = inUser.nextInt();

                 switch (frutas) {
                    case 1:{
                        System.out.printf("Você escolheu %d. A fruta é Maçã", frutas);
                    }
                    break;
                    case 2:{
                        System.out.printf("Você escolheu %d. A fruta é Banana", frutas);
                    }
                    break;
                    case 3:{
                        System.out.printf("Você escolheu %d. A fruta é Laranja", frutas);
                    }
                    break;
                 
                    default:{
                        System.out.println("Essa fruta está indisponivel\n");
                    }
                 }
        inUser.close();
    }
}
