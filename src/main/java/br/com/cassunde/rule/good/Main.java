package br.com.cassunde.rule.good;

import java.util.function.Predicate;

import br.com.cassunde.Client;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client("Cassundé", 29, false, 2001.00);
		applyRules(client);
	}
	
	private static void applyRules(Client client) {
		
		//create rules
		Predicate<Client> ruleAge = cli -> cli.getAge() >= 18;
		Predicate<Client> ruleDebit = cli -> !cli.isDebit();
		Predicate<Client> ruleSalary = cli -> cli.getSalary() >= 2000.00;
		
		//configuration general rules
		Predicate<Client> generalRule = ruleAge.and(ruleSalary).and(ruleDebit);

		System.out.println(generalRule.test(client));
	}
}
