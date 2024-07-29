import java.io.IOException;
import java.io.Serializable;

class UserProfile implements Serializable {
    private static final long serialVersionUID = 26292552485L;

    private String login;
    private String email;
    private transient String password;

    public UserProfile(String login, String email, String password) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    // implement readObject and writeObject properly
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); // Serialize the non-transient fields normally.
        String encryptedPassword = ""; // Initialize an empty string for the encrypted password.
        // Encrypt the password.
        for (char c : password.toCharArray()) {
            encryptedPassword += (char) (c + 1); // Shift each character by 1.
        }
        out.writeObject(encryptedPassword); // Serialize the encrypted password.
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // Deserialize the non-transient fields normally.
        String encryptedPassword = (String) in.readObject(); // Deserialize the encrypted password.
        password = ""; // Initialize an empty string for the decrypted password.
        // Decrypt the password.
        for (char c : encryptedPassword.toCharArray()) {
            password += (char) (c - 1); // Shift each character by -1 to decrypt.
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}