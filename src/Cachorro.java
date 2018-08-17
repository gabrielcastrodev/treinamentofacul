
public class Cachorro extends Animal {

	public Cachorro(String nome, String raca, int idade) {
		super(nome, raca, idade);

	}

	public void brinca() {
		System.out.println("O cachorro " + super.getNome() + " est� brincando");

	}

	public void brigaComGato(Gato gato) {

		System.out.println("O " + super.getNome() + " est� brigando com o " + gato.getNome());

	}
}
