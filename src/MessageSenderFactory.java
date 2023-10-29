// MessageSender Factory
public class MessageSenderFactory {
    public static MessageSender createMessageSender(String type) {
        if ("email".equalsIgnoreCase(type)) {
            return new EmailSender();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SMSSender();
        }
        return null;
    }
}
