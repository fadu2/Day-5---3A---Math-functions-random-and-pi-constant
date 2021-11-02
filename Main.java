import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    // Warm-up solution
    Scanner kb = new Scanner(System.in);
    // System.out.print("Enter first number: ");
    // int num1 = kb.nextInt();
    // System.out.print("Enter second number: ");
    // int num2 = kb.nextInt();
    // System.out.print("Enter third number: ");
    // int num3 = kb.nextInt();
    // int sum = num1 + num2 + num3;
    // System.out.println("The sum is " + sum);
    // System.out.println("The average is " + (double)sum/3);

    // // // or

    // // System.out.printf("The average is %.2f %n", (double)sum/3); // printf for print formatting with placeholders. %n for new line. NOTE: printf is NOT part of AP CSA.

    // // Math functions
    // // Math.sqrt() - for square root 
    // System.out.println(Math.sqrt(25));  // 5.0
    // System.out.println(Math.sqrt(36));  // 6.0
    // System.out.println(Math.sqrt(13));  // 3.6...
    // System.out.println(Math.sqrt(-25));  // NaN

    // // Math.pow() - is used to raise a number to a power of another number
    // System.out.println(Math.pow(3, 2));  // 9.0
    // System.out.println(Math.pow(2, 3));  // 8.0
    // System.out.println(Math.pow(2, -2));  // 0.25

    // int a = 2;
    // int b = 3;
    // System.out.println(Math.pow(a, b));  // 8.0

    // // Math.abs() - is used for absolute value 
    // System.out.println(Math.abs(-3));  // 3
    // System.out.println(Math.abs(-3.14));  // 3.14

    // // Math.floor() - is rounds down to the lowest integer 
    // System.out.println(Math.floor(3.14)); // 3.0
    // System.out.println(Math.floor(3.999));  // 3.0

    // // Math.ceil() - is rounds to the next highest integer 
    // System.out.println(Math.ceil(3.14));  // 4.0
    // System.out.println(Math.ceil(3.999)); // 4.0  

    // // Math.round() - is rounds the number 
    // System.out.println(Math.round(3.14)); // 3
    // System.out.println(Math.round(3.6));  // 4

    // // Math.max() - finds the max of 2 numbers 
    // System.out.println(Math.max(3, 4)); // 4

    // // Math.min() - finds the min of 2 numbers 
    // System.out.println(Math.min(3, 4));  // 3

    // // Math.PI
    // System.out.println(Math.PI);  // 
    // // Find circumference circle with radius 4.

    int r = 4;
    double c = 2 * Math.PI * r;
    double a = Math.PI * Math.pow(r, 2);
    System.out.println("Circumference: " + c);
    System.out.println("Area: " + a);


    // Math.random() - used to generate random numbers

    System.out.println(Math.random());  // 0 - 0.999999
    System.out.println(Math.random() * 10); // 0 - 9.9999
    System.out.println((int)(Math.random() * 10));  // 0 - 9
    System.out.println((int)(Math.random())* 10);  // 0

    System.out.println((int)(Math.random() * 10) + 2);

    System.out.println((int)(Math.random() * 11) + 3); 





    










    
  }
}