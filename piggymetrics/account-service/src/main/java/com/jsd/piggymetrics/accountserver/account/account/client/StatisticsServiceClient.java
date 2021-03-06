package com.jsd.piggymetrics.accountserver.account.account.client;


import com.jsd.piggymetrics.accountserver.account.account.CatAnnotation;
import com.jsd.piggymetrics.accountserver.account.account.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "statistics-service", fallback = StatisticsServiceClientFallback.class)
public interface StatisticsServiceClient {

	@RequestMapping(method = RequestMethod.PUT, value = "/statistics/{accountName}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@CatAnnotation
	void updateStatistics(@PathVariable("accountName") String accountName, Account account);

}
