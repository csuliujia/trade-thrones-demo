package com.alibaba.rt.thrones.spi.app;

import com.alibaba.rt.thrones.spi.Fruit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

@SpringBootApplication
public class Application {

//    public static void main(String[] args) {
//        SpringApplication.run(Application.class,args);
//    }

    public static void main(String[] args) {

        System.out.println("通过Service.providers拿到实现类实例！");

        Iterator<Fruit> providers = Service.providers(Fruit.class);
        while (providers.hasNext()){
            Fruit fruit = providers.next();
            System.out.println(fruit.getColour());
            System.out.println(fruit.getSize());
        }

        System.out.println("通过ServiceLoader.load拿到实现类实例！");

        Iterator<Fruit> providers1 = ServiceLoader.load(Fruit.class).iterator();
        while (providers1.hasNext()){
            Fruit fruit1 = providers1.next();
            System.out.println(fruit1.getColour());
            System.out.println(fruit1.getSize());
        }
    }

}
