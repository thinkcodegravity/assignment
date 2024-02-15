package Inheritance.LessonInterface;

public class Email implements INotification {
    @Override
    public String sendNotification(String message) {
        return message;
    }
}
