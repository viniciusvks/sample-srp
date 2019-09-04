package br.org.fundatec.lp3.srp.funcionario;

import br.org.fundatec.lp3.srp.regradecalculo.DezOuVintePorCento;
import br.org.fundatec.lp3.srp.regradecalculo.QuinzeOuVinteCincoPorCento;
import br.org.fundatec.lp3.srp.regradecalculo.RegraDeCalculo;

public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorCento()),
    TESTER(new QuinzeOuVinteCincoPorCento());
	
	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}

}
