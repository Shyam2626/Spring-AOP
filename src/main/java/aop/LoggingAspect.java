package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* aop.ShoppingCart.checkOut())")
    public void beforeLogger(){
        System.out.println("Logged In");
    }
    @After("execution(* aop.ShoppingCart.checkOut())")
    public void afterLogger(){
        System.out.println("Logged Out");
    }
}
