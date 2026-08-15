public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operadores lógicos\n");

    
        double nota = 6;
        int frequencia = 70;
        boolean res;

        /*
        Operador "and &&" as duas condições devem se verdadeiras
         Operador "or ||" pelo menos 1 condição deve ser verdadeira
         Operador "not ! " nega a saida
        */

         System.out.println("Operador é: ");
         res = (nota >=6 && frequencia >=75);
         System.out.println(res);

         System.out.println("\n Operador ou: ");
         res = (nota >=4 || frequencia >=75);
         System.out.println(res);


         System.out.println("Operador not: ");

         System.out.println(res);
         System.out.println(!res);
         System.out.println(!(!res));
    }
}
