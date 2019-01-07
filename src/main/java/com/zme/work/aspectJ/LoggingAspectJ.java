package com.zme.work.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @auth zme on 2019/1/4 14:26
 **/
@Component
@Aspect
public class LoggingAspectJ {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspectJ.class);
    @Pointcut("execution(* com.zme.work.service..*.*(..))")
    public void declareJoinPoint(){};

    @Before("declareJoinPoint()")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("before method " + methodName + " begin with:" + Arrays.asList(args));
    }
    @After("declareJoinPoint()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("after method " + methodName +
                " end " + Arrays.asList(args));
    }

    @AfterReturning(pointcut = "declareJoinPoint()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,
                               Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName +
                " ends with " + result);
    }

    @AfterThrowing(pointcut = "declareJoinPoint()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName +
                " occurs excetion:" + e);
    }

    @Around("execution(public double com.zme.work.service.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint pjd) {

        Object result = null;
        String methodName = pjd.getSignature().getName();

        try {
            //前置通知
            System.out.println("The method " + methodName + " begins with " + Arrays.asList(pjd.getArgs()));
            //执行目标方法
            result = pjd.proceed();
            //返回通知
            System.out.println("The method " + methodName + " ends with " + result);
        } catch (Throwable e) {
            //异常通知
            System.out.println("The method " + methodName + " occurs exception:" + e);
            throw new RuntimeException(e);
        }
        //后置通知
        System.out.println("The method " + methodName + " ends");

        return result;
    }


}
