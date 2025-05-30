package com.bt.service.query;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan("com.bt.service.query.mapper")
public class BookTicketServiceQueryMain {

    public static void main(String[] args) {
//        String jdbcUrl = "jdbc:mysql://localhost:3306/book-ticket?useSSL=false&serverTimezone=UTC";
//        String username = "root";
//        String password = "123456";
//        String outputDir = "src/main/java";  // 生成路径
//        String basePackage = "com.example.project";  // 基础包名
//        BaseCodeGenerate.generateCode(jdbcUrl, username, password, outputDir, basePackage,"flight");
        
        ApplicationContext ctx = SpringApplication.run(BookTicketServiceQueryMain.class, args);
    }


}
