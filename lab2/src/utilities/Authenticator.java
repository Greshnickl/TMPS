package utilities;

public interface Authenticator {
    boolean authenticate(String username, String password);
}