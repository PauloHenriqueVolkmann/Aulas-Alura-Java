package br.com.bytebank.Banco.test;

import br.com.bytebank.Banco.modelo.Conta;
import br.com.bytebank.Banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(123,321);
		
		cc.deposita(200);
		
		try {		
			cc.saca(500);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(cc.getSaldo());
		
	}
	
}
