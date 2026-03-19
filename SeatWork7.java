class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

// Main class
public class Main {

    static void checkPassword(String password) throws PasswordException {
        if (password.length() < 8) {
            throw new PasswordException("Password must be at least 8 characters long");
        } else {
            System.out.println("Password accepted");
        }
    }

    public static void main(String[] args) {
        try {
            checkPassword("abc12345");
        } catch (PasswordException e) {
            System.out.println("User-Defined Exception:f " + e.getMessage());
        }
    }
}
