package programacaoJava05ModificadoresDeAcessoContrutoresEElementosEstaticos;

public class aula544ElementosEstaticosAplicacao {

	public static void main(String[] args) {

		aula543ElementosEstaticosGerenciador g1 = new aula543ElementosEstaticosGerenciador();
		aula543ElementosEstaticosGerenciador g2 = new aula543ElementosEstaticosGerenciador();
		aula543ElementosEstaticosGerenciador g3 = new aula543ElementosEstaticosGerenciador();
		
		int c = aula543ElementosEstaticosGerenciador.getContador();
		
		System.out.println(c);

	}
}
