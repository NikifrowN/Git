import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Vasya`s age: ");
        int vasyaAge = scanner.nextInt();
        System.out.print("Enter Misha`s age: ");
        int mishaAge = scanner.nextInt();
        System.out.print("Enter Katya`s age: ");
        int katyaAge = scanner.nextInt();

        int min1 = vasyaAge < mishaAge ? vasyaAge : mishaAge;
        int max1 = vasyaAge > mishaAge ? vasyaAge : mishaAge;

        if ((vasyaAge == mishaAge) & (mishaAge == katyaAge)) {
            System.out.println("All ages are the same (" + vasyaAge + " y.o.)");
        }
        else if ((vasyaAge == mishaAge) || (vasyaAge == katyaAge) || (mishaAge == katyaAge)) {
            if (vasyaAge == mishaAge) {
                System.out.println("Minimal age: " + (min1 < katyaAge ? min1 : katyaAge) + " y.o." + "\nMaximum age: " + (max1 > katyaAge ? max1: katyaAge) + " y.o.");
            }
            if ((vasyaAge == katyaAge) || (mishaAge == katyaAge)) {
                System.out.println("Minimal age: " + min1 + " y.o." + "\nMaximum age: " + max1 + " y.o.");
            }
        }
        else if ((katyaAge < vasyaAge) && (katyaAge < mishaAge)) {
            System.out.println("Minimal age: " + katyaAge + " y.o." + "\nMiddle  age: " + min1 + " y.o." + "\nMaximum age: " + max1 + " y.o.");
        }
        else if ((katyaAge > vasyaAge) && (katyaAge > mishaAge)) {
            System.out.println("Minimal age: " + min1 + " y.o." + "\nMiddle  age: " + max1 + " y.o." + "\nMaximum age: " + katyaAge + " y.o.");
        }
    }
}
