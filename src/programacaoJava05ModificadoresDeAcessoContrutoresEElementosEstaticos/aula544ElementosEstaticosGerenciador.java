package programacaoJava05ModificadoresDeAcessoContrutoresEElementosEstaticos;

public class aula544ElementosEstaticosGerenciador {

	private static int contador = 0;
		
	public aula544ElementosEstaticosGerenciador(){
		setContador(getContador() + 1);
	
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		aula544ElementosEstaticosGerenciador.contador = contador;
	}
}

