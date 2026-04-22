package com.yusufjon.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class YusAopExpressions {

    @Pointcut("execution(* com.yusufjon.aopdemo.dao.*.*(..))")
    public void forDaoPackage() {
    }


    @Pointcut("execution(* com.yusufjon.aopdemo.dao.*.get*(..))")
    public void getter() {
    }


    @Pointcut("execution(* com.yusufjon.aopdemo.dao.*.set*(..))")
    public void setter() {
    }

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {
    }
}
