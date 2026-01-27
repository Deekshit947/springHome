package deekshit.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("deekshit/ioc/beans.xml");
        System.out.println("config loaded");
        Sim sim = context.getBean("sim", Sim.class);
        sim.data();
        sim.calling();
    }
}
