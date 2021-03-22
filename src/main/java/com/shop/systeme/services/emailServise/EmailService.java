package com.shop.systeme.services.emailServise;

import org.springframework.scheduling.annotation.Async;

public interface EmailService {
    @Async
    void send(String emailTo, String subject, String body);
}
