package programacaoJava05ModificadoresDeAcessoContrutoresEElementosEstaticos;

public class aula522OsModificadoresDeAcessoPrivateEPublicAplicacao {

	public static void main(String[] args){
		
		aula521OsModificadoresDeAcessoPrivateEPublicContaCorrente c1 = new aula521OsModificadoresDeAcessoPrivateEPublicContaCorrente();
		
//		c1.numConta = 123;
//		c1.cpf = 28074654800;
//		c1.ativa = true;
		
		c1.setNumConta(020177);
		c1.setCpf("28074654800");
		c1.setAtiva(true);
		c1.depositar(200);
		c1.sacar(20);
		
		double saldo = c1.getSaldo();
		int numConta = c1.getNumConta();
		String cpf = c1.getCpf();
		boolean ativa = c1.getAtiva();
		
		System.out.println("Número: " + numConta);
		System.out.println("CPF n.º: " + cpf);
		System.out.println("Status: " + ativa);
		System.out.println("Saldo R$: " + saldo);
	}
}
