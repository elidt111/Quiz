import java.util.Scanner;

public class Questao {
    String pergunta;
    String opcaoA;
    String opcaoB;
    String opcaoC;
    String opcaoD;
    String opcaoE;
    String correta;

    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println("A) " + this.opcaoA);
        System.out.println("B) " + this.opcaoB);
        System.out.println("C) " + this.opcaoC);
        System.out.println("D) " + this.opcaoD);
        System.out.println("E) " + this.opcaoE);
    }

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Resposta Correta! \n");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A correta era: " + this.correta + "\n");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Digite sua resposta (A, B, C, D ou E): ");
            resp = ler.next();
        } while (!validarResposta(resp));
        return resp;
    }

    private boolean validarResposta(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") ||
                resp.equalsIgnoreCase("C") || resp.equalsIgnoreCase("D") ||
                resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Opção inválida! Escolha entre A e E.");
        return false;
    }
}