package controlflows;

public class UserCredentials {
    private String registeredPhone;
    private String registeredUserId;
    private String password;

    public UserCredentials(String registeredPhone, String registeredUserId, String password) {
        this.registeredPhone = registeredPhone;
        this.registeredUserId = registeredUserId;
        this.password = password;
    }

    public String getUserId(String phone) {
        if (phone.equals(registeredPhone)) {
            return registeredUserId;
        } else {
            return null;
        }
    }

    public String getPassword(String userId) {
        if (userId.equals(registeredUserId)) {
            return password;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        UserCredentials user = new UserCredentials("1234567890", "user123", "password123");

        String userId = user.getUserId("1234567890");
        System.out.println("User ID for phone 1234567890: " + userId); // Output: user123

        String password = user.getPassword("user123");
        System.out.println("Password for user ID user123: " + password); // Output: password123
    }
}
