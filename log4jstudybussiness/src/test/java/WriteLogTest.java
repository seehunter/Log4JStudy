
/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

import com.yy.log4jstudy.buss.WriteLog;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zy.
 * @@version $Id: WriteLogTest, v 0.1 2017/8/7 23:34 zy Exp $
 */
public class WriteLogTest {
    private WriteLog writeLog;

    @Before
    public void beforeWrite() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:log4jStudyBussiness.xml");
        writeLog = (WriteLog) applicationContext.getBean("writeLog");

    }

    @Test
    public void writeLog(){
        this.writeLog.writeLog();
    }
}
