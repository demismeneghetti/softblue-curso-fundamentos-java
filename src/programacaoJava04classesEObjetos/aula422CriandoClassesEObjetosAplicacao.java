package programacaoJava04classesEObjetos;

public class aula422CriandoClassesEObjetosAplicacao {

	public static void main(String[] args) {

		aula421CriandoClassesEObjetosPessoa p1 = new aula421CriandoClassesEObjetosPessoa();
		p1.nome = "Carlos";

		p1.receber(10);
		p1.receber(5);

		System.out.println(p1.numFigurinhas);

		aula421CriandoClassesEObjetosPessoa p2 = new aula421CriandoClassesEObjetosPessoa();
		p2.nome = "Jo‹o";

		p1.dar(7, p2);

		System.out.println(p1.numFigurinhas);
		System.out.println(p2.numFigurinhas);

	}
}
