package client;

import utilities.OAuthAuthenticator;

public class OAuthAuthenticationTest {
    public static void main(String[] args) {
        OAuthAuthenticator oauthAuthenticator = new OAuthAuthenticator();

        // Test with valid credentials
        boolean result = oauthAuthenticator.authenticateWithOAuth("john_doe", "abc123token");
        System.out.println("Authentication Result (Valid Token): " + result);

        // Test with invalid credentials
        result = oauthAuthenticator.authenticateWithOAuth("john_doe", "wrongToken123");
        System.out.println("Authentication Result (Invalid Token): " + result);
    }
}
