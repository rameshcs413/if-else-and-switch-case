/* Program for Decision making using If-else statement */

import java.util.Scanner;
public class Simple {
public static void main(String args[]) {
  int input;
  System.out.println("Enter your age :");
  Scanner sc = new Scanner(System.in);
  input = sc.nextInt();
  if(input > 18)
  {
      System.out.println("Your eligible to vote");
  else
      System.out.println("Your not eligible to vote");
  }
}

/* Program for Decision making using switch() case  statement */

import java.util.Scanner;
public class Simple{
public static void main(String args[]) {
  int choice;
  System.out.println("Pick any one : 1. Hi\t 2. Hey\t 3. Hello\t");
  
  Scanner sc = new Scanner(System.in);
  choice = sc.nextInt();
  Switch(choice)
  {
      case 1 : System.out.println(“You said Hi”);
break;
      case 2 : System.out.println(“You said Hey”);
break;
      case 3 : System.out.println(“You said Hello”);
break;
      default : System.out.println(“Invalid choice”);

  }
}
}

