public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operadores aritiméticos");

        int num1, num2, soma;
        num1 = 100;
        num2 = 10;
        soma = num1 + num2;
        System.out.println("A soma dos valores é: " +  soma);
        System.out.println("Subtração é: " + (num1 - num2));
        System.out.println("Multiplicação é: " + (num1 * num2));
        System.out.println("Divisão é: " + (num1 / num2));
        System.out.println("Porcentagem é: " + (num1*(num2/100)));
        System.out.println("MOD = (Resto da divisão) é: " + (num1 % num2));
    }
}
