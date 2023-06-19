import java.util.Scanner;

public class MiniProjeto {
    public static void main(String[] args) {
        
        iniciar();
    }
    public static void iniciar() {
        System.out.println("Bem-vindo ao Running to the Dream: Aventura do Sertão à Cidade Grande!");
        System.out.println("Duas crianças estão prestes a embarcar em uma emocionante jornada. Vamos começar!");
        System.out.println();
        etapa1();
    }
    public static void etapa1() {
        System.out.println("Etapa 1:");
        System.out.println("As crianças, João e Maria, estão no sertão e precisam escolher o caminho para chegar à cidade grande.");
        System.out.println("Escolha o caminho:");
        System.out.println("1. Seguir a trilha pelo rio.");
        System.out.println("2. Seguir o caminho pelo deserto.");

        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            etapa2a();
        } else if (escolha.equals("2")) {
            etapa2b();
        } else {
            System.out.println("Opção inválida. Por favor, escolha novamente.");
            etapa1();
        }
    }

    public static void etapa2a() {
        System.out.println("Etapa 2a:");
        System.out.println("As crianças decidiram seguir a trilha pelo rio.");
        System.out.println("Elas encontram uma pequena canoa e podem escolher remar ou caminhar pela margem.");
        System.out.println("Escolha o que fazer:");
        System.out.println("1. Remar na canoa.");
        System.out.println("2. Caminhar pela margem do rio.");

        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            etapa3a1();
        } else if (escolha.equals("2")) {
            etapa3a2();
        } else {
            System.out.println("Opção inválida. Por favor, escolha novamente.");
            etapa2a();
        }
    }

    public static void etapa2b() {
        System.out.println("Etapa 2b:");
        System.out.println("As crianças decidiram seguir o caminho pelo deserto.");
        System.out.println("Elas encontram uma bifurcação e podem escolher entre ir para a direita ou para a esquerda.");
        System.out.println("Escolha o caminho:");
        System.out.println("1. Virar à direita.");
        System.out.println("2. Virar à esquerda.");

        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            etapa3b1();
        } else if (escolha.equals("2")) {
            etapa3b2();
        } else {
            System.out.println("Opção inválida. Por favor, escolha novamente.");
            etapa2b();
        }
    }

    public static void etapa3a1() {
        System.out.println("Etapa 3a1:");
        System.out.println("As crianças decidiram remar na canoa.");
        System.out.println("Elas chegam a uma cachoeira e precisam decidir se pulam ou voltam.");
        System.out.println("Escolha o que fazer:");
        System.out.println("1. Pular a cachoeira.");
        System.out.println("2. Voltar e procurar outro caminho.");

        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            finalFeliz();
        } else if (escolha.equals("2")) {
            finalTriste();
        } else {
            System.out.println("Opção inválida. Por favor, escolha novamente.");
            etapa3a1();
        }
    }

    public static void etapa3a2() {
        System.out.println("Etapa 3a2:");
        System.out.println("As crianças decidiram caminhar pela margem do rio.");
        System.out.println("Elas encontram uma ponte quebrada e precisam escolher se atravessam pulando ou voltam.");
        System.out.println("Escolha o que fazer:");
        System.out.println("1. Pular a ponte quebrada.");
        System.out.println("2. Voltar e procurar outro caminho.");

        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            finalTriste();
        } else if (escolha.equals("2")) {
            etapa1();
        } else {
            System.out.println("Opção inválida. Por favor, escolha novamente.");
            etapa3a2();
        }
    }

    public static void etapa3b1() {
        System.out.println("Etapa 3b1:");
        System.out.println("As crianças decidiram virar à direita.");
        System.out.println("Elas se deparam com um oásis e podem escolher descansar ou continuar a jornada.");
        System.out.println("Escolha o que fazer:");
        System.out.println("1. Descansar no oásis.");
        System.out.println("2. Continuar a jornada.");

        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            finalTriste();
        } else if (escolha.equals("2")) {
            finalFeliz();
        } else {
            System.out.println("Opção inválida. Por favor, escolha novamente.");
            etapa3b1();
        }
    }

    public static void etapa3b2() {
        System.out.println("Etapa 3b2:");
        System.out.println("As crianças decidiram virar à esquerda.");
        System.out.println("Elas encontram um guia que oferece ajuda para chegar à cidade grande. Aceitar ou recusar?");
        System.out.println("Escolha o que fazer:");
        System.out.println("1. Aceitar a ajuda do guia.");
        System.out.println("2. Recusar a ajuda do guia.");

        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            finalFeliz();
        } else if (escolha.equals("2")) {
            finalTriste();
        } else {
            System.out.println("Opção inválida. Por favor, escolha novamente.");
            etapa3b2();
        }
    }

    public static void finalFeliz() {
        System.out.println("Parabéns! As crianças chegaram com segurança à cidade grande. Fim da aventura.");
    }
}
