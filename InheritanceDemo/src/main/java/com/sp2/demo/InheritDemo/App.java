package com.sp2.demo.InheritDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sp2.demo.ChildInhert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
        ChildInhert sd =  (ChildInhert)factory.getBean("spring");
        System.out.println(sd.getProperty()+"\t"+sd.getMoney()+"\t"+sd.getBadhabbits()+"\t"+sd.getGoodhabbits()   );
        
    }
}
