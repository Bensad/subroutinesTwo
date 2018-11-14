/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subroutine;
import java.util.Scanner;
/**
 *
 * @author besad0473
 */
public class Subroutine {
        public static void perimeter(){
            Scanner input = new Scanner(System.in);
            double side1;
            double side2;
            double prim;
            System.out.println("please enter 2 sides");
            side1 = input.nextInt();
            side2 = input.nextInt();
            prim = side1 + side2 ;
            prim = prim*2;
            System.out.println("perimeter is "+ prim);
        }
        public static void rad(){
            Scanner input = new Scanner(System.in);
            double diameter;
            double rad;
            System.out.println("enter the diameter");
             diameter = input.nextInt();
             rad = diameter*2;
             System.out.println("Raduis is "+ rad);
        }
        public static void av(){
            Scanner input = new Scanner(System.in);
            double nums;
            double num1;
            double num2;
            double num3;
            double num4;
            double solved;
            System.out.println("average of how many numbers? (max 4)");
            nums = input.nextInt();
            if (nums == 1) {
                System.out.println("What is the number");
                num1 = input.nextInt();
                System.out.println("The average is "+ num1);
            }
            if (nums == 2) {
                System.out.println("What is the numbers");
                num1 = input.nextInt();
                num2 = input.nextInt();
                solved = num1 + num2/2;
                System.out.println("The average is "+ solved);
            }
            if (nums == 3) {
                System.out.println("What is the numbers");
                num1 = input.nextInt();
                num2 = input.nextInt();
                num3 = input.nextInt();
                solved = num1 + num2 + num3/2;
                System.out.println("The average is "+ solved);
            }
             if (nums == 4) {
                System.out.println("What is the numbers");
                num1 = input.nextInt();
                num2 = input.nextInt();
                num3 = input.nextInt();
                num4 = input.nextInt();
                solved = num1 + num2 + num3 + num4/2;
                System.out.println("The average is "+ solved);
            }
       
              }
         public static void angle (){
                  Scanner input = new Scanner(System.in);
                  double angle1;
                  double angle2;
                  double angle3;
                  System.out.println("Enter two angle");
                    angle2 = input.nextInt();
                angle1 = input.nextInt();
                angle3 = angle1 + angle2 - 180;
                System.out.println("The missing angle is "+ angle3);
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double choice;
        System.out.println("1.Finding perimeter of rectangle");
        System.out.println("2. Find Radius of circle");
        System.out.println("3. Average of numbers");
        System.out.println("4. Find the missing angle");
        System.out.println("");
        choice = input.nextInt();
           if (choice == 1) {
               perimeter();
           }
           if (choice == 2) {
               rad();
           }
           if (choice == 3) {
               av();
           }
           if (choice == 4) {
               angle();
           }
    }
    
    
}
