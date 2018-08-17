
public class Gato extends Animal {

	public Gato(String nome, String raca, int idade) {
		super(nome, raca, idade);

	}

	public void dormir() {
		System.out.println("O " + getNome() + " est� dormindo!");
	}

	public void arranha(Arranhador arranhador) {
		System.out.println("O " + getNome() + " est� arranhando o " + arranhador.getArranhador() + "!");
	}

}
