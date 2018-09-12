package com.example.books.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = {"com.example.books.dao"}, sqlSessionFactoryRef =
        "messageSqlSessionFactory")
public class MasterConfog {
    @Bean(name = "messageDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource messageDataSource() {
        return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
    }

    @Bean(name = "messageSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("messageDataSource") DataSource dataSource) throws
            Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "false");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);

        //添加插件
        bean.setPlugins(new Interceptor[]{pageHelper});

//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/message/*
// .xml"));
        return bean.getObject();
    }

    @Bean(name = "messageTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("messageDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "messageSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("messageSqlSessionFactory") SqlSessionFactory
                                                             sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}