
public class Cachorro extends Animal {

	public Cachorro(String nome, String raca, int idade) {
		super(nome, raca, idade);

	}

	public void brinca() {
		System.out.println("O cachorro " + super.getNome() + " está brincando");

	}

	public void brigaComGato(Gato gato) {

		System.out.println("O " + super.getNome() + " está brigando com o " + gato.getNome());

	}
}
