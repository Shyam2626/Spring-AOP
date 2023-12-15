package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {

    @Pointcut("within(aop..*)")
    public void authenticatingPointCut() {
        System.out.println("Authentication Function is Called");
    }

    @Pointcut("within(aop..*)")
    public void authorizationPointCut() {
        System.out.println("Authorization Function is Called");
    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate() {
        System.out.println("Authenticating the Request");
    }
}
