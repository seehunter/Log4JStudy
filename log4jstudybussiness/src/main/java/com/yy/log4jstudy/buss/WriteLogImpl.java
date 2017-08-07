/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.yy.log4jstudy.buss;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author zy.
 * @@version $Id: WriteLogImpl, v 0.1 2017/8/7 23:42 zy Exp $
 */
@Component("writeLog")
public class WriteLogImpl implements WriteLog {
    private static final Logger logger = Logger.getLogger(WriteLog.class);

    /**
     * 记录日志
     */
    public void writeLog() {
        logger.info("i just want to have a try");
    }
}
