
public class TesteValores {

	public static void main(String[] args) {
		Conta conta = new Conta(123234, 3443);
		// conta esta inconsistente
		conta.setAgencia(-50);
		conta.setNumero(-350);

		System.out.println(conta.getAgencia());

		conta.setAgencia(123456);

		Conta conta2 = new Conta(123310, 345464);

		System.out.println(conta2.getTotal());
	}
}
