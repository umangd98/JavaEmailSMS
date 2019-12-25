package com.example.SMS;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/msg")
public class Controller
{

    @GetMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) throws URISyntaxException, UnirestException {

//        RestTemplate restTemplate = new RestTemplate();
//
//        final String baseUrl = "https://www.fast2sms.com/dev/bulk";
//        URI uri = new URI(baseUrl);
//
//        SMSBody body = new SMSBody();
//        body.setAuthorization("");
//        body.setSender_id("FSTSMS");
//        body.setLanguage("english");
//        body.setMessage(message);
//        body.setRoute("p");
//        body.setNumbers("9205834773");

//        HttpEntity<SMSBody> requestEntity = new HttpEntity<>(body, null);
//
//            restTemplate.exchange(uri, HttpMethod.GET, requestEntity, String.class);

        HttpResponse response = Unirest.get("https://www.fast2sms.com/dev/bulk?authorization=&sender_id=FSTSMS&message=This%20is%20a%20test%20message&language=english&route=p&numbers=9205834773")
                .header("cache-control", "no-cache")
                .asString();

    }
}
