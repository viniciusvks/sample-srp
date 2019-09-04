package br.org.fundatec.lp3.srp.calculadora;

import br.org.fundatec.lp3.srp.funcionario.Cargo;
import br.org.fundatec.lp3.srp.funcionario.Funcionario;
import br.org.fundatec.lp3.srp.regradecalculo.RegraDeCalculo;

public class CalculadoraDeSalario {

    public double calcular(Funcionario funcionario) {
        Cargo cargo = funcionario.getCargo();
        RegraDeCalculo regra = cargo.getRegra();
        return regra.calcula(funcionario);        
    }

}
