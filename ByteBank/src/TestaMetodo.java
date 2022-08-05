
public class TestaMetodo {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		boolean consegiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(consegiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, conta);
		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}

		System.out.println(conta.saldo);
		System.out.println(contaDaMarcela.saldo);

		conta.titular = "felipe bona";
		System.out.println(conta.titular);
	}

}
