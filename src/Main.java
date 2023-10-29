import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        MessagingApp messagingApp = new MessagingApp();

        // Register observers (e.g., notification center)
        messagingApp.registerObserver(new MessageObserver() {
            @Override
            public void notifyNewMessage(String message) {
                System.out.println("Notification Center: New message received - " + message);
            }
        });

        // Send a new message (email or SMS)
        MessageSender sender = MessageSenderFactory.createMessageSender("email");
        sender.sendMessage("Hello, this is an email message!");

        sender = MessageSenderFactory.createMessageSender("sms");
        sender.sendMessage("Hi, this is an SMS message!");
    }
}
