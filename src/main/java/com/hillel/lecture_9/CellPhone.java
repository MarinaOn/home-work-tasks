package com.hillel.lecture_9;

public class CellPhone extends Phone {

    public CellPhone(String provider, String type, String manufacturer) {
        super(provider, type, manufacturer);
    }

    private String sms;

    public String setSms(String sms) {
        this.sms = sms;
        return sms;
    }
    public String sendSms(String sms) {
        if (!this.sms.isEmpty()) {
            return "Your message was sent successfully!";
        } else {
            return "Sms cannot be empty";
        }
    }
}
