import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int senha = 1234;
        int Tentativa = 0;
        int cont = 0;

        do{
            System.out.println("Tente descobrir a minha senha e escape do loop!!!");
            Tentativa = leia.nextInt();
            if (Tentativa != senha) {
                System.out.printf(""" 
                    Você digitou %d. 
                    Você ERROU! Tente novamente\n""", Tentativa);
            }
            cont +=1;

        }while(Tentativa != senha);

        System.out.printf("""
            Parabéns você acertou!!!
            Para chegar nesse resultado você tentou %d vezes!
        
        """, cont);
        leia.close();
    }
}
