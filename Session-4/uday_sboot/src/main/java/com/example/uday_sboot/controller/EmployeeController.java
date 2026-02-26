package com.example.uday_sboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/employee")//common to all
@RestController
public class EmployeeController {
private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

@GetMapping("/id")
    public void getEmployeeIdUsingRequestParam(@RequestParam int empid,@RequestParam(required = false,defaultValue = "defaultEmployee") String empname){
    logger.info("The employye id recvd from param is : {} and empname is :{}",empid,empname);
}
// c.e.u.controller.EmployeeController      : The employye id recvd from param is : 25

}
