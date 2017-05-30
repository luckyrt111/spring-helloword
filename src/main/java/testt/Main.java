package testt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DELL on 05/30/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        account account1 = (account) applicationContext.getBean("acount");
//        System.out.println("" +account1.print());
        System.out.println("Id: "+account1.getId());
        System.out.println("Name: "+account1.getName());
        System.out.println("balance: "+account1.getBalance());
    }
}
