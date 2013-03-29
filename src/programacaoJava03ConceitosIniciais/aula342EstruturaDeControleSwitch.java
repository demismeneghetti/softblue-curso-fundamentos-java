package programacaoJava03ConceitosIniciais;

public class aula342EstruturaDeControleSwitch {

	public static void main(String[] args) {

		int num = 50;

		// Neste caso, trata-se de uma opcao ao If/Else com algumas ressalvas!
		switch (num) {
		case 0:
			System.out.println("Numero 0");
			break;

		case 10:
			System.out.println("Numero 10");
			break;

		case 20:
			System.out.println("Numero 20");
			break;

		default:
			System.out.println("Outro nœmero!");
		}
	}
}
