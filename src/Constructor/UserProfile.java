package Constructor;

public class UserProfile {
    // Declaring the variables for class UserProfile
    String userId;
    String userPassword;
    String userEmail;
    Long userPhone;

    // Constructor-1 with user id and Password
    public UserProfile(String userName, String password) {
        userId = userName;
        userPassword = password;
        System.out.println("Username: " + userName + "& password: " + password);
    }

    // Constructor-2 with email and Password & phone
    public UserProfile(String email, String password, long phone) {
        userEmail = email;
        userPassword = password;
        userPhone=phone;
        System.out.println("Email: " + userEmail + " & password: " + password);
    }

    // Constructor-3 with phone and Password
    public UserProfile(Long phone, String password) {
        userPhone = phone;
        userPassword = password;
        System.out.println("Phone: " + userPhone + " & password: " + password);
    }

    public static void main(String[] args) {
        // Creating instances of UserProfile using different constructors
        UserProfile profile1 = new UserProfile("Sandesh24", "qwert1234%");
        UserProfile profile2 = new UserProfile("Sandesh123@gmail.com", "qwert1234%", 1234567899L);
        
        UserProfile profile3 = new UserProfile(1234567899L, "qwert1234%");
    }
}