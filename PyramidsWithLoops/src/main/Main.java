/*Assignment 04
 *Kirran Magowan
 *magowakn@mail.uc.edu
 *App Dev w/ JAVA
 *IS4010
 *Description: This assignment is about altering the code to fit 5 lines of a pyramid from 1 to 5.
 *Citation: https://stackoverflow.com/questions/1427272/for-loop-construction-and-code-complexity
 *Citation: https://stackoverflow.com/questions/6685665/system-out-println-vs-n-in-java
*/
package main;

public class Main {

 public static void main(String[] args) {
  printDesign(5); // this tells Eclipse the number of rows that it will output
 }
  public static void printDesign(int height){ // this code evaluates the printDesign text and looks at the integer for height in the code below for it to scan and produce an output for the variable int.

  for (int i = 1, x = 1; i < height * 2; i += 2, x++) { // declares the integer i as 1, then states that x will be added to if it doesnt fit the conditions
   int n = x % 10; // this tell the program to divide x by 10
   for (int j = 0; j < height* 2 - 1 - i / 2; j++) // this adjusts the height of the pyramid if j is less than the height multiplied by 2 - 1 - i, then 1 is added to x each time after that
     System.out.print(" ");
   
   
     for (int j = 0; j < i; j++) // this states that the integer j will get one added to it every time if  the conditions fit
      System.out.print(n); // this out puts the integer n for the system
      System.out.print("\n"); // this out prints lines separately instead of doing this 5 times over

   }
  }
}

