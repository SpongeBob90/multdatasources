package com.example.multdatasources.aop;

import com.example.multdatasources.configure.DynamicDataSourceContextHolder;
import com.example.multdatasources.enumFile.DataSourceKey;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Order(-1)
public class multSourceAop {
    @Before("@annotation(targetSource)")
    public void doBefore(JoinPoint joinPoint, TargetSource targetSource){
        DataSourceKey key=targetSource.dataSourceKey();
        if(key==DataSourceKey.DB_MASTER){
            DynamicDataSourceContextHolder.set(key);
        }else{
            DynamicDataSourceContextHolder.set(DataSourceKey.DB_salve);
        }
    }

    @After("@annotation(targetSource)")
    public void doAfter(JoinPoint  joinPoint, TargetSource targetSource){
        DynamicDataSourceContextHolder.remove();
    }
}
