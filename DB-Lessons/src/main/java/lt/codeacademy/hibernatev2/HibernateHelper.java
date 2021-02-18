package lt.codeacademy.hibernatev2;

import org.hibernate.cfg.Configuration;

public class HibernateHelper {
    public static Configuration createConfiguration() {
        Configuration cfg = new Configuration();
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        cfg.setProperty("hibernate.connection.driver_class", "org.h2.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:h2:C:\\Users\\pcner\\Desktop\\h2\\Hospital");
//        cfg.setProperty("hibernate.connection.autocommit", "true");
        return cfg;
    }
}
