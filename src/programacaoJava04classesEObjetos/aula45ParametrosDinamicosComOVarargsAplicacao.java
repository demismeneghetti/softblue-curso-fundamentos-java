package programacaoJava04classesEObjetos;

public class aula45ParametrosDinamicosComOVarargsAplicacao {
	
	public static void main(String[] args){
		
		// Utilizando o Par‰metro Din‰mico VARARGS Ž poss’vel inserir uma
		// quantidade ilimitada de argumentos.
		int soma = somar ("Somando nœmeros:", 10, 5, 20, 55, 45);
		System.out.println(soma);
	}

	public static int somar (String s, int... numeros){
		System.out.println(s);
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++){
			soma += numeros[i];
		}
		
		return soma;
	}
}