package com.bingo.config;

import com.bingo.bean.Yellow;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Profile��
 * 		SpringΪ�����ṩ�Ŀ��Ը��ݵ�ǰ��������̬�ļ�����л�һϵ������Ĺ��ܣ�
 *
 * �������������Ի���������������
 * ����Դ��(/A)(/B)(/C)��
 *
 *
 * @Profile��ָ��������ĸ�����������²��ܱ�ע�ᵽ�����У���ָ�����κλ����¶���ע��������
 *
 * 1�������˻�����ʶ��bean��ֻ����������������ʱ�����ע�ᵽ�����С�Ĭ����default����
 * 2����д���������ϣ�ֻ����ָ���Ļ�����ʱ������������������������ò��ܿ�ʼ��Ч
 * 3����û�б�ע������ʶ��bean�ڣ��κλ����¶��Ǽ��صģ�
 */
@Configuration
public class MainConfigOfProfile {

    @Value("${db.user}")
    private String user;

    @Value("${db.DriverClass}")
    private String driverclass;

    @Bean//û�б�ע������ʶ��bean�ڣ��κλ����¶��Ǽ��صģ�
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
