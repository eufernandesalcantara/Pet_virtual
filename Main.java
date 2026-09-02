import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        Pet meuPet = null;

        System.out.println("== 🐾 Bem vindo ao Pet Terminal 🐾 ==");
        System.out.println("Escolha qual animal deseja adotar:");
        System.out.println("1 - Cachorro 🐶");
        System.out.println("2 - Gato 🐱");
        System.out.println("3 - Hamster 🐹");
        System.out.println("4 -Peixe 🐟");
        System.out.print("Sua opção: ");

        int opcaoPet = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha pendente

        System.out.println("Qual será o nome do seu bichinho? ");
        String nome = scanner.nextLine();

        // Instanciação polimórfica: a variável é 'Pet', mas recebe a subclasse escolhida
        switch (opcaoPet) {
            case 1:
                meuPet = new Cachorro(nome);
                break;
            case 2:
                meuPet = new Gato(nome);
                break;
            case 3:
                meuPet = new Hamster(nome);
                break;
            case 4:
                meuPet = new Peixe(nome);
                break;
            default:
                System.out.println("Opção inválida! Adotando um Cachorro por padrão.");
                meuPet = new Cachorro(nome);
                break;
        }

        System.out.println("\n🎉 Você adotou " + meuPet.getNome() + "!");
        meuPet.emitirSom();

        int opcaoMenu = -1;

        // Loop de interação do jogo
        while (opcaoMenu != 0) {
            System.out.println("\n----------------------------------");
            System.out.println(" O Que fazer com " + meuPet.getNome() + "?");
            System.out.println("1 - Alimentar 🍎");
            System.out.println("2 - Brincar 🎾");
            System.out.println("3 - Dormir 🌙");
            System.out.println("4 - Ouvir som 🔊");
            System.out.println("5 - Ver Status 📊");
            System.out.println("0 - Sair do jogo 🚪");
            System.out.println("Escolha: ");
           
            opcaoMenu = scanner.nextInt();
            System.out.println();

            switch (opcaoMenu) {
                case 1:
                    meuPet.comer();
                    break;
                case 2:
                    // O polimorfismo acontece aqui: executa a brincadeira específica do animal!
                    meuPet.brincar();
                    break;
                case 3:
                    meuPet.dormir();
                    break;
                case 4:
                    meuPet.emitirSom();
                    break;   
                case 5:
                    meuPet.exibirStatus();
                    break;
                case 0:
                    System.out.println("Saindo... Tchau tchau, " + meuPet.getNome() + "! 👋");
                    break;
                default:
                    System.out.println("❌ Opção inválida!");
                    break; 
                }
            }
            scanner.close();
        }
    }

