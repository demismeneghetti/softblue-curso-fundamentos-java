package programacaoJava05ModificadoresDeAcessoContrutoresEElementosEstaticos;

public class aula543ElementosEstaticosAplicacao {

	public static void main(String[] args) {

		aula544ElementosEstaticosGerenciador g1 = new aula544ElementosEstaticosGerenciador();
		aula544ElementosEstaticosGerenciador g2 = new aula544ElementosEstaticosGerenciador();
		aula544ElementosEstaticosGerenciador g3 = new aula544ElementosEstaticosGerenciador();
		
		int c = aula544ElementosEstaticosGerenciador.getContador();
		
		System.out.println(c);

	}
}
