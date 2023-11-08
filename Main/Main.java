package Main;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
     Scanner myObj = new Scanner(System.in);
     System.out.println("Hello, Gimme your name");

     String userName = myObj.nextLine();
     System.out.println("hi "+userName+" Wellcome");
  }
}