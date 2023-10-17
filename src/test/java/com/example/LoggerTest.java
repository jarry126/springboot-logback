package com.example;

import com.example.springboottest.SpringbootTestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author LiuShanshan
 * @version V1.0
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootTestApplication.class)
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    // TRACE < DEBUG < INFO < WARN < ERROR < FATAL。

    @Test
    public void test(){
        logger.debug("测试debug");
        logger.info("测试info");
        logger.warn("测试warn");
        logger.error("测试error");
    }

}
