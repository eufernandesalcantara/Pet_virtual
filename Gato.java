public class Gato extends Pet {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        if (energia >= 2) {
            energia -=2;
            fome += 1;
            System.out.println("🧶 " + getNome() + " arranhou o novelo de lã");
        } else {
            System.out.println("💤 " + getNome() + " te ignorou e foi dormir.");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("🐱 " + getNome() + " Faz: Miau Miau Miau!");
    }
}