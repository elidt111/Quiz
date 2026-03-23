public class Quiz {
  public static void main(String[] args) {
    Cabecalho.exibir(); // [cite: 5]

    int totalAcertos = 0;
    int totalQuestoes = 15; // [cite: 6]
    Questao[] listaQuestoes = new Questao[totalQuestoes];

    // Inicialização das questões (Exemplo das 3 primeiras)
    listaQuestoes[0] = criarQuestao("1. Quem é o pai de Luke Skywalker?", "Obi-Wan Kenobi", "Han Solo", "Darth Vader", "Yoda", "Mace Windu", "C");
    listaQuestoes[1] = criarQuestao("2. Qual é o nome da nave de Han Solo?", "Star Destroyer", "X-Wing", "Millennium Falcon", "TIE Fighter", "Ghost", "C");
    listaQuestoes[2] = criarQuestao("3. Qual é a arma característica dos Jedi?", "Blaster", "Sabre de luz", "Lança elétrica", "Canhão de plasma", "Arco laser", "B");
    listaQuestoes[3] = criarQuestao("4. Quem treinou Anakin Skywalker quando ele era criança?", "Yoda", "Qui-Gon Jinn", "Obi-Wan Kenobi", "Mace Windu", "Palpatine", "C");
    listaQuestoes[4] = criarQuestao("5. Qual é o nome do planeta natal de Luke?", "Naboo", "Coruscant", "Endor", "Tatooine", "Hoth", "D");
    listaQuestoes[5] = criarQuestao("6. Quem é o Imperador Sith?", "Darth Maul", "Darth Tyranus", "Darth Sidious", "Darth Bane", "Darth Plagueis", "C");
    listaQuestoes[6] = criarQuestao("7. Qual dessas espécies é Yoda?", "Twi'lek", "Wookiee", "Desconhecida", "Rodian", "Zabrak", "C");
    listaQuestoes[7] = criarQuestao("8. Qual é o nome da irmã de Luke?", "Padmé", "Rey", "Leia", "Ahsoka", "Jyn", "C");
    listaQuestoes[8] = criarQuestao("9. Quem matou Obi-Wan Kenobi?", "Darth Maul", "Darth Vader", "Palpatine", "Boba Fett", "Kylo Ren", "B");
    listaQuestoes[9] = criarQuestao("10. O que a Estrela da Morte faz?", "Cria exércitos", "Controla a mente", "Destrói planetas", "Viaja no tempo", "Cria clones", "C");
    listaQuestoes[10] = criarQuestao("11. Quem é o mestre de Obi-Wan Kenobi?", "Yoda", "Mace Windu", "Qui-Gon Jinn", "Anakin Skywalker", "Count Dooku", "C");
    listaQuestoes[11] = criarQuestao("12. Qual é o nome do filho de Han Solo e Leia?", "Luke", "Ben Solo", "Finn", "Ezra", "Poe", "B");
    listaQuestoes[12] = criarQuestao("13. Quem derrotou Darth Maul em 'A Ameaça Fantasma'?", "Obi-Wan Kenobi", "Qui-Gon Jinn", "Yoda", "Anakin", "Mace Windu", "A");
    listaQuestoes[13] = criarQuestao("14. Qual desses personagens é um caçador de recompensas?", "Chewbacca", "Boba Fett", "Lando", "C-3PO", "R2-D2", "B");
    listaQuestoes[14] = criarQuestao("15. Qual é o nome da ordem dos usuários do lado sombrio?", "Jedi", "Mandalorianos", "Sith", "Clones", "Rebeldes", "C");

    // Loop de execução [cite: 16]
    for (Questao q : listaQuestoes) {
      q.escrevaQuestao();
      String resposta = q.leiaResposta();
      if (q.isCorreta(resposta)) {
        totalAcertos++;
      }
    }

    // Resultados Finais
    double media = (double) totalAcertos / totalQuestoes * 10;
    System.out.println("--------------------------------------------------");
    System.out.println("RESULTADO FINAL:");
    System.out.println("Você acertou " + totalAcertos + " de " + totalQuestoes + " questões.");
    System.out.printf("Sua média de acertos foi: %.2f\n", media);
    System.out.println("Obrigado por participar do Quiz!");
    System.out.println("--------------------------------------------------");
  }

  // Método auxiliar para facilitar a criação dos objetos
  public static Questao criarQuestao(String p, String a, String b, String c, String d, String e, String cor) {
    Questao q = new Questao();
    q.pergunta = p; q.opcaoA = a; q.opcaoB = b; q.opcaoC = c; q.opcaoD = d; q.opcaoE = e; q.correta = cor;
    return q;
  }
}