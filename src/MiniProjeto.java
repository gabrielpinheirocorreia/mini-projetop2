import static java.lang.System.in;
import java.util.Scanner;

public class MiniProjeto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        iniciar(sc);
    }

    /**
     * @param scanner
     */
    public static void iniciar(Scanner scanner) {
        System.out.println("Bem-vindo ao Running to the Dream: Aventura do Sertão à Cidade Grande!");
        System.out.println("Duas crianças estão prestes a embarcar em uma emocionante jornada. Vamos começar!");
        System.out.println();
        Capitulo.etapa1(scanner);
    }
    public static void etapa2a(Scanner scanner, Personagem personagem) {
        Capitulo capitulo2a = new Capitulo("Etapa 2a", "As crianças decidiram seguir a trilha pelo rio.",
                "Remar na canoa", "Caminhar pela margem do rio", personagem, -5);

        capitulo2a.mostrar();
        int escolha = capitulo2a.escolher();

        if (escolha == 1) {
            etapa3a1(personagem);
        } else {
            etapa3a2(scanner, personagem);
        }
    }

    public static void etapa2b(Scanner scanner, Personagem personagem) {
        Capitulo capitulo2b = new Capitulo("Etapa 2b", "As crianças decidiram seguir o caminho pelo deserto.",
                "Virar à direita", "Virar à esquerda", personagem, -8);

        capitulo2b.mostrar();
        int escolha = capitulo2b.escolher();

        if (escolha == 1) {
            etapa3b1(personagem);
        } else {
            etapa3b2(personagem);
        }
    }

    @Override
    public String toString() {
        return "MiniProjeto []";
    }
    /**
     * @param personagem
     */
    public static void etapa3a1(Personagem personagem) {
    Capitulo capitulo3a1 = new Capitulo("Etapa 3a1", "As crianças decidiram remar na canoa.",
            "Pular a cachoeira", "Voltar e procurar outro caminho", personagem, -15);

    capitulo3a1.mostrar();
    int escolha = capitulo3a1.escolher();

    if (escolha == 1) {
        finalFeliz();
    } else {
        finalTriste();
    }
}

private static void finalFeliz() {
    System.out.println("Você chegou à cidade grande!!!!! ");
    }

public static void etapa3a2(Scanner scanner, Personagem personagem) {
    Capitulo capitulo3a2 = new Capitulo("Etapa 3a2", "As crianças decidiram caminhar pela margem do rio.",
            "Pular a ponte quebrada", "Voltar e procurar outro caminho", personagem, -12);

    capitulo3a2.mostrar();
    int escolha = capitulo3a2.escolher();

    if (escolha == 1) {
        finalTriste();
    } else {
        etapa1(scanner);
    }
}

private static void finalTriste() {
    System.out.println ("Você vai ter que voltar :( ");

}

public static void etapa3b1(Personagem personagem) {
    Capitulo capitulo3b1 = new Capitulo("Etapa 3b1", "As crianças decidiram virar à direita.",
            "Descansar no oásis", "Continuar a jornada", personagem, -7);

    capitulo3b1.mostrar();
    int escolha = capitulo3b1.escolher();

    if (escolha == 1) {
        finalTriste();
    } else {
        finalFeliz();
    }
}

public static void etapa3b2(Personagem personagem) {
    Capitulo capitulo3b2 = new Capitulo("Etapa 3b2", "As crianças decidiram virar à esquerda.",
            "Aceitar a ajuda do guia", "Recusar a ajuda do guia", personagem, 10);

    capitulo3b2.mostrar();
    int escolha = capitulo3b2.escolher();

    if (escolha == 1) {
        finalFeliz();
    } else {
        finalTriste();
    }
}


}
