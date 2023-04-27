package com.example.customermanagement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;


public class Log4j2Application {

    private static Logger logger = LogManager.getLogger(Log4j2Application.class);

    public static void main(String[] args) {

        // 当没有任何配置文件的时候, 只会打印error及以上级别，但是至少，他能打印

        logger.debug(" debug level ");
        logger.info(" info level ");
        logger.warn(" warn level ");
        logger.error(" error level ");
        logger.fatal(" fatal level ");
        System.out.println("测试");
    }
}

