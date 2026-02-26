package com.example.uday_sboot.controller;


import com.example.uday_sboot.model.Demo;
import com.example.uday_sboot.service.PaymentInterface;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoController {


         private static Logger logger= LoggerFactory.getLogger(DemoController.class);
        Demo demoobj;
        //constructor injection
        public DemoController(Demo demo){
         logger.info("Democontroller initialised..");
         demoobj=demo;
        }

        @Autowired
    PaymentInterface paymentinterface;
         //api endpoint
        @GetMapping()
    public void HelloWorld(){


            //Each time new obj will be created not managed bean
            Demo demo=new Demo();
            logger.info("New Demo obj created {}",demo);
//            Demo demo1=new Demo();
//            logger.info("New demo1 obj created {}",demo1);
            //same everytime reference of obj from ioc container
            logger.info("New Demo obj done by spring using constr injection:{}",demoobj);

            logger.info("Autpwired paymentInterface implementation:"+paymentinterface.getClass());
        }

}
//first time
