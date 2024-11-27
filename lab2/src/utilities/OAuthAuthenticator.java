package utilities;

import java.util.HashMap;
import java.util.Map;

public class OAuthAuthenticator {

    // Simulate a token database or service with valid tokens
    private static final Map<String, String> validTokens = new HashMap<>();

    static {
        // Simulating a database of users and their valid OAuth tokens
        validTokens.put("john_doe", "abc123token");
        validTokens.put("jane_doe", "xyz789token");
    }

    public boolean authenticateWithOAuth(String username, String token) {
        // Simulate checking the OAuth token for the given username
        System.out.println("Authenticating " + username + " with OAuth token...");

        // Check if the username exists and if the provided token matches the valid token
        String validToken = validTokens.get(username);

        if (validToken != null && validToken.equals(token)) {
            System.out.println("Authentication successful for " + username);
            return true;
        } else {
            System.out.println("Authentication failed for " + username);
            return false;
        }
    }
}
