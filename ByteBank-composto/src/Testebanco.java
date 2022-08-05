
public class Testebanco {

	public static void main(String[] args) {
		Cliente felipe = new Cliente();
		felipe.nome = "Felipe Bona";
		felipe.cpf = "2343452342";
		felipe.profissao = "programador";
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		conta.titular = felipe;
		System.out.println(conta.titular.nome);
		System.out.println(conta.titular);
		System.out.println(felipe);
	}
}
