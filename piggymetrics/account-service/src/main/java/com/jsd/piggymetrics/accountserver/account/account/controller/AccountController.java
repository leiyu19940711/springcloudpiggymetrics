package com.jsd.piggymetrics.accountserver.account.account.controller;


import com.jsd.piggymetrics.accountserver.account.account.domain.Account;
import com.jsd.piggymetrics.accountserver.account.account.domain.User;
import com.jsd.piggymetrics.accountserver.account.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public Account getAccountByName(@PathVariable String name) {
		return accountService.findByName(name);
	}

	@RequestMapping(path = "/current", method = RequestMethod.GET)
	public Account getCurrentAccount(@RequestHeader("X-S2G-USERNAME") String userName) {
		return accountService.findByName(userName);
	}

	@RequestMapping(path = "/current", method = RequestMethod.PUT)
	public void saveCurrentAccount(@RequestHeader("X-S2G-USERNAME") String userName, @Valid @RequestBody Account account) {
		accountService.saveChanges(userName, account);
	}

	@RequestMapping(path = "/", method = RequestMethod.POST)
	public Account createNewAccount(@Valid @RequestBody User user) {
		return accountService.create(user);
	}
}
