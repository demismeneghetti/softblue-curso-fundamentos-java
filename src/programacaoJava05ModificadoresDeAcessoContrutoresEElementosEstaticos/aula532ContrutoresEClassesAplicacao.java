package programacaoJava05ModificadoresDeAcessoContrutoresEElementosEstaticos;

public class aula532ContrutoresEClassesAplicacao {

	public static void main(String[] args){
		
		aula531ContrutoresEClassesRetangulo r1 = new aula531ContrutoresEClassesRetangulo(2, 4);
		double area = r1.calcularArea();
		System.out.println(area);
		
		aula531ContrutoresEClassesRetangulo r2 = new aula531ContrutoresEClassesRetangulo();
		area = r2.calcularArea();
		System.out.println(area);
		
		aula533ContrutoresEClassesQuadrado q1 = new aula533ContrutoresEClassesQuadrado();
				
	}
}
