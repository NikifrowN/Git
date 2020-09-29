import java.util.Scanner;

public class Age {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 ages:");
        System.out.print("Vasya age is ");
        int vasyaAge = in.nextInt ();
        System.out.print("Misha age is ");
        int mishaAge = in.nextInt ();
        System.out.print("Katya age is ");
        int katyaAge = in.nextInt ();

        int minA = vasyaAge < mishaAge? vasyaAge : mishaAge;
        int maxA = vasyaAge > mishaAge? vasyaAge : mishaAge;

        if (vasyaAge == mishaAge & vasyaAge == katyaAge & mishaAge == katyaAge) {
            System.out.println("Everybody has the same age of: " + vasyaAge);
        }
        else if (vasyaAge == mishaAge || vasyaAge == katyaAge || mishaAge == katyaAge) {
            if (vasyaAge == mishaAge) {
                System.out.println("Minimal age: " + (vasyaAge < katyaAge ? vasyaAge : katyaAge) + "\nMaximum age: " + (vasyaAge > katyaAge ? vasyaAge : katyaAge));
            }
            if (vasyaAge == katyaAge || mishaAge == katyaAge) {
                System.out.println("Minimal age: " + minA + "\nMaximum age: " + maxA);
            }
        }
        else if (katyaAge < vasyaAge && katyaAge < vasyaAge) {
            System.out.println("Minimal age: " + katyaAge + "\nMiddle age:  " + minA + "\nMaximum age: " + maxA);
        }
        else if (katyaAge > vasyaAge && katyaAge > vasyaAge) {
            System.out.println("Minimal age: " + minA + "\nMiddle age:  " + maxA + "\nMaximum age: " + katyaAge);
        }

    }
}
