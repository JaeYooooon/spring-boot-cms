package com.zerobase.cms.user.controller;

import com.zerobase.cms.user.client.service.test.EmailSendService;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final EmailSendService emailSendService;
    @GetMapping
    public Response sendTestEmail(){
        return emailSendService.sendEmail();
    }
}
