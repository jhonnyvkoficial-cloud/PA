import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private static PrintStream printf;

    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        double onibusu, metro, trem, onibusr;
     onibusu = 4.40;
     metro = 5.00;
     trem = 6.50;
     onibusr = 12.00;
     

        System.out.println("""
                Bem vindo a compra de bilhetes de Transportes Públicos!!!

                Qual você bilhete deseja comprar hoje?

                1- Ônibus Urbano
                2- Metrô
                3- Trem Intermunicipal
                4- Ônibus Rodoviários

                """); 

            int bilhete = inUser.nextInt();

            switch (bilhete) {
                case 1:{
                    System.out.printf("A passagem escolhida foi a %d. É o Ônibus Urbano \n", bilhete);
                    printf = System.out.printf("O preço do Ônibus Urbano é " + onibusu);
                }
                break;
                case 2:{
                    System.out.printf("A passagem escolhida foi a %d. É o Metrô \n", bilhete);
                    printf = System.out.printf("O preço do Metrô é " + metro);
                }
                break;    
                case 3:{
                    System.out.printf("A passagem escolhida foi a %d. É o Trem Intermunicipal \n", bilhete);
                    printf = System.out.printf("O preço do Trem Irtermunicipal é " + trem);
                }
                break;    
                case 4:{
                    System.out.printf("A passagem escolhida foi a %d. É o Ônibus Rodoviário \n", bilhete);
                    printf = System.out.printf("O preço do Ônibus Rodoviário é " + onibusr);
                }
                break;
                default:{
                    System.out.println("Não temos esse tipo de bilhete");
                }        
                 
            }
        
        inUser.close();


            

            
    
    }
}

