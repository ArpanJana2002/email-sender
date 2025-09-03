package com.example.email;

import jakarta.activation.MimeType;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;


public class GmailService {
    public boolean sendEmail(String to, String from, String subject, String text) {
        boolean flag = false;

        //logic
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        String username = "yourgmail@gmail.com"; //  your Gmail address
        String password = "your-app-password"; // the 16-char app password (without spaces)

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(from));
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mimeMessage.setSubject(subject);
            mimeMessage.setText(text);

            //send the message
            Transport.send(mimeMessage);

            flag = true; //success
        } catch (MessagingException e) {
            e.printStackTrace();
            flag = false;

        }
        return flag;
    }
}