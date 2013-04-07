package programacaoJava06HerancaEPolimorfismo;

public class aula621AplicandoAHerancaEntreClassesNoJavaAplicacao {

	public static void main(String[] args){
		
		aula623AplicandoAHerancaEntreClassesNoJavaCarro carro1 = new aula623AplicandoAHerancaEntreClassesNoJavaCarro();
		System.out.println("Carro");
		carro1.imprimirDados();
		System.out.println();
		
		aula624AplicandoAHerancaEntreClassesNoJavaMotocicleta motocicleta1 = new aula624AplicandoAHerancaEntreClassesNoJavaMotocicleta();
		System.out.println("Motocicleta");
		motocicleta1.imprimirDados();
		System.out.println();
		
		aula625AplicandoAHerancaEntreClassesNoJavaCaminhao caminhao = new aula625AplicandoAHerancaEntreClassesNoJavaCaminhao();
		System.out.println("Caminh‹o");
		caminhao.imprimirDados();
		System.out.println();
	}
}
