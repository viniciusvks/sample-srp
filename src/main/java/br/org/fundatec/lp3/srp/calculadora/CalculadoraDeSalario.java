package br.org.fundatec.lp3.srp.calculadora;

import br.org.fundatec.lp3.srp.funcionario.Cargo;
import br.org.fundatec.lp3.srp.funcionario.Funcionario;

public class CalculadoraDeSalario {

    public double calcular(Funcionario funcionario) {

        if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {

            if(funcionario.getSalarioBase() > 3000.0) {
                return funcionario.getSalarioBase() * 0.8;
            } else {
                return funcionario.getSalarioBase() * 0.9;
            }

        }

        if(Cargo.DBA.equals(funcionario.getCargo()) || Cargo.TESTER.equals(funcionario.getCargo())) {

            if(funcionario.getSalarioBase() > 2000.0) {
                return funcionario.getSalarioBase() * 0.75;
            } else {
                return funcionario.getSalarioBase() * 0.85;
            }

        }

        throw new RuntimeException("funcionario invalido");

    }

}
