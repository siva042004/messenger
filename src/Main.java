
public class Main {
    public static void main(String[] args) {
        SMSMessagingService sms=new SMSMessagingService();
        EmailMessagingService email=new EmailMessagingService();
        WhatsAppMessagingService whatsapp=new WhatsAppMessagingService();
        MessagingService.greeting();
        sms.sendMessage();
        email.sendMessage();
        whatsapp.sendMessage();

    }
}

interface MessagingService{

    static void greeting(){
        System.out.println("Hello!");
    }

    void sendMessage();
}

class SMSMessagingService implements MessagingService{

    @Override
    public void sendMessage() {
        System.out.println("SMSMessagingService executed");
    }
}

class EmailMessagingService implements MessagingService{
    public void sendMessage()
    {
        System.out.println("EmailMessagingService executed");
    }

}
class WhatsAppMessagingService implements MessagingService{

    @Override
    public void sendMessage() {
        System.out.println("WhatsAppMessagingService executed");
    }
}
