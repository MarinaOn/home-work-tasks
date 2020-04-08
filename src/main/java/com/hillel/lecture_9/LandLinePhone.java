package com.hillel.lecture_9;

public class LandLinePhone extends Phone {

        private String phoneNumber;

    public LandLinePhone(String provider, String type, String manufacturer) {
        super(provider, type, manufacturer);
    }

    public String setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return phoneNumber;

    }

    public String call() {
        return "No one can answer your call on " + this.phoneNumber + ", please, leave a message...";
    }

}
