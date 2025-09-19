import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QuizFutebol {

    public static class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";

        public boolean isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("✅ Parabéns, resposta Correta! - Letra: " + this.correta);
                System.out.println();
                return true;
            } else {
                System.out.println("❌ Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                System.out.println();
                return false;
            }
        }

        public String leiaResposta() {
            Scanner ler = new Scanner(System.in);
            String resp;
            do {
                System.out.print("Digite a resposta: ");
                resp = ler.next();
            } while (!respostaValida(resp));
            return resp;
        }

        private boolean respostaValida(String resp) {
            if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                    resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
                return true;
            }
            System.out.println("Resposta inválida! Digite opção A, B, C, D ou E.");
            System.out.println();
            return false;
        }

        public void escrevaQuestao() {
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
        Queue<Questao> filaQuestoes = new LinkedList<>();

        // Criando 15 questões
        Questao q1 = new Questao();
        q1.pergunta = "Qual país venceu a Copa do Mundo de 2002?";
        q1.opcaoA = "A) Brasil";
        q1.opcaoB = "B) Alemanha";
        q1.opcaoC = "C) França";
        q1.opcaoD = "D) Argentina";
        q1.opcaoE = "E) Itália";
        q1.correta = "A";
        filaQuestoes.add(q1);

        Questao q2 = new Questao();
        q2.pergunta = "Quem é considerado o 'Rei do Futebol'?";
        q2.opcaoA = "A) Maradona";
        q2.opcaoB = "B) Pelé";
        q2.opcaoC = "C) Messi";
        q2.opcaoD = "D) Ronaldo Fenômeno";
        q2.opcaoE = "E) Cruyff";
        q2.correta = "B";
        filaQuestoes.add(q2);

        Questao q3 = new Questao();
        q3.pergunta = "Qual clube brasileiro é conhecido como 'Mengão'?";
        q3.opcaoA = "A) Palmeiras";
        q3.opcaoB = "B) Corinthians";
        q3.opcaoC = "C) Flamengo";
        q3.opcaoD = "D) Santos";
        q3.opcaoE = "E) Vasco";
        q3.correta = "C";
        filaQuestoes.add(q3);

        Questao q4 = new Questao();
        q4.pergunta = "Quem fez o 'gol de mão de Deus' em 1986?";
        q4.opcaoA = "A) Zidane";
        q4.opcaoB = "B) Pelé";
        q4.opcaoC = "C) Maradona";
        q4.opcaoD = "D) Romário";
        q4.opcaoE = "E) Ronaldinho";
        q4.correta = "C";
        filaQuestoes.add(q4);

        Questao q5 = new Questao();
        q5.pergunta = "Quantos jogadores um time deve ter em campo?";
        q5.opcaoA = "A) 9";
        q5.opcaoB = "B) 10";
        q5.opcaoC = "C) 11";
        q5.opcaoD = "D) 12";
        q5.opcaoE = "E) 13";
        q5.correta = "C";
        filaQuestoes.add(q5);

        Questao q6 = new Questao();
        q6.pergunta = "Qual seleção venceu a Copa de 2014?";
        q6.opcaoA = "A) Brasil";
        q6.opcaoB = "B) Alemanha";
        q6.opcaoC = "C) Argentina";
        q6.opcaoD = "D) Espanha";
        q6.opcaoE = "E) Holanda";
        q6.correta = "B";
        filaQuestoes.add(q6);

        Questao q7 = new Questao();
        q7.pergunta = "Quem é o maior artilheiro da história da Seleção Brasileira?";
        q7.opcaoA = "A) Ronaldo Fenômeno";
        q7.opcaoB = "B) Neymar";
        q7.opcaoC = "C) Pelé";
        q7.opcaoD = "D) Romário";
        q7.opcaoE = "E) Zico";
        q7.correta = "B";
        filaQuestoes.add(q7);

        Questao q8 = new Questao();
        q8.pergunta = "Onde fica o estádio que é conhecido como 'Maracanã'?";
        q8.opcaoA = "A) São Paulo";
        q8.opcaoB = "B) Rio de Janeiro";
        q8.opcaoC = "C) Belo Horizonte";
        q8.opcaoD = "D) Recife";
        q8.opcaoE = "E) Salvador";
        q8.correta = "B";
        filaQuestoes.add(q8);

        Questao q9 = new Questao();
        q9.pergunta = "Quem ganhou a Bola de Ouro em 2021?";
        q9.opcaoA = "A) Lewandowski";
        q9.opcaoB = "B) Messi";
        q9.opcaoC = "C) Cristiano Ronaldo";
        q9.opcaoD = "D) Mbappé";
        q9.opcaoE = "E) Salah";
        q9.correta = "B";
        filaQuestoes.add(q9);

        Questao q10 = new Questao();
        q10.pergunta = "Qual time é conhecido como 'Galo'?";
        q10.opcaoA = "A) Internacional";
        q10.opcaoB = "B) Atlético Mineiro";
        q10.opcaoC = "C) Grêmio";
        q10.opcaoD = "D) Bahia";
        q10.opcaoE = "E) Botafogo";
        q10.correta = "B";
        filaQuestoes.add(q10);

        Questao q11 = new Questao();
        q11.pergunta = "Quem é conhecido como 'Fenômeno'?";
        q11.opcaoA = "A) Ronaldinho";
        q11.opcaoB = "B) Rivaldo";
        q11.opcaoC = "C) Ronaldo Fenômeno";
        q11.opcaoD = "D) Romário";
        q11.opcaoE = "E) Cafu";
        q11.correta = "C";
        filaQuestoes.add(q11);

        Questao q12 = new Questao();
        q12.pergunta = "Em que ano o Brasil conquistou sua primeira Copa do Mundo?";
        q12.opcaoA = "A) 1950";
        q12.opcaoB = "B) 1954";
        q12.opcaoC = "C) 1958";
        q12.opcaoD = "D) 1962";
        q12.opcaoE = "E) 1970";
        q12.correta = "C";
        filaQuestoes.add(q12);

        Questao q13 = new Questao();
        q13.pergunta = "Qual seleção tem mais títulos da Copa do Mundo?";
        q13.opcaoA = "A) Brasil";
        q13.opcaoB = "B) Alemanha";
        q13.opcaoC = "C) Itália";
        q13.opcaoD = "D) Argentina";
        q13.opcaoE = "E) França";
        q13.correta = "A";
        filaQuestoes.add(q13);

        Questao q14 = new Questao();
        q14.pergunta = "Qual é o time brasileiro com mais títulos da Libertadores?";
        q14.opcaoA = "A) São Paulo";
        q14.opcaoB = "B) Santos";
        q14.opcaoC = "C) Palmeiras";
        q14.opcaoD = "D) Grêmio";
        q14.opcaoE = "E) Flamengo";
        q14.correta = "C";
        filaQuestoes.add(q14);

        Questao q15 = new Questao();
        q15.pergunta = "Quem marcou os dois gols da final do Brasil em 2002?";
        q15.opcaoA = "A) Ronaldinho";
        q15.opcaoB = "B) Rivaldo";
        q15.opcaoC = "C) Ronaldo Fenômeno";
        q15.opcaoD = "D) Cafu";
        q15.opcaoE = "E) Kaká";
        q15.correta = "C";
        filaQuestoes.add(q15);

        int acertos = 0;
        int erros = 0;

        // Execução do quiz
        while (!filaQuestoes.isEmpty()) {
            Questao atual = filaQuestoes.poll();
            atual.escrevaQuestao();
            String resposta = atual.leiaResposta();

            if (atual.isCorreta(resposta)) {
                acertos++;
            } else {
                erros++;
            }
        }

        // Estatísticas finais
        int total = acertos + erros;
        double percentual = (acertos * 100.0) / total;

        System.out.println("=== RESULTADO FINAL ===");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
        System.out.printf("Percentual de acertos: %.2f%%\n", percentual);
    }
}
