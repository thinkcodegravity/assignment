package Inheritance.LessonInterface;

public class Phone implements INotification {

    @Override
    public String sendNotification(String message) {
        return message;
    }
}
