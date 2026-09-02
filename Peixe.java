public class Peixe extends Pet {
    public Peixe(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        if (energia >= 1) {
            energia -=1; // Peixe gasta menos energia
            fome += 1;
            System.out.println("🐟 " + getNome() + " Deu uma volta no castelinho");
        } else {
            System.out.println("💤 " + getNome() + " está parado no fundo.");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("🐟 " + getNome() + " Faz: Glub Glub Glub!");
    }
}