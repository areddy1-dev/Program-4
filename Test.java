

/*Java driver program to test the Set class*/

import java.util.Scanner;

public class Test {

   public static void main(String[] args) {

       Set set = new Set(); // creates a new object of class Set
       System.out.println("Programming Fundamentals");
       System.out.println("NAME:Reddy Anand Kumar Reddy");
       System.out.println("PROGRAMMING ASSIGNMENT 4 - Set ATD\n");
       @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
       @SuppressWarnings("unused")
	String command, line;
       int x;
       // infinite loop
       while(true)
       {
           // input of command
           System.out.print("Enter command: ");
           line = sc.nextLine();
           // converts the command into array of strings
           String data[] = line.split(" ");
           if(data[0].equalsIgnoreCase("add")) // add
           {
               try {
                   if(data.length > 1) // validate data has been passed
                   {
                       x = Integer.parseInt(data[1]); // convert the data to integer
                       set.add(x); // add x to set
                       System.out.println(set); // displays the updated set
                   }else // data will not pass
                       System.out.println("ERROR: Pass the integer to insert.");
               }catch(NumberFormatException e)
               {
                   // data passed was not an integer
                   System.out.println("ERROR: Enter an integer as the data to insert.");
               }
           }
           else if(data[0].equalsIgnoreCase("del")) // delete
           {
               try {
                   if(data.length > 1) // validate data has been passed
                   {
                       x = Integer.parseInt(data[1]); // convert the data to integer
                       set.delete(x); // delete x from set
                       System.out.println(set); // displays the updated set
                   }else // data will not pass
                       System.out.println("ERROR: Pass the integer to delete.");
               }catch(NumberFormatException e)
               {
                   // data passed was not integer
                   System.out.println("ERROR: Enter an integer as the data to delete.");
               }
           }
           else if(data[0].equalsIgnoreCase("exists")) // exists
           {
               try {
                   if(data.length > 1) // validate data has been passed
                   {
                       x = Integer.parseInt(data[1]); // converts the data to integer
                       System.out.println(set.exists(x)); // display if x exists in set
                   }else // data was not passed
                       System.out.println("ERROR: Pass the integer to test exists.");
               }catch(NumberFormatException e)
               {
                   // data passed was not integer
                   System.out.println("ERROR: Enter an integer as the data to test exists.");
               }
           }
           else // invalid command
               System.out.println("Invalid command");
       }
   }

}
//end of Test.java
