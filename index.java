import java.util.Scanner;

class index {
    public static void main(String[] args) {
    
        String firstName, lastName, address, city, zipCode;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        lastName = scanner.nextLine();

        System.out.println("Enter your address: ");
        address = scanner.nextLine();

        System.out.println("Enter your city: ");
        city = scanner.nextLine();

        System.out.println("Enter your zip code: ");
        zipCode = scanner.nextLine();

        System.out.println("Your name is: " + firstName + " " + lastName);
        System.out.println("Your address is: " + address);
        System.out.println("Your city is: " + city);
        System.out.println("Your zip code is: " + zipCode);

        scanner.close();
    }
}