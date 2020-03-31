import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            displayMenu();
            int choice = input.nextInt();
        }

    }

    private static void displayMenu(){
        System.out.println("Select an option:");
        System.out.println("1. Add Load Data");
        System.out.println("2. Add Weapon Profile");
        System.out.println("3. Add Test Information");
        System.out.println("4. Request Load Data");
        System.out.print("Choice: ");
    }
}
