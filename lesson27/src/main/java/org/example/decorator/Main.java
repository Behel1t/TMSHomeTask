package org.example.decorator;

public class Main {
    public static void main(String[] args) {
        EmailNotification emailNotification=new EmailNotification();
        SmsNotifaction smsNotifaction=new SmsNotifaction(emailNotification);
        ViberNotifaction viberNotifaction=new ViberNotifaction(smsNotifaction);
        sendNotification(viberNotifaction);

    }
    private static void sendNotification(Notification notification){
        notification.send();
    }
}
