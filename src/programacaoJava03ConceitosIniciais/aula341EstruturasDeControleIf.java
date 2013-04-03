package programacaoJava03ConceitosIniciais;

public class aula341EstruturasDeControleIf {

	public static void main(String[] args) {

		/* Ao alterar o valor da variavel e executando a classe 
		o resultado e exibido de acordo com o informado no codigo. */
		
		int num = 10;

		// Se o valor for maior que 10
		if (num > 10) {
			System.out.println("Numero MAIOR do que 10");
		
		// Se o valor for menor que 10
		} else if (num < 10){
			System.out.println("Numero MENOR do que 10");
		
		// Se o valor for igual a 10
		} else {
			System.out.println("Numero IGUAL a 10");
		}
	}
}
