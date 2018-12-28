package br.com.cassunde.rule.bad;

import br.com.cassunde.Client;

public class RuleSalary extends SetRules {

	public RuleSalary() {
		
		super(null);
	}
	
	public RuleSalary(Rule next) {
		
		super(next);
	}

	@Override
	public boolean apply(Client client) {

		if( client.getSalary() >= 2000.00 ) {
			
			System.out.println("Rule Salary is: "+ true);
			return applyNextRule(client);
		}
		
		System.out.println("Rule Salary is: "+ false);
		return false;
	}
}
