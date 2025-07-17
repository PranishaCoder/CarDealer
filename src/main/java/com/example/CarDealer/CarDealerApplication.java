package com.example.CarDealer;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class CarDealerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CarDealerApplication.class, args);
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Scanner sc = new Scanner(System.in);
		String beanid="";
		int choice;
		do
		{
			System.out.println("1.Cyber Truck");
			System.out.println("2.Family Car");
			System.out.println("3.Sports car");
			System.out.println("4.Exit");
			System.out.print("Enter a number of car which you want to buy:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				beanid="cyber";
				break;
			case 2:
				beanid="family";
				break;
			case 3:
				beanid="sports";
				break;
			case 4:
				System.out.println("Exiting!!");
				break;
			default:
				System.out.println("Wrong Choice!!!");
				break;
			}
			
			Car obj = (Car)context.getBean(beanid);
			obj.showCarDetails();
		}while(choice!=4);
		
		
		
		
	}

}
