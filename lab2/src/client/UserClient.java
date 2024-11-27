package client;

import domain.User;
import factories.UserFactory;
import utilities.*;

public class UserClient {
    public static void main(String[] args) {
        // Create a user
        User user = UserFactory.createUser("john_doe", "password123");

        // Use OAuth authentication (Adapter pattern)
        OAuthAuthenticator oauthAuthenticator = new OAuthAuthenticator();
        Authenticator authAdapter = new OAuthAuthenticatorAdapter(oauthAuthenticator);

        // Create UserAuthenticator (Facade pattern)
        UserAuthenticator userAuthenticator = new UserAuthenticator(authAdapter);

        // Create UserFacade to interact with user
        UserFacade userFacade = new UserFacade(userAuthenticator);

        // Decorate UserFacade with extra functionality (Decorator pattern)
        UserDecorator userDecorator = new UserDecorator(userFacade);

        // Login and print user info
        if (userDecorator.loginUser(user.getUsername(), user.getPassword())) {
            userDecorator.printUserInfo(user);
        }
    }
}
