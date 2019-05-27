package com.jsd.piggymetrics.accountserver.account.account.domain;

public enum Currency {

	USD, EUR, RUB;

	public static Currency getDefault() {
		return USD;
	}
}

