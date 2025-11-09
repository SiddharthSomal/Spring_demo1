package com.pixel0.demo.Service.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectFirst {
    @Before("execution(com.pixel0.demo.Service.*.*(..))")
    public void startMsg(){
        System.out.println("Aspect has started");
    }

    @Around("@annotation(com.pixel0.demo.Annotations.CustomAnnotation)")
    public Object BeforeAfterFunc(ProceedingJoinPoint joinPoint) throws Throwable{

        System.out.println("Printing before the action of around");
        Object result = joinPoint.proceed();
        System.out.println("Printing after the action of around");
        return result;
    }

    @After("within(com.pixel0.demo.Controller)")
    public void endMsg(){
        System.out.println("Printing after the ending of allS");
    }


}
