package br.com.cassunde.rule.bad;

import br.com.cassunde.Client;

public class RuleDebit extends SetRules {

	public RuleDebit() {
		
		super(null);
	}
	
	public RuleDebit(Rule next) {
		
		super(next);
	}

	@Override
	public boolean apply(Client client) {

		if( !client.isDebit() ) {
			
			System.out.println("Rule Debit is: "+ true);
			return applyNextRule(client);
		}
		
		System.out.println("Rule Debit is: "+ false);
		return false;
	}
}
