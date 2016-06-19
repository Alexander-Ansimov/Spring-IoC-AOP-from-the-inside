package trueSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alex on 17.06.16.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("trueSpringContext.xml");
        context.getBean("ShareSpeerQuoter", Quoter.class);

    }
}
