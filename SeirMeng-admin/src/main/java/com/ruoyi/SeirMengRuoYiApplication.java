package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * 首页设置
 * /system/main
 *
 * 主页面
 * http://localhost:18090/SeirMengRuoYi/index
 *
 * swagger
 * http://localhost:18090/SeirMengRuoYi/swagger-ui/index.html
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SeirMengRuoYiApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SeirMengRuoYiApplication.class, args);
        System.out.println("////////////////////////////////////////////////////////////////////");
        System.out.println("您的木兰县人民医院慢性病数据管理项目启动成功");
        System.out.println("////////////////////////////////////////////////////////////////////");
    }
}