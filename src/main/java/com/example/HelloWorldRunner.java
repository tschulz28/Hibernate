package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * A CommandLineRunner to execute Hello World logic at startup.
 * <p><b>Remark:</b> This class is automatically detected by Spring Boot
 * due to component scanning (same package as <code>HelloWorld</code>).<br>
 * Thus, it is registered as a Spring Bean.<br>
 * Spring recognizes that <code>MessageService</code> is required in the
 * constructor. <code>MessageService</code> is automatically detected as bean in
 * the application context and injects the bean automatically (Dependency Injection).<br>
 * Spring Boot automatically calls the <code>run</code> method after the
 * application context is loaded.<br>
 */
@Component
public class HelloWorldRunner implements CommandLineRunner {

    private final MessageService service;

    public HelloWorldRunner(MessageService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        Message msg = service.saveMessage("Hello World with Spring Boot + JPA!");
        service.printMessage(msg.getId());
    }
}
