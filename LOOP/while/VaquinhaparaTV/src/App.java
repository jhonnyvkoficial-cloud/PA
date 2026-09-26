import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        double objtv = 6634.05;
        double investimento = 0;
        double saldoAtual = 0;
        double restante = 0;
        
        System.out.printf("""
                Seja Bem-Vindo a sua caixinha Nubank!!
                Seu saldo atual é: R$%.2f.
                Seu objetivo é: R$%.2f

                """, saldoAtual, objtv);

        do{
            System.out.println("Quanto você deseja investir hoje?");
        investimento = inUser.nextDouble();
        saldoAtual += investimento;
        restante = objtv - saldoAtual;
        
        System.out.printf("""
                Seu saldo atual é: R$%.2f
                Seu objetivo é: R$%.2f
                Falta %.2f para alcançar o valor desejado.
                \n""", saldoAtual, objtv, restante);

        }while(saldoAtual < objtv);

        System.out.printf("""
                Você atingiu seu objetivo!!!
                Seu saldo atual é: R$%.2f.
                """, saldoAtual);

        inUser.close();
    }
}