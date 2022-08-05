
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo da primeira: " + primeiraConta.saldo);

		Conta segunConta = primeiraConta;

		System.out.println("Saldo da segunda conta: " + segunConta.saldo);

		segunConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segunConta) {
			System.out.println("sao a mesma coisa");
		}

	}
}
