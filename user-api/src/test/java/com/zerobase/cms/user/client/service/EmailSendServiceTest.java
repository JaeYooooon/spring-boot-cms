package com.zerobase.cms.user.client.service;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.client.mailgun.SendMailForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest(){
        mailgunClient.sendEmail(SendMailForm.builder()
                .from("dhy04050@naver.com")
                .to("dhy04050@naver.com")
                .subject("Test email form zero base")
                .text("my text")
                .build());

    }
}