package ru.gudyno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.gudyno.Application;

@Configuration
@ComponentScan(basePackageClasses = Application.class)
public class SpringConfig {
}
