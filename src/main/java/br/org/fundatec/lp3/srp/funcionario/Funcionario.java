package br.org.fundatec.lp3.srp.funcionario;

public class Funcionario {

    private double salarioBase;
    private Cargo cargo;

    public Funcionario(Cargo cargo, double salarioBase) {
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
