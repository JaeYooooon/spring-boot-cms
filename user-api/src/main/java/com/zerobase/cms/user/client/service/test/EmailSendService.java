package com.zerobase.cms.user.client.service.test;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.client.mailgun.SendMailForm;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public Response sendEmail() {

        SendMailForm form = SendMailForm.builder()
                .from("dhy04050@naver.com")
                .to("dhy04050@naver.com")
                .subject("Test email form zero base")
                .text("my text")
                .build();

        return mailgunClient.sendEmail(form);
    }
}
