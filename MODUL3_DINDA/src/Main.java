import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean repeat = true;

        System.out.println("== Menu Program ==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");

        int menu;
        int lengthsquare;
        int radiuscircle;
        int sidetrapezoid;


        System.out.print("Select menu : ");
        menu = input.nextInt();

        do {
            try {
                switch(menu){
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        lengthsquare = input.nextInt();
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        radiuscircle = input.nextInt();
                    case 3:
                        System.out.print("Insert the side of the trapezoid : ");
                        sidetrapezoid = input.nextInt();
                    case 0:
                        System.out.print("Program Done");
                    default:
                        System.out.print("Option not Available");
                        continue;
                }
                repeat = ;

            } catch (InputMismatchException e) {
                System.out.println("Input must be a number");
            } catch (IllegalArgumentException e) {
                System.out.println("Input must be a number");
            } catch (InterruptedException e) {
                System.out.println("Input must be a number");
            }
        } while (repeat);

    }
} 

