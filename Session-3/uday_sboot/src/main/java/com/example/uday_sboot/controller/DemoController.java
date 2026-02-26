package com.example.uday_sboot.controller;


import com.example.uday_sboot.model.Demo;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoController {
    //if scope=singleton both willm be same else diff
    @Autowired
    Demo springdemoobj;
    @Autowired
    Demo springdemoobj1;

         private static Logger logger= LoggerFactory.getLogger(DemoController.class);



         //api endpoint
        @GetMapping()
    public void HelloWorld(){


            //Each time new obj will be created not managed bean
            Demo demo=new Demo();
            logger.info("New Demo obj created {}",demo);
//            Demo demo1=new Demo();
//            logger.info("New demo1 obj created {}",demo1);
            //same everytime reference of obj from ioc container
            logger.info("New Demo obj done by spring:{} & {}",springdemoobj,springdemoobj1);
        }

}
//first time
//New Demo obj created com.example.uday_sboot.model.Demo@18881260
//New Demo obj done by spring:com.example.uday_sboot.model.Demo@1e808d60

//second time
//New Demo obj created com.example.uday_sboot.model.Demo@38276c2d
//New Demo obj done by spring:com.example.uday_sboot.model.Demo@1e808d60

//With prototype scope
//New Demo obj created com.example.uday_sboot.model.Demo@7a9025d1
//New Demo obj done by spring:com.example.uday_sboot.model.Demo@3c5589d1 & com.example.uday_sboot.model.Demo@2f45dc75

//New Demo obj created com.example.uday_sboot.model.Demo@2b6cbe1
//New Demo obj done by spring:com.example.uday_sboot.model.Demo@3c5589d1 & com.example.uday_sboot.model.Demo@2f45dc75