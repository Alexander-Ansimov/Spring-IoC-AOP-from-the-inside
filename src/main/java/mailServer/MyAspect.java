package mailServer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by alex on 18.06.16.
 */

@Component
@Aspect
public class MyAspect {
    @Before("execution(* mailServer..*.get*(..))")
    public void beforeHPMetods(){
        System.out.println("qqqqqqqq");
    }
}
