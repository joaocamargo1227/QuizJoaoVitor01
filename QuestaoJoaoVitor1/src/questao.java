import java.util.Scanner;

class Trabalho1 {
    public static void main(String[] args) {
        System.out.println("Faculdade: Unifan.");
        System.out.println("Aluno: Joao Vitor Alves Camargo.");
        System.out.println("Professor: Brenno.");
        System.out.println("          Quiz Futebol          ");

        int pontuacao = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("01)Qual foi o jogador mais caro do futebol em 2017?");
        System.out.println("Alternativa");
        System.out.println("[A] Kylian Mbappe");
        System.out.println("[B] Cristiano Ronaldo");
        System.out.println("[C] Neymar Junior");
        System.out.println("[D] Lionel Messi");
        System.out.println("[E] Mohamed Salah");
        System.out.print("Digite sua resposta: ");
        String resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("02)Qual o maior artilheiro das copas do mundo?");
        System.out.println("Alternativa");
        System.out.println("[A] Ronaldo Fenômeno");
        System.out.println("[B] Miroslav Klose");
        System.out.println("[C] Lionel Messi");
        System.out.println("[D] Pelé");
        System.out.println("[E] Gerd Muller");
        System.out.print("Digite sua resposta: ");
        String resposta2 = scanner.nextLine();
        if(resposta2.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("03)No ano de 2009, foi criado um novo premio (Puskas)... Quem ganhou?");
        System.out.println("Alternativa");
        System.out.println("[A] Cristiano Ronaldo");
        System.out.println("[B] Lionel Messi");
        System.out.println("[C] Kaká");
        System.out.println("[D] Ronaldinho");
        System.out.println("[E] Roberto Carlos");
        System.out.print("Digite sua resposta: ");
        String resposta3 = scanner.nextLine();
        if(resposta3.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("04)Quem é o maior artilheiro da seleção brasileira?");
        System.out.println("Alternativa");
        System.out.println("[A] Neymar Junior");
        System.out.println("[B] Pelé");
        System.out.println("[C] Ronaldo Fenômeno");
        System.out.println("[D] Rivaldo");
        System.out.println("[E] Romário");
        System.out.print("Digite sua resposta: ");
        String resposta4 = scanner.nextLine();
        if(resposta4.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("05)Maradona é ídolo de qual clube?");
        System.out.println("Alternativa");
        System.out.println("[A] Barcelona");
        System.out.println("[B] Newell´s Old Boys");
        System.out.println("[C] Boca Juniors");
        System.out.println("[D] Sevilla");
        System.out.println("[E] Napoli");
        System.out.print("Digite sua resposta: ");
        String resposta5 = scanner.nextLine();
        if(resposta5.equalsIgnoreCase("e")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("06)Qual o maior campeão da Champions League?");
        System.out.println("Alternativa");
        System.out.println("[A] Liverpool");
        System.out.println("[B] Milan");
        System.out.println("[C] Barcelona");
        System.out.println("[D] Real Madrid");
        System.out.println("[E] Bayern de Munique");
        System.out.print("Digite sua resposta: ");
        String resposta6 = scanner.nextLine();
        if(resposta6.equalsIgnoreCase("d")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("07)Quem é o maior artilheiro da história (gols oficiais)?");
        System.out.println("Alternativa");
        System.out.println("[A] Messi");
        System.out.println("[B] Cristiano Ronaldo");
        System.out.println("[C] Romario");
        System.out.println("[D] Ferenc Puskas");
        System.out.println("[E] Josef Bican");
        System.out.print("Digite sua resposta: ");
        String resposta7 = scanner.nextLine();
        if(resposta7.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("08)Quem marcou 5 gols em uma só partida de Champions?");
        System.out.println("Alternativa");
        System.out.println("[A] Messi, Cristiano Ronaldo, Mbappe");
        System.out.println("[B] Haaland, Messi, Suárez");
        System.out.println("[C] Haaland, Messi, Luiz Adriano");
        System.out.println("[D] Messi, Luiz Adriano, Mbappe");
        System.out.println("[E] Haaland, Mbappe, Harry Kane");
        System.out.print("Digite sua resposta: ");
        String resposta8 = scanner.nextLine();
        if(resposta8.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("09)Qual jogador é conhecido por fazer 'mágica' em campo?");
        System.out.println("Alternativa");
        System.out.println("[A] Zidane");
        System.out.println("[B] Beckham");
        System.out.println("[C] Figo");
        System.out.println("[D] Eto'o");
        System.out.println("[E] Ronaldinho");
        System.out.print("Digite sua resposta: ");
        String resposta9 = scanner.nextLine();
        if(resposta9.equalsIgnoreCase("e")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("10)Qual time tem mais títulos do campeonato inglês?");
        System.out.println("Alternativa");
        System.out.println("[A] Manchester United");
        System.out.println("[B] Manchester City");
        System.out.println("[C] Liverpool");
        System.out.println("[D] Chelsea");
        System.out.println("[E] Arsenal");
        System.out.print("Digite sua resposta: ");
        String resposta10 = scanner.nextLine();
        if(resposta10.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("11)Final da Champions 2003/2004?");
        System.out.println("Alternativa");
        System.out.println("[A] Porto e Arsenal");
        System.out.println("[B] Shakhtar e Borussia");
        System.out.println("[C] Bayern e Barcelona");
        System.out.println("[D] Porto e Monaco");
        System.out.println("[E] Porto e Real");
        System.out.print("Digite sua resposta: ");
        String resposta11 = scanner.nextLine();
        if(resposta11.equalsIgnoreCase("d")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("12)Qual time ganhou 6 títulos (sextete) em 2009?");
        System.out.println("Alternativa");
        System.out.println("[A] Barcelona");
        System.out.println("[B] Inter de Milão");
        System.out.println("[C] Real Madrid");
        System.out.println("[D] Liverpool");
        System.out.println("[E] Manchester United");
        System.out.print("Digite sua resposta: ");
        String resposta12 = scanner.nextLine();
        if(resposta12.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("13)Qual país tem mais Copas do Mundo?");
        System.out.println("Alternativa");
        System.out.println("[A] França");
        System.out.println("[B] Alemanha");
        System.out.println("[C] Argentina");
        System.out.println("[D] Brasil");
        System.out.println("[E] Itália");
        System.out.print("Digite sua resposta: ");
        String resposta13 = scanner.nextLine();
        if(resposta13.equalsIgnoreCase("d")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("14)Onde foi a última Copa do Mundo?");
        System.out.println("Alternativa");
        System.out.println("[A] Rússia");
        System.out.println("[B] Estados Unidos");
        System.out.println("[C] Qatar");
        System.out.println("[D] Japão");
        System.out.println("[E] Espanha");
        System.out.print("Digite sua resposta: ");
        String resposta14 = scanner.nextLine();
        if(resposta14.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        System.out.println("15)Onde será a próxima Copa do Mundo?");
        System.out.println("Alternativa");
        System.out.println("[A] América do Norte");
        System.out.println("[B] Argentina, Brasil e Equador");
        System.out.println("[C] Espanha, França e Inglaterra");
        System.out.println("[D] Japão, Coreia do Norte e Índia");
        System.out.println("[E] Austrália, Irlanda do Norte e Noruega");
        System.out.print("Digite sua resposta: ");
        String resposta15 = scanner.nextLine();
        if(resposta15.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada!");
        }

        // Exibe pontuação final
        System.out.println("\nVocê acertou " + pontuacao + " de 15 questões.");
    }
}
