package com.sprng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

/**
 * Hello  !
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

       // ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
            Doctor doctor=context.getBean(Doctor.class);
            doctor.Assisting();
        doctor.setQualification("MBBS");
        System.out.println( doctor);

        Doctor doctor1=context.getBean(Doctor.class);
        System.out.println(doctor1);
    }


}
