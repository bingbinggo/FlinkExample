package com.bingo.config;

import com.bingo.bean.Yellow;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Profile：
 * 		Spring为我们提供的可以根据当前环境，动态的激活和切换一系列组件的功能；
 *
 * 开发环境、测试环境、生产环境；
 * 数据源：(/A)(/B)(/C)；
 *
 *
 * @Profile：指定组件在哪个环境的情况下才能被注册到容器中，不指定，任何环境下都能注册这个组件
 *
 * 1）、加了环境标识的bean，只有这个环境被激活的时候才能注册到容器中。默认是default环境
 * 2）、写在配置类上，只有是指定的环境的时候，整个配置类里面的所有配置才能开始生效
 * 3）、没有标注环境标识的bean在，任何环境下都是加载的；
 */
@Configuration
public class MainConfigOfProfile {

    @Value("${db.user}")
    private String user;

    @Value("${db.DriverClass}")
    private String driverclass;

    @Bean//没有标注环境标识的bean在，任何环境下都是加载的；
    public Yellow yellow(){
        return new Yellow();
    }

    @Profile("test")
    @Bean(name = "DataSourcetest")
    public DataSource dataSourcetest(@Value("${db.password}")String password) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClass(driverclass);
        return dataSource;
    }

    @Profile("pro")
    @Bean(name = "DataSourcepro")
    public DataSource dataSourcepro(@Value("${db.password}")String password) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/prod");
        dataSource.setDriverClass(driverclass);
        return dataSource;
    }

    @Profile("dev")
    @Bean(name = "DataSourcedev")
    public DataSource dataSourcedev(@Value("${db.password}")String password) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/dev");
        dataSource.setDriverClass(driverclass);
        return dataSource;
    }
}
