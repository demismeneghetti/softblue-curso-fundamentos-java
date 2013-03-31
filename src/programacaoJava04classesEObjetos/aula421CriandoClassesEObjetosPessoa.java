package programacaoJava04classesEObjetos;

public class aula421CriandoClassesEObjetosPessoa {

	//Objeto Pessoa
	String nome;
	int numFigurinhas;
	
	void receber(int num){
		this.numFigurinhas = this.numFigurinhas + num;
	}
	
	void dar(int num, aula421CriandoClassesEObjetosPessoa p){
		this.numFigurinhas = this.numFigurinhas - num;
		p.receber(num);
	}
}
