package programacaoJava04classesEObjetos;

public class aula442FuncionamentoDePassagemDeParametrosAplicacao {

	public static void main(String[] args) {

		aula441FuncionamentoDaPassagemDeParametrosParaMetodosObjeto o = new aula441FuncionamentoDaPassagemDeParametrosParaMetodosObjeto();
		o.w = 10;
		m2(o);
		
		System.out.println(o.w);
	}

	static void m2 (aula441FuncionamentoDaPassagemDeParametrosParaMetodosObjeto obj){
		obj.w = 20;
	}
	
	static void m1 (int x){
		x = 10;	
	}
}
