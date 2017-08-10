package com.yy.log4jstudy.buss;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.awt.peer.SystemTrayPeer;

/**
 * Created by zy48461 on 2017/8/10.
 */
@Aspect
@Component
public class LogAspect {
    private static final Logger logger=Logger.getLogger(LogAspect.class);

    @Before(value = ("@annotation(monitor)"))
    public void beforeLog(InbMonitor monitor){
        logger.info("before log:key1="+monitor.key1()+",key2="+monitor.key2()+",key3="+monitor.key3());
    }

    @After(value = "@annotation(monitorTest)")
    public void afterLog(InbMonitor monitorTest){
        logger.info("After log:key1="+monitorTest.key1()+",key2="+monitorTest.key2()+",key3="+monitorTest.key3());
    }
}
