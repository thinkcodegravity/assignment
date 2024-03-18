public class Login 
{
    private static String userId = "admin";
    private static String password = "admin123";

    public static void login(String loginId, String loginPassword) 
     {
        if(loginId.equals(userId) && loginPassword.equals(password))
        {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }

     }
     public static void main(String[] args) {
        String loginId = "admin";
        String loginPassword  = "admin123";

        login(loginId, loginPassword);

     }
}
