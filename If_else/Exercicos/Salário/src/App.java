public class App {
    public static void main(String[] args) throws Exception {
        
        double Salário_atual, aumento, Novo_Salário;

        Salário_atual = 2000;
        aumento = Salário_atual * 15/100;
        Novo_Salário = Salário_atual + aumento;

        System.out.println("O aumento foi de: R$" + aumento);
        System.out.println("O novo salário é de: R$" + Novo_Salário);

    

    }
}
