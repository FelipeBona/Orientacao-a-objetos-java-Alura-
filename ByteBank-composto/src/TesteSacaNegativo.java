
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta bank = new Conta();
		bank.deposita(100);
		System.out.println(bank.saca(101));
	
		bank.saca(101);
		
		System.out.println(bank.getSaldo());
		
	}
	
}
