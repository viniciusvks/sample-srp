package br.org.fundatec.lp3.srp.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import br.org.fundatec.lp3.srp.funcionario.Cargo;
import br.org.fundatec.lp3.srp.funcionario.Funcionario;

public class CalculadoraDeSalarioTest {
	
	private static CalculadoraDeSalario calculadora;
	
	@BeforeClass
	public static void setUp() {
		calculadora = new CalculadoraDeSalario();
	}

	@Test
	public void testCargoDesenvolvedorESalarioMaiorQue3000() {
		
		double salarioBruto = 4000.0;
		Funcionario funcionario = new Funcionario(Cargo.DESENVOLVEDOR, salarioBruto);
		
		double salarioLiquidoEsperado =  salarioBruto * 0.8;
		double salarioLiquidoCalculado = calculadora.calcular(funcionario);
		
		assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0);
		
	}
	
	@Test
	public void testCargoDesenvolvedorESalarioIgualA3000() {
		
		double salarioBruto = 3000.0;
		Funcionario funcionario = new Funcionario(Cargo.DESENVOLVEDOR, salarioBruto);
		
		double salarioLiquidoEsperado =  salarioBruto * 0.9;
		double salarioLiquidoCalculado = calculadora.calcular(funcionario);
		
		assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0);
		
	}
	
	@Test
	public void testCargoDesenvolvedorESalarioMenorQue3000() {
		
		double salarioBruto = 2999.0;
		Funcionario funcionario = new Funcionario(Cargo.DESENVOLVEDOR, salarioBruto);
		
		double salarioLiquidoEsperado =  salarioBruto * 0.9;
		double salarioLiquidoCalculado = calculadora.calcular(funcionario);
		
		assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0);
		
	}
	
	@Test
	public void testCargoDBAESalarioMaiorQue2000() {
		
		double salarioBruto = 2001.0;
		Funcionario funcionario = new Funcionario(Cargo.DBA, salarioBruto);
		
		double salarioLiquidoEsperado =  salarioBruto * 0.75;
		double salarioLiquidoCalculado = calculadora.calcular(funcionario);
		
		assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0);
		
	}
	
	@Test
	public void testCargoDBAESalarioMenorQue2000() {
		
		double salarioBruto = 1999.0;
		Funcionario funcionario = new Funcionario(Cargo.DBA, salarioBruto);
		
		double salarioLiquidoEsperado =  salarioBruto * 0.85;
		double salarioLiquidoCalculado = calculadora.calcular(funcionario);
		
		assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0);
		
	}
	
	@Test
	public void testCargoDBAESalarioIgualA2000() {
		
		double salarioBruto = 2000.0;
		Funcionario funcionario = new Funcionario(Cargo.DBA, salarioBruto);
		
		double salarioLiquidoEsperado =  salarioBruto * 0.85;
		double salarioLiquidoCalculado = calculadora.calcular(funcionario);
		
		assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0);
		
	}
	
	@Test
	public void testCargoTESTERESalarioMaiorQue2000() {
		
		double salarioBruto = 2001.0;
		Funcionario funcionario = new Funcionario(Cargo.TESTER, salarioBruto);
		
		double salarioLiquidoEsperado =  salarioBruto * 0.75;
		double salarioLiquidoCalculado = calculadora.calcular(funcionario);
		
		assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0);
		
	}
	
	@Test
	public void testCargoTESTERESalarioMenorQue2000() {
		
		double salarioBruto = 1999.0;
		Funcionario funcionario = new Funcionario(Cargo.TESTER, salarioBruto);
		
		double salarioLiquidoEsperado =  salarioBruto * 0.85;
		double salarioLiquidoCalculado = calculadora.calcular(funcionario);
		
		assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0);
		
	}
	
	@Test
	public void testCargoTESTERESalarioIgualA2000() {
		
		double salarioBruto = 2000.0;
		Funcionario funcionario = new Funcionario(Cargo.TESTER, salarioBruto);
		
		double salarioLiquidoEsperado =  salarioBruto * 0.85;
		double salarioLiquidoCalculado = calculadora.calcular(funcionario);
		
		assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0);
		
	}

}
