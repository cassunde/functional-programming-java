package br.com.cassunde.rule.bad;

import br.com.cassunde.Client;

public interface Rule {

	boolean apply(Client client);
}
