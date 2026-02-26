import java.util.Scanner;
/**
 * 
 *
 * @Ahmir Devezin
 * @2/25/26
 */
public class Runner
{
    public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);

    // First Pet - default constructor
    Pet pet1 = new Pet();
    System.out.println(pet1);

    // Second Pet - custom constructor
    Pet pet2 = new Pet("Dog", "Buster", 11);
    System.out.println(pet2);

    // Third Pet - user input
    System.out.println("Enter animal type:");
    String type = scnr.nextLine();

    System.out.println("Enter animal name:");
    String name = scnr.nextLine();

    System.out.println("Enter animal age:");
    int age = scnr.nextInt();

    Pet pet3 = new Pet(type, name, age);

    System.out.println();
    System.out.println(pet3);

    scnr.close();
}
}