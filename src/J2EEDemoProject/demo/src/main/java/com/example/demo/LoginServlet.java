package com.example.demo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        // Dummy authentication (replace this with your actual authentication logic)
        boolean isAuthenticated = authenticate(email, password);
        
        JSONObject jsonResponse = new JSONObject();
        
        if (isAuthenticated) {
            // Set success message in JSON response
            jsonResponse.put("success", true);
            jsonResponse.put("message", "Login successful!");
        } else {
            jsonResponse.put("success", false);
            jsonResponse.put("error", "Invalid email or password. Please try again.");
        }
        
        // Set content type and write JSON response
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(jsonResponse.toString());
    }
    
    // Dummy authentication method (replace this with your actual authentication logic)
    private boolean authenticate(String email, String password) {
        return "user".equals(email) && "password".equals(password);
    }
}
