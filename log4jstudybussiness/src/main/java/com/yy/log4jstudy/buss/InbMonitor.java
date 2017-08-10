package com.yy.log4jstudy.buss;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by zy48461 on 2017/8/10.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface InbMonitor {
     String key1();

     int key2() default 2;

     String key3() default "zy";
}
