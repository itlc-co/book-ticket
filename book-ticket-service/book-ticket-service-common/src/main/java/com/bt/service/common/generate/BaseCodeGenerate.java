package com.bt.service.common.generate;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class BaseCodeGenerate {



    public static void generateCode(String url,String username,String password,String dir,String basePackage,String ... tables) {
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("lico")
                            .outputDir(dir);
                })
                .packageConfig(builder -> {
                    builder.parent(basePackage)
                            .pathInfo(Collections.singletonMap(
                                    OutputFile.xml,
                                    "src/main/resources/mapper"
                            ));
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables)
                            .addTablePrefix("tbl_", "sys_")
                            .entityBuilder()
                            .enableLombok()
                            .enableTableFieldAnnotation()
                            .mapperBuilder()
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .controllerBuilder()
                            .enableRestStyle();
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }




}
