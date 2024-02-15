package Inheritance.LessonInterface;

public abstract interface ILogin {

    public abstract String register(Integer userId,String password, String email);

    public abstract String login(Integer userId,String password);

    public abstract String changePassword(Integer userId,String newPassword);

}
