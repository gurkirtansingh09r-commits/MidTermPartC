package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display list of genres
        System.out.println("Choose your favourite Genre from the list below:");
        System.out.println("1. Comedy");
        System.out.println("2. Action");
        System.out.println("3. Drama");
        System.out.println("4. Fantasy");
        System.out.println("5. Mystery");

        System.out.print("Enter your favourite genre: ");
        String genre = scanner.nextLine();

        // Create UserProfile object
        UserProfile userProfile = new UserProfile(name, genre);

        // Confirmation message
        System.out.println("Your userProfile was created successfully!");

        scanner.close();
    }
}
