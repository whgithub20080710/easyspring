package com.ws;

import com.ws.starter.MiniApplication;

public class Application {
    public static void main(String[] args) {
        System.out.println("Helloworld!");
        MiniApplication.run(Application.class,args);
    }
}
