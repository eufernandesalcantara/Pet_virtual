import java.util.Scanner;
// classe mãe (super class)
// Marcamos como "abstract" porque não existe um animal genérico chamado apenas "Pet". 
// Você sempre adota um Cachorro, Gato, hamster ou peixe.

abstract class Pet {

    private String nome;
// 'protected' permite que as classes filhas (Cachorro, Gato, etc) alterem esses valores diretamente
    protected int fome;
    protected int energia;

    public Pet(String nome) {
        this.nome = nome;
        this.fome = 5;
        this.energia = 10;
    }

    public String getNome() {
       return this.nome; 
    }

    public void comer() {
        if (fome > 0) {
        System.out.println("😋 " + nome + " comeu está de barriga cheia");
        fome -= 3;
        if (fome < 0) fome = 0;
        } else {
            System.out.println("🤢 " + nome + " não quer comer agora");
        }
    }

    public void dormir() {
        System.out.println("🌙 " + nome + " dormiu profundamente");
        energia = 10;
        fome += 2;
    }

    public void exibirStatus() {
        System.out.println("\n [ " + nome + " | Fome: " + fome +"/10 | Energia: " + energia + "/10");
    }

// Métodos abstratos: obrigam todas as classes filhas a criarem suas próprias versões!
    public abstract void brincar();
    public abstract void emitirSom();
}