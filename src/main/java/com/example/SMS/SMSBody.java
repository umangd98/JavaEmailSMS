package com.example.SMS;

public class SMSBody {
    private String authorization;
    private String sender_id;
    private String message;
    private String language;
    private String route;
    private String numbers;


    // Getter Methods

    public String getAuthorization() {
        return authorization;
    }

    public String getSender_id() {
        return sender_id;
    }

    public String getMessage() {
        return message;
    }

    public String getLanguage() {
        return language;
    }

    public String getRoute() {
        return route;
    }

    public String getNumbers() {
        return numbers;
    }

    // Setter Methods

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }
}
