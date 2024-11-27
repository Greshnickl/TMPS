package domain;

public class Permissions {
    private boolean isAdmin;

    public Permissions(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
