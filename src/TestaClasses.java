
public class TestaClasses {

	public static void main(String[] args) {

		Cachorro buddy = new Cachorro("Buddy", "Labrador", 12);
		Gato mingal = new Gato("Mingal", "XPTO", 12);
		Arranhador arranhador = new Arranhador();
		arranhador.setArranhador("Gatito Arranhador");

		buddy.brinca();
		System.out.println("------------------------------------");

		buddy.imprimeColeira();
		System.out.println("------------------------------------");

		buddy.brigaComGato(mingal);
		System.out.println("------------------------------------");

		mingal.arranha(arranhador);

	}

}
