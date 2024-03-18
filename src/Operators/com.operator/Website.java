public class Website 
{ 
    private static String userId = "admin";
    public static void login(String userID, String password)
    {
        if(userID.equals(userId))
        {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }

    }

    public static void main(String[] args) {
        String userID = "admi";
        String loginPassword  = "admin123";

        login(userID, loginPassword);

     }


}
