package com.sql.api.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Value("${SERVER_PORT}")
    private String serverPort;

    // ... rest of your code
}
