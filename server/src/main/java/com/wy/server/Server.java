package com.wy.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({
        "com.wy.server.*"
})
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

    /**
     * 注册内嵌式Undertow Servlet容器
     * @return
     */
    @Bean
    public EmbeddedServletContainerFactory servletContainerFactory() {
        return new UndertowEmbeddedServletContainerFactory();
    }


}
