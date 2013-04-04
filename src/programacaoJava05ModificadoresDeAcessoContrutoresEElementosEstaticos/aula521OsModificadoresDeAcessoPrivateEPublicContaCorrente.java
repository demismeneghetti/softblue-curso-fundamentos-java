package programacaoJava05ModificadoresDeAcessoContrutoresEElementosEstaticos;

public class aula521OsModificadoresDeAcessoPrivateEPublicContaCorrente {
	
	private int numConta;
	private String cpf;
	private boolean ativa;
	private double saldo;
	
	void sacar(double valor){
		saldo -= valor;
	}
	
	void depositar(double valor){
		saldo += valor;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public int getNumConta() {
		return this.numConta;
	} 
	
	public String getCpf(){
		return this.cpf;
	}
		
	public boolean getAtiva(){
		return this.ativa;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
}
