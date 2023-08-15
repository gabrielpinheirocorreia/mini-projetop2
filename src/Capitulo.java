import java.util.Scanner;
import java.util.ArrayList;

private class Capitulo   {

   private String script;
    private String nomeCapitulo;
    int escolha1;
    int escolha2;
    Personagem personagem;
    int alteracaoEnergia;
    int escolher;
    String escolhas []; 
    String nome;
    String texto;
    String proximo;
/**
 * @param nomeCapitulo
 * @param script
 * @param escolha1
 * @param escolha2
 * @param Personagem
 * @param alteracaoEnergia
 * @param escolher
 */
public Capitulo (String nomeCapitulo, String script,
 int escolha1, int escolha2, String Personagem, int alteracaoEnergia, String escolhas [])   {
   
    this.nomeCapitulo = nomeCapitulo;
    this.script = script;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
    this.personagem = personagem;
    this.alteracaoEnergia = alteracaoEnergia;
    this.escolher = escolher;
}

public Capitulo(String string, String string2) {
}

public Capitulo(String nomeCapitulo2, String script2, String string, String string2, Personagem personagem2,
        int alteracaoEnergia2) {
}

public void mostrar() {

    System.out.println("Nome: " + nome);
        System.out.println("Texto: " + texto);

        if (escolhas.length < 0) {
            System.out.println("Escolhas:");
            for (int i = 0; i < escolhas.length; i++) {
                System.out.println((i + 1) + ". " + escolhas[i]);

        System.out.println("digite o nome do seu personagem " + nomeCapitulo);
        System.out.println("As crianças decidiram seguir a trilha pelo rio." + script);
        System.out.println("Escolha 1: Remar na canoa. " + escolha1);
        System.out.println("Escolha 2: Caminhar pela margem do rio. " + escolha2);
        personagem.setEnergia(personagem.getEnergia() + alteracaoEnergia);
            }
        }
    }
/**
 * @param scanner
 * 
 * metodo para as escolhas
 */
public int escolhermetodo () {
    Scanner scanner = new Scanner(System.in);
    int escolha;

    do {
        System.out.print("Digite sua escolha (1 a " + escolhas.length + "): ");
        escolha = scanner.nextInt();
    } while (escolha < 1 || escolha > escolhas.length);

    return escolha - 1;
}
public static void etapa1(Scanner scanner) {
    Personagem personagem = new Personagem("João", 100);
    Capitulo capitulo1 = new Capitulo ("Etapa 1", "As crianças, João e Maria," +
    " estão no sertão e precisam escolher o caminho para chegar à cidade grande.",
            "Seguir a trilha pelo rio", "Seguir o caminho pelo deserto", personagem, -10);

    capitulo1.mostrar();
    int escolha = capitulo1.escolher();

    if (escolha == 1) {
        MiniProjeto.etapa2a(scanner, personagem);
    } else {
        MiniProjeto.etapa2b(scanner, personagem);
    }
}

public int escolher() {
    return 0;
}


void executar () {

    this.mostrar();
    int idEscolha = this.escolher();

    if (idEscolha != -1) {
        Escolha escolha = this.escolhas.get(idEscolha);
        escolha.proximo.executar();
    }
    else {
        System.out.println("Escolha outra opção!");
    }
}
}
