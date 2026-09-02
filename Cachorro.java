public class Cachorro extends Pet {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        if (energia >= 2) {
            energia -=2;
            fome += 1;
            System.out.println("🎾 " + getNome() + " pegou o frisbee!");
        } else {
            System.out.println("💤 " + getNome() + " está cansado para correr.");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("🐶 " + getNome() + " Faz: Au Au Au!");
    }
}