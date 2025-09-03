package com.example;

import com.example.email.GmailService;

public class Main {
    public static void main(String[] args) {
        GmailService gmailService = new GmailService();
        String to = "reciever@gmail.com"; // replace by the actual sender
        String from = "sender@gmail.com"; // replace by the actual sender
        String subject = "My java mail";
        String text = "Hi, how are you?";
        boolean b = gmailService.sendEmail(to, from, subject, text);

        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is a problem in sending email");
        }
    }
}