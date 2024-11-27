package utilities;

public class OAuthAuthenticatorAdapter implements Authenticator {
    private OAuthAuthenticator oauthAuthenticator;

    public OAuthAuthenticatorAdapter(OAuthAuthenticator oauthAuthenticator) {
        this.oauthAuthenticator = oauthAuthenticator;
    }

    @Override
    public boolean authenticate(String username, String password) {
        // Use OAuth token-based authentication
        return oauthAuthenticator.authenticateWithOAuth(username, password);
    }
}
