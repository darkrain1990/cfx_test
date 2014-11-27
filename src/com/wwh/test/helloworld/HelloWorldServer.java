package com.wwh.test.helloworld;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
/**
 * Created by wuwenhui on 2014/11/17.
 */
public class HelloWorldServer {
    public static void main(String[] args) {
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloServiceImpl.class);
        factory.setAddress("http://localhost:8080/service/HelloWorld");
        Server server = factory.create();
        server.start();
//        system.out.print("11111");
        //ni shuo shi dsdsds
    }
}
