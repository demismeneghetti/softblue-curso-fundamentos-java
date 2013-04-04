package programacaoJava05ModificadoresDeAcessoContrutoresEElementosEstaticos;

public class aula543ElementosEstaticosGerenciador {

	private static int contador = 0;
		
	public aula543ElementosEstaticosGerenciador(){
		setContador(getContador() + 1);
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		aula543ElementosEstaticosGerenciador.contador = contador;
	}
}

