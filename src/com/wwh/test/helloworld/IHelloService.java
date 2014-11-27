package com.wwh.test.helloworld;
import javax.jws.WebService;
/**
 * Created by wuwenhui on 2014/11/17.
 */
@WebService
public interface IHelloService {
    public String sayHello(String username);
}
