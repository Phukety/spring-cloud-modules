package cn.phukety.cloudclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class HelloController {
    @Resource
    private DiscoveryClient client;

    @GetMapping(value = "/hello")
    public String hello() {
        List<String> services = client.getServices();
        services.forEach(System.out::println);
        return "this is cloud client";
    }
}
