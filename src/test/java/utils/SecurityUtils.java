package utils;

public class SecurityUtils {
    public static boolean isTokenSecure(String token) {
        // Example: Check if token starts with 'secure'
        return token != null && token.startsWith("secure");
    }
}