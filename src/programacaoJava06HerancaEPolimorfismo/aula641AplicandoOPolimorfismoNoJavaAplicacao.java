package programacaoJava06HerancaEPolimorfismo;

public class aula641AplicandoOPolimorfismoNoJavaAplicacao {

	public static void main(String[] args){
		
		aula642AplicandoOPolimorfismoNoJavaAnimal cachorro = new aula643AplicandoOPolimorfismoNoJavaCachorro();
		System.out.println("Cachorro fala:");
		cachorro.falar();
		
		if (cachorro instanceof aula643AplicandoOPolimorfismoNoJavaCachorro){
			aula643AplicandoOPolimorfismoNoJavaCachorro c = (aula643AplicandoOPolimorfismoNoJavaCachorro) cachorro;
			c.morder();
			System.out.println();
		}
		
		aula642AplicandoOPolimorfismoNoJavaAnimal gato = new aula644AplicandoOPolimorfismoNoJavaGato();
		System.out.println("Gato fala:");
		gato.falar();
		System.out.println();
		
		
		
	}
}
