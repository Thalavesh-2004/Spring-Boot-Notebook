package com.example.uday_sboot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class UdaySbootApplication {
	//logger class
	private static Logger logger=LoggerFactory.getLogger(UdaySbootApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(UdaySbootApplication.class, args);
//		logger.error("this is error level logg");
	}


}
