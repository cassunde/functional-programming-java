package br.com.cassunde.rule.bad;

import br.com.cassunde.Client;

public class RuleAge extends SetRules {

	public RuleAge() {
		
		super(null);
	}
	
	public RuleAge(Rule next) {
		
		super(next);
	}

	@Override
	public boolean apply(Client client) {

		if( client.getAge() >= 18 ) {
			
			System.out.println("Rule Age is: "+ true);
			return applyNextRule(client);
		}
		
		System.out.println("Rule Age is: "+ false);
		return false;
	}
}
