public class Hamster extends Pet {
    public Hamster(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        if (energia >= 3) {
            energia -=3; // hamster gasta mais energia
            fome += 1;
            System.out.println("🐹 " + getNome() + " girou a rodinha sem parar!");
        } else {
            System.out.println("💤 " + getNome() + " está dormindo na serragem.");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("🐹 " + getNome() + " Faz: Squeak Squeak!");
    }
}