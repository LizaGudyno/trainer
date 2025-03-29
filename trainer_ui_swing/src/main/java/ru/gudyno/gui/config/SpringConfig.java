package ru.gudyno.gui.config;

import ru.gudyno.spring.hibernate.config.DbConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Configuration
@Import(DbConfig.class)
@ComponentScan(basePackages = "ru.gudyno")
@PropertySource("jdbc.properties")
public class SpringConfig {

}