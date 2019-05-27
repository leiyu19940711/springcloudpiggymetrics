package com.jsd.piggymetrics.accountserver.account.account.client;

import com.jsd.piggymetrics.accountserver.account.account.CatAnnotation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(url = "${user_service.url}", name = "user-service-client")
public interface UserServiceClient {

    @RequestMapping(method = RequestMethod.POST, value = "/v1/user/create")
    @CatAnnotation
    void createUser(@RequestParam("username") String username, @RequestParam("password") String password);

}
