package acr.demo.provider.core.api;

import acr.demo.provider.core.entity.HelloParam;
import acr.demo.provider.core.entity.HelloResult;

public interface HelloService {
    HelloResult sayHello(HelloParam param) throws Exception;
}
