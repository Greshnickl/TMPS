package utilities;

import domain.User;

public class UserDecorator {
    protected UserFacade userFacade;

    public UserDecorator(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    public boolean loginUser(String username, String password) {
        return userFacade.loginUser(username, password);
    }

    public void printUserInfo(User user) {
        userFacade.printUserInfo(user);
    }
}
