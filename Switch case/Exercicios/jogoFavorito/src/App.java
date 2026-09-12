import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner inUser = new Scanner(System.in);

        System.out.println("""
                Bem vindo a nossa loja de jogos!

                Qual jogo você gostaria de leva hoje?

                1-Minecraft
                2-Fifa
                3-Fortnite
                4-Call of Duty
                5-The Sims
                """);

                int Jogo = inUser.nextInt();

                switch(Jogo){
                    case 1:{
                        System.out.printf("Você escolheu o %d. O jogo é Minecraft \n", Jogo);
                }
                break;
                case 2:{
                        System.out.printf("Você escolheu o %d. O jogo é Fifa \n", Jogo);
                }
                break;
                case 3:{
                        System.out.printf("Você escolheu o %d. O jogo é Fortnite \n", Jogo);
                }
                break;
                case 4:{
                        System.out.printf("Você escolheu o %d. O jogo é Call of Duty \n", Jogo);
                }
                break;
                case 5:{
                        System.out.printf("Você escolheu o %d. O jogo é The Sims \n", Jogo);
                }
                break;
                default:{
                    System.out.println("Não temos esse jogo em nossa loja \n");
                }
                }
       
        inUser.close();
    }
}
