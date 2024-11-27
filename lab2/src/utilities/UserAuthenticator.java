package utilities;

public class UserAuthenticator {
    private Authenticator authenticator;

    public UserAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public boolean authenticateUser(String username, String password) {
        return authenticator.authenticate(username, password);
    }
}
