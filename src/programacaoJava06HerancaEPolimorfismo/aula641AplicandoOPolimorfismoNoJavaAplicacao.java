package programacaoJava06HerancaEPolimorfismo;

public class aula641AplicandoOPolimorfismoNoJavaAplicacao {

	public static void main(String[] args){
		
		aula642AplicandoOPolimorfismoNoJavaAnimal cachorro = new aula643AplicandoOPolimorfismoNoJavaCachorro();
		System.out.println("Cachorro fala:");
		cachorro.falar();
		System.out.println();
		
		aula642AplicandoOPolimorfismoNoJavaAnimal gato = new aula644AplicandoOPolimorfismoNoJavaGato();
		System.out.println("Gato fala:");
		gato.falar();
		System.out.println();
		
	}
}
