package org.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description 
 * @author Hero
 * @date 2017年11月12日 下午9:18:09
 */

//Spring Boot 应用的标识
@SpringBootApplication
public class HelloWorldApplication 
{
    public static void main( String[] args )
    {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
