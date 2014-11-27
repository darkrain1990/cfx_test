package com.wwh.test.helloworld;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by wuwenhui on 2014/11/17.
 */
public class TestClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:8080/service/HelloWorld");
        factory.setServiceClass(IHelloService.class);
        IHelloService helloWorld = (IHelloService) factory.create();
        String msg = helloWorld.sayHello("World!");
        System.out.println(msg);
    }
}
