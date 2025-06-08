import java.util.Scanner;

class QuizFutebol {

    public static class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";

        public boolean isCorreta(String resposta){
            if(resposta.equalsIgnoreCase(this.correta)){
                System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
                System.out.println("");
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                System.out.println("");
                return false;
            }
        }

        public String leiaResposta() {
            Scanner ler = new Scanner(System.in);
            String resp;
            do {
                System.out.println("Digite a resposta: ");
                resp = ler.next();
            } while (!respostaValida(resp));
            return resp;
        }

        private boolean respostaValida(String resp){
            if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                    resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
                return true;
            }
            System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
            System.out.println("");
            return false;
        }

        public void escrevaQuestao(){
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Questao[] quiz = new Questao[15];

        quiz[0] = new Questao();
        quiz[0].pergunta = "01) Qual foi o jogador mais caro do futebol em 2017?";
        quiz[0].opcaoA = "[A] Kylian Mbappe";
        quiz[0].opcaoB = "[B] Cristiano Ronaldo";
        quiz[0].opcaoC = "[C] Neymar Junior";
        quiz[0].opcaoD = "[D] Lionel Messi";
        quiz[0].opcaoE = "[E] Mohamed Salah";
        quiz[0].correta = "C";

        quiz[1] = new Questao();
        quiz[1].pergunta = "02) Qual o maior artilheiro das copas do mundo?";
        quiz[1].opcaoA = "[A] Ronaldo Fenômeno";
        quiz[1].opcaoB = "[B] Miroslav Klose";
        quiz[1].opcaoC = "[C] Lionel Messi";
        quiz[1].opcaoD = "[D] Pelé";
        quiz[1].opcaoE = "[E] Gerd Muller";
        quiz[1].correta = "B";

        quiz[2] = new Questao();
        quiz[2].pergunta = "03) No ano de 2009, foi criado um novo prêmio (Puskás). Quem ganhou o prêmio naquele ano?";
        quiz[2].opcaoA = "[A] Cristiano Ronaldo";
        quiz[2].opcaoB = "[B] Lionel Messi";
        quiz[2].opcaoC = "[C] Kaká";
        quiz[2].opcaoD = "[D] Ronaldinho";
        quiz[2].opcaoE = "[E] Roberto Carlos";
        quiz[2].correta = "A";

        quiz[3] = new Questao();
        quiz[3].pergunta = "04) Quem é o maior artilheiro da seleção brasileira?";
        quiz[3].opcaoA = "[A] Neymar Junior";
        quiz[3].opcaoB = "[B] Pelé";
        quiz[3].opcaoC = "[C] Ronaldo Fenômeno";
        quiz[3].opcaoD = "[D] Rivaldo";
        quiz[3].opcaoE = "[E] Romário";
        quiz[3].correta = "A";

        quiz[4] = new Questao();
        quiz[4].pergunta = "05) Em qual clube Maradona é mais ídolo?";
        quiz[4].opcaoA = "[A] Barcelona";
        quiz[4].opcaoB = "[B] Newell's Old Boys";
        quiz[4].opcaoC = "[C] Boca Juniors";
        quiz[4].opcaoD = "[D] Sevilla";
        quiz[4].opcaoE = "[E] Napoli";
        quiz[4].correta = "E";

        quiz[5] = new Questao();
        quiz[5].pergunta = "06) Qual o maior campeão da Champions League?";
        quiz[5].opcaoA = "[A] Liverpool";
        quiz[5].opcaoB = "[B] Milan";
        quiz[5].opcaoC = "[C] Barcelona";
        quiz[5].opcaoD = "[D] Real Madrid";
        quiz[5].opcaoE = "[E] Bayern de Munique";
        quiz[5].correta = "D";

        quiz[6] = new Questao();
        quiz[6].pergunta = "07) Quem é o maior artilheiro da história (gols oficiais)?";
        quiz[6].opcaoA = "[A] Messi";
        quiz[6].opcaoB = "[B] Cristiano Ronaldo";
        quiz[6].opcaoC = "[C] Romário";
        quiz[6].opcaoD = "[D] Ferenc Puskás";
        quiz[6].opcaoE = "[E] Josef Bican";
        quiz[6].correta = "B";

        quiz[7] = new Questao();
        quiz[7].pergunta = "08) Quais os três jogadores que marcaram 5 gols em uma só partida de Champions League?";
        quiz[7].opcaoA = "[A] Messi, Cristiano Ronaldo, Mbappé";
        quiz[7].opcaoB = "[B] Haaland, Messi, Suárez";
        quiz[7].opcaoC = "[C] Haaland, Messi, Luiz Adriano";
        quiz[7].opcaoD = "[D] Messi, Luiz Adriano, Mbappé";
        quiz[7].opcaoE = "[E] Haaland, Mbappé, Harry Kane";
        quiz[7].correta = "C";

        quiz[8] = new Questao();
        quiz[8].pergunta = "09) Qual jogador é conhecido por sua habilidade mágica em campo?";
        quiz[8].opcaoA = "[A] Zidane";
        quiz[8].opcaoB = "[B] Beckham";
        quiz[8].opcaoC = "[C] Figo";
        quiz[8].opcaoD = "[D] Eto'o";
        quiz[8].opcaoE = "[E] Ronaldinho";
        quiz[8].correta = "E";

        quiz[9] = new Questao();
        quiz[9].pergunta = "10) Qual time ganhou mais vezes o Campeonato Inglês?";
        quiz[9].opcaoA = "[A] Manchester United";
        quiz[9].opcaoB = "[B] Manchester City";
        quiz[9].opcaoC = "[C] Liverpool";
        quiz[9].opcaoD = "[D] Chelsea";
        quiz[9].opcaoE = "[E] Arsenal";
        quiz[9].correta = "A";

        quiz[10] = new Questao();
        quiz[10].pergunta = "11) Quais foram os dois finalistas da Champions League 2003/2004?";
        quiz[10].opcaoA = "[A] Porto e Arsenal";
        quiz[10].opcaoB = "[B] Shakhtar e Borussia";
        quiz[10].opcaoC = "[C] Bayern e Barcelona";
        quiz[10].opcaoD = "[D] Porto e Mônaco";
        quiz[10].opcaoE = "[E] Porto e Real";
        quiz[10].correta = "D";

        quiz[11] = new Questao();
        quiz[11].pergunta = "12) Qual time ganhou 6 títulos (sextete) em 2009?";
        quiz[11].opcaoA = "[A] Barcelona";
        quiz[11].opcaoB = "[B] Inter de Milão";
        quiz[11].opcaoC = "[C] Real Madrid";
        quiz[11].opcaoD = "[D] Liverpool";
        quiz[11].opcaoE = "[E] Manchester United";
        quiz[11].correta = "A";

        quiz[12] = new Questao();
        quiz[12].pergunta = "13) Qual país tem mais Copas do Mundo?";
        quiz[12].opcaoA = "[A] França";
        quiz[12].opcaoB = "[B] Alemanha";
        quiz[12].opcaoC = "[C] Argentina";
        quiz[12].opcaoD = "[D] Brasil";
        quiz[12].opcaoE = "[E] Itália";
        quiz[12].correta = "D";

        quiz[13] = new Questao();
        quiz[13].pergunta = "14) Onde foi disputada a última Copa do Mundo?";
        quiz[13].opcaoA = "[A] Rússia";
        quiz[13].opcaoB = "[B] Estados Unidos";
        quiz[13].opcaoC = "[C] Catar";
        quiz[13].opcaoD = "[D] Japão";
        quiz[13].opcaoE = "[E] Espanha";
        quiz[13].correta = "C";

        quiz[14] = new Questao();
        quiz[14].pergunta = "15) Onde será a próxima Copa do Mundo?";
        quiz[14].opcaoA = "[A] América do Norte";
        quiz[14].opcaoB = "[B] Argentina, Brasil e Equador";
        quiz[14].opcaoC = "[C] Espanha, França e Inglaterra";
        quiz[14].opcaoD = "[D] Japão, Coreia do Norte e Índia";
        quiz[14].opcaoE = "[E] Austrália, Irlanda do Norte e Noruega";
        quiz[14].correta = "A";

        int acertos = 0;

        for (Questao q : quiz) {
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) {
                acertos++;
            }
        }

        System.out.println("Você acertou " + acertos + " de " + quiz.length + " questões.");
    }
}
