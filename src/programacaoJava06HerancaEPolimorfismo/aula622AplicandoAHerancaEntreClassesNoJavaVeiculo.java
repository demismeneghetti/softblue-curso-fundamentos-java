package programacaoJava06HerancaEPolimorfismo;

public class aula622AplicandoAHerancaEntreClassesNoJavaVeiculo {

	protected int cor;
	protected String marca;
	protected String modelo;

	public void buzinar() {
		System.out.println("BI! BI!");
	}
	
	public void imprimirDados(){
		System.out.println("Cor = " + cor);
		System.out.println("Marca = " + marca);
		System.out.println("Modelo = " + modelo);
	}
}