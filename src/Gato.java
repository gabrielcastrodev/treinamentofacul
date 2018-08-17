
public class Gato extends Animal {

	public Gato(String nome, String raca, int idade) {
		super(nome, raca, idade);

	}

	public void dormir() {
		System.out.println("O " + getNome() + " está dormindo!");
	}

	public void arranha(Arranhador arranhador) {
		System.out.println("O " + getNome() + " está arranhando o " + arranhador.getArranhador() + "!");
	}

}
