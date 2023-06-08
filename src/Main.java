import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        HashMap<String, user> userBank = new HashMap<>();

        while (running==true) {
            System.out.println("Do you wish to sign in or log in?");
            String userAnswer = sc.nextLine();
            if (userAnswer.equalsIgnoreCase("Sign in")) {
                System.out.println("Enter your username:");
                String userEntrance = sc.nextLine();
                userEntrance = userEntrance.toLowerCase();

                System.out.println("Enter your password:");
                String passwordEntrance = sc.nextLine();

                user newUser = new user(userEntrance, passwordEntrance);
                userBank.put(userEntrance, newUser);
                System.out.println(userBank);

            } else if (userAnswer.equalsIgnoreCase("Log in")) {
                System.out.println("Enter your username:");
                String userNameEntrance = sc.nextLine();
                userNameEntrance = userNameEntrance.toLowerCase();

                System.out.println("Enter your password:");
                String userPasswordEntrance = sc.nextLine();

                user currentUser = userBank.get(userNameEntrance);
                currentUser.logIn(userNameEntrance, userPasswordEntrance);
                if (currentUser.isLoggedIn()){
                    while (currentUser.isLoggedIn()){
                        System.out.println("Do you wish to add a password, print all passwords or quit?");
                        String answer = sc.nextLine();

                        if(answer.equalsIgnoreCase("add")){
                            System.out.println("Enter the name of your pet: ");
                            String petName = sc.nextLine();

                            System.out.println("Enter the your year of birth: ");
                            String year = sc.nextLine();

                            System.out.println("Enter the website for the password: ");
                            String website = sc.nextLine();

                            System.out.println("Enter the predominant color of the website: ");
                            String websiteColor = sc.nextLine();

                            System.out.println("Enter a random character (&, %, $...): ");
                            String randomCharacter = sc.nextLine();

                            currentUser.generatePassword(website, websiteColor, year, petName, randomCharacter);

                        } else if (answer.equalsIgnoreCase("print")) {
                            System.out.println(currentUser.getPasswordBank());
                        } else if (answer.equalsIgnoreCase("quit")) {
                            currentUser.logOut();
                        }
                    }
                } else {
                    System.out.println("Log in failed, please try again!");
                }
            }


        }
    }
}