package Exceptions;

public class TestaContaComExceptionChecked {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaException e) {
			e.printStackTrace();
		}
		
	}
	
}
