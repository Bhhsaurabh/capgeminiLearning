package polymorphism;

class Notification {
    void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {
    void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {
    void send() {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification extends Notification {
    void send() {
        System.out.println("Sending Push Notification");
    }
}

class NotificationSystem {
    public static void main(String[] args) {
        Notification n;

        n = new EmailNotification();
        n.send();

        n = new SMSNotification();
        n.send();

        n = new PushNotification();
        n.send();
    }
}