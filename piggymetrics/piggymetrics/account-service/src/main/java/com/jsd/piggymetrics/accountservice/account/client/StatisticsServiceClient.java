package com.jsd.piggymetrics.accountservice.account.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "statistics-service",fallback =StatisticsServiceClientFallback.class)
public interface StatisticsServiceClient {

}
