
public class Animal {

	public String nome;
	public String raca;
	public int idade;

	public Animal(String nome, String raca, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;

	}

	public void imprimeColeira() {
		System.out.println("O nome é: " + getNome() + "!");
		System.out.println("A raça é: " + getRaca() + "!");
		System.out.println("A idade é: " + getIdade() + " anos!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
