package utilities;

import domain.User;

public class UserFacade {
    private UserAuthenticator userAuthenticator;

    public UserFacade(UserAuthenticator userAuthenticator) {
        this.userAuthenticator = userAuthenticator;
    }

    public boolean loginUser(String username, String password) {
        return userAuthenticator.authenticateUser(username, password);
    }

    public void printUserInfo(User user) {
        System.out.println("Username: " + user.getUsername());
    }
}
