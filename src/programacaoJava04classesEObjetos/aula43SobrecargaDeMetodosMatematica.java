package programacaoJava04classesEObjetos;

public class aula43SobrecargaDeMetodosMatematica {

	// Metodo somar com 2 parametros "int".
	public int somar(int x, int y) {
		return x + y;
	}

	// Metodo somar com 3 parametros "int".
	public int somar(int x, int y, int z) {
		return x + y + z;		
	}
	
	// Metodo somar com 3 parametros "double".
	public double somar(double x, double y, double z) {
		return x + y + z;
	}
	
	public static void main (String[] args){
		
		aula43SobrecargaDeMetodosMatematica m = new aula43SobrecargaDeMetodosMatematica();
		
		//A aplicacao utilizará o método de acordo com os parametros enviados.
		double r = m.somar(10.5, 20.8, 30.2);
		
		System.out.println(r);
	}
}
