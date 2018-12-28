package br.com.cassunde.rule.bad;

import br.com.cassunde.Client;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client("Cassundé", 29, false, 1001.00);
		ruleRequired().apply(client);
	}
	
	private static Rule ruleRequired() {
		
		return new RuleAge(new RuleDebit(new RuleSalary()));
	}
}
