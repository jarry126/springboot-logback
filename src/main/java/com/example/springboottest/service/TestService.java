package com.example.springboottest.service;

import com.example.springboottest.entity.CreditManagerProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiuShanshan
 * @version V1.0
 * @Description
 */
@Service
public class TestService {

    @Resource //是用在JavaBean中的注解，通过byType形式，用来给指定的字段或方法注入所需的外部资源。
    private JdbcTemplate jdbcTemplate; //jdbc连接工具类


    //查询所有数据
    public List<CreditManagerProduct> findall() {
        String sql = "select * from dr_credit_manager_product";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<CreditManagerProduct>(CreditManagerProduct.class));
    }


}
