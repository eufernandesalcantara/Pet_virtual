# 🐾 Pet Terminal - Bichinho Virtual em Java

Um jogo de terminal em Java que simula a adoção e o cuidado de um bichinho virtual (estilo Tamagotchi). O projeto foi desenvolvido para praticar e demonstrar na prática os quatro pilares da **Programação Orientada a Objetos (POO)**.

---

## 🎯 Conceitos de POO Aplicados

* **Abstração:** A classe `Pet` é abstrata (`abstract`), servindo como modelo base para os animais sem permitir instanciação direta.
* **Herança:** As classes `Cachorro`, `Gato`, `Hamster` e `Peixe` herdam atributos e comportamentos da classe pai `Pet`.
* **Polimorfismo:** Cada animal implementa sua própria versão dos métodos abstratos `brincar()` e `emitirSom()`, alterando o gasto de energia e mensagens.
* **Encapsulamento:** Uso dos modificadores de acesso `private` e `protected` para proteger o estado interno do pet (fome e energia).

---

## 📁 Estrutura do Projeto

```text
estudo_java/
├── Pet.java          # Classe abstrata base (Superclasse)
├── Cachorro.java     # Subclasse de Pet
├── Gato.java         # Subclasse de Pet
├── Hamster.java      # Subclasse de Pet
├── Peixe.java        # Subclasse de Pet
├── Main.java         # Classe principal com o loop e menu do jogo
└── README.md         # Documentação do projeto
