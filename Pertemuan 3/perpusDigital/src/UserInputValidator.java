//Nama    : Fendi Ardianto
//NIM     : 24060122130077
//Lab     : PBO D1

import java.util.regex.Pattern;

public class UserInputValidator {
    public static void validateUsername(String username) {
      assert(username.length() >= 5) : "Username must be at least 5 characters long";
      assert(username.length() <= 20) : "Username must be at most 20 characters long";
      assert Pattern.matches("[a-zA-Z][a-zA-Z0-9_]+", username) : "Invalid username";
    }
    
    public static void validateEmail(String email) {
      assert Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", email) : "Invalid email address";
    }
  
    public static void validateAge(int age) {
      assert(age>=17 && age<=99) : "Age must be between 17 and 99";
    }
  }
  