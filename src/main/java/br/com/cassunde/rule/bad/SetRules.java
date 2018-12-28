package br.com.cassunde.rule.bad;

import br.com.cassunde.Client;

public abstract class SetRules implements Rule{

	private Rule nextRule;

	public SetRules(Rule nextRule) {

		this.nextRule = nextRule;
	}
	
	protected boolean applyNextRule(Client client) {
		
		if( nextRule != null ) {
			
			return nextRule.apply(client);
		}
		
		return true;
	}
}
