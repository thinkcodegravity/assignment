package Inheritance.LessonInterface;

public class Text implements INotification {

    @Override
    public String sendNotification(String message) {
        return message;
    }
}
