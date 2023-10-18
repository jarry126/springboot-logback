package com.example.springboottest.controller;

import com.example.springboottest.entity.CreditManagerProduct;
import com.example.springboottest.service.TestService;
import com.sun.xml.internal.ws.client.ResponseContext;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiuShanshan
 * @version V1.0
 * @Description
 */
@RestController
@RequestMapping(value = "/test")
@Slf4j   //加入lombok依赖，使用@Slf4j ，就能直接在代码中使用log.info 注解
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    private TestService testService;


    @GetMapping("/getone")
    public String getAllListByLevel(){
        logger.info("调用findall接口{}", 23);
        log.info("使用log:{}", 45);
        log.debug("测试debug");
        log.error("报错测试");
//        int i = 1/0;
//        List<CreditManagerProduct> findall = testService.findall();
        return "返回成功";
    }

}
