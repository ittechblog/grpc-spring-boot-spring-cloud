package com.yang.grpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/12/4
 */
@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @RequestMapping("/")
    public String printMessage(@RequestParam(defaultValue = "Michael") String name) {
        return grpcClientService.sendMessage(name);
    }
}
