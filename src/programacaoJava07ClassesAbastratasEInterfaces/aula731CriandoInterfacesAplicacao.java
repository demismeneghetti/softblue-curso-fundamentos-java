package programacaoJava07ClassesAbastratasEInterfaces;

public class aula731CriandoInterfacesAplicacao {

	public static void main(String[] args) {
		
		aula732CriandoInterfacesAutenticador a = obterAutenticador();
		
		boolean sucesso = a.autenticar("u", "s");
		
		if (sucesso) {
			System.out.println("Autenticado!");
		} else {
			System.out.println("Recusado!");
		}
	}
	
	private static aula732CriandoInterfacesAutenticador obterAutenticador() {
		
		return new aula733CriandoInterfacesDBAutenticador();
		//return new aula734CriandoInterfacesDBFileAutenticar();
	}
}
