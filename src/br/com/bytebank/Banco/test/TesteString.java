package br.com.bytebank.Banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		int a = 3;
		String nome = "Alura"; //object literal
		//String outros = new String("Alura");
		
		String outro = nome.replace("A", "a");
		
		System.out.println(outro);
		
		String outro2 = nome.toUpperCase();
		
		System.out.println(outro2);
		
	}

}
