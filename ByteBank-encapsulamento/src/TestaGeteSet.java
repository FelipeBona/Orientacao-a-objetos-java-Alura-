
public class TestaGeteSet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1377);
		System.out.println(conta.getNumero());

		Cliente felipe = new Cliente();

		felipe.setNome("felipe bona");

		conta.setTitular(felipe);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("programador");

		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
	}
}
