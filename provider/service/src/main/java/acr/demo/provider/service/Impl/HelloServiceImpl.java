package acr.demo.provider.service.Impl;

import acr.demo.provider.core.api.HelloService;
import acr.demo.provider.core.entity.HelloParam;
import acr.demo.provider.core.entity.HelloResult;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class HelloServiceImpl implements HelloService {

    public HelloResult sayHello(HelloParam param) throws Exception {
        if(StringUtils.isEmpty(param.getName())) {
            throw new Exception("no name found");
        }

        String message = String.format("Hello %s, Date: %s", param.getName(), new Date());
        HelloResult result = new HelloResult();
        result.setMessage(message);

        return result;
    }
}
