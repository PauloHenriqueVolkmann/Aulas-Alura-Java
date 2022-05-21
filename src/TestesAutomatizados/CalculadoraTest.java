package TestesAutomatizados;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3,7);
				
		Assert.assertEquals(10, soma);
	}
	
//	public static void main(String[] args) {
//
//		Calculadora calc = new Calculadora();
//				
//		int soma = calc.somar(3,4);
//		
//		System.out.println(soma);
//		
//		
//	}

}
