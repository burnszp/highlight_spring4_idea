package com.wisely.highlight_spring4.ch1.javaconfig;

/**
 * Created by FrozenC on 2016/6/23.
 */
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}