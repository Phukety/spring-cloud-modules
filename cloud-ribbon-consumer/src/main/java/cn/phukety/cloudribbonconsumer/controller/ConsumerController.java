package cn.phukety.cloudribbonconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/ribbon-consumer")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://CLOUD-CLIENT/hello", String.class).getBody();
    }
}
