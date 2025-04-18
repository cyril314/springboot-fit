package com.fit;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication
public class FitApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext run = SpringApplication.run(FitApplication.class, args);
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = System.getenv("POST");
        if (Strings.isEmpty(port)) {
            port = run.getEnvironment().getProperty("server.port");
        }
        log.info("---------------------------------------------------------");
        log.info("Access URLs:\n\tLocal: \t\thttp://localhost:{}/\n\tExternal:\t{}://{}:{}/", port, "http", ip, port);
        log.info("---------------------- admin-web ------------------------");
    }
}