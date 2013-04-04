package programacaoJava05ModificadoresDeAcessoContrutoresEElementosEstaticos;

public class aula531ContrutoresEClassesRetangulo {

	private double altura;
	private double largura;
	
	public aula531ContrutoresEClassesRetangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
//	public aula531ContrutoresEClassesRetangulo(){
//		this.altura = 5;
//		this.largura = 7;
//	}
	
	public aula531ContrutoresEClassesRetangulo(){
		this(5, 7);
	}
	
	public double calcularArea(){
		return altura * largura;
	}
}
