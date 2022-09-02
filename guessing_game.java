import java.util.Scanner;

public class guessing_game 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
   // Choose a random number from 0-100 
    double num = ((int)(Math.random() * 100));

   // Ask the user to guess a number from 0 to 100 
    System.out.println("Guesss a number from 1-100");
   // Get the first guess using scan.nextInt();
    int guess = scan.nextInt();

   // Loop while the guess does not equal the random number,
    while(guess!=num)
    {
     // If the guess is less than the random number, print out "Too low!"
      if(guess<num)
      {
        System.out.println("Too low!");
      }
     // If the guess is greater than the random number, print out "Too high!"
      if(guess>num)
      {
        System.out.println("Too high!");
      }
     // Get a new guess (save it into the same variable)
     guess = scan.nextInt();
    }
   

  // Print out something like "You got it!"
  System.out.print("You got it!");

  }
}