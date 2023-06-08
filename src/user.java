import java.util.HashMap;

public class user {
    private final String username;
    private final String userPassword;
    private boolean loggedIn;
    private HashMap<String, password> passwordBank = new HashMap<>();
    public user(String user, String password){
        this.username = user;
        this.userPassword = password;
        this.loggedIn = false;
    }

    //generates a password for the user and adds it to the password bank
    public void generatePassword(String inputWebsite, String inputWebsiteColor, String inputYear, String inputPetName, String inputRandomCharacter) {
        password password1 = new password(inputWebsite, inputWebsiteColor, inputYear, inputPetName, inputRandomCharacter);
        this.passwordBank.put(inputWebsite, password1);
    }

    //logs in the user
    public void logIn(String input, String inputPassword){
        if(username.equalsIgnoreCase(input)) {
            if(userPassword.equalsIgnoreCase(inputPassword)) {
                this.loggedIn = true;
            }
        }
    }

    public void logOut(){
        this.loggedIn = false;
    }

    //returns whether the user is logged in
    public boolean isLoggedIn(){
        return loggedIn;
    }

    //returns all the user passwords
    public HashMap<String, password> getPasswordBank() {
        return this.passwordBank;
    }

    @Override
    public String toString() {
        return userPassword;
    }
}
