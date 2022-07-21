package acr.demo.consumer.service.impl;

import acr.demo.provider.core.api.HelloService;
import acr.demo.provider.core.entity.HelloParam;
import acr.demo.provider.core.entity.HelloResult;

public class HelloClientServiceImpl {

    private HelloService helloService;

    void sayHello(String name) throws Exception {
        HelloParam helloParam = new HelloParam();
        helloParam.setName(name);

        HelloResult result = helloService.sayHello(helloParam);
    }
}
