package bzh.zomzog.prez.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PonyAspect {

    @Pointcut("execution(* bzh.zomzog.prez.aop.domain.Pony.makeItWalk(..))")
    public void callMakeItWalk() { }

    @Pointcut("@within(bzh.zomzog.prez.aop.Slow)")
    public void slowAnnotation() { }


    @Before("slowAnnotation()")
    public void beforeAnnotation(JoinPoint joinPoint) {
        System.out.println("Annotation : " + joinPoint + " for " + joinPoint.getTarget());
    }

    @Before("callMakeItWalk()")
    public void beforeExecution(JoinPoint joinPoint) {
        System.out.println("Excecution : " + joinPoint + " for " + joinPoint.getTarget());
    }

    @Before("callMakeItWalk() && slowAnnotation()")
    public void slow(JoinPoint joinPoint) {
        System.out.println("E&&A : " + joinPoint);
        int distance = (Integer) joinPoint.getArgs()[0];
        if (distance > 10) {
            throw new RuntimeException("Distance is too long for a pony");
        }
    }
}
