package programacaoJava06HerancaEPolimorfismo;

public class aula623AplicandoAHerancaEntreClassesNoJavaCarro extends aula622AplicandoAHerancaEntreClassesNoJavaVeiculo {
	
	private boolean quatroPortas = true;
	
	public void imprimirDados(){
		super.imprimirDados();
		System.out.println("Quatro Portas = " + quatroPortas);
	}

}
