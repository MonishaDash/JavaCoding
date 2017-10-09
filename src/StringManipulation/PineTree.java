package test;

import java.util.Scanner;

public class PineTree
{
   public static void main(String [] args)
   {
       //Scanner keyboard = new Scanner(System.in);
       System.out.println();
       //Triangle
       for (int i = 1; i < 10; i += 2)
       {
       for (int k = 0; k < (4 - i / 2); k++)
       {
       System.out.print(" ");
       }
       for (int j = 0; j < i; j++)
       {
       System.out.print("*");
       }
       System.out.println("");
       }
      
       //Trapezoids
       int trapSize = 5;
       for(int i = 0; i <= 5; i++)
       {
           for(int k = 0; k < 5 - i; k++)
           {
               System.out.print(" ");
           }
          
           for(int j = 0; j < trapSize; j++)
           {
               System.out.print("* ");
           }
       System.out.println("");
       trapSize++;
       }
      
       int trapSize2 = 9;
       for(int i = 0; i <= 9; i++)
       {
           for(int k = 0; k < 9 - i; k++)
           {
               System.out.print(" ");
           }
          
           for(int j = 0; j < trapSize2; j++)
           {
               System.out.print("* ");
           }
       System.out.println("");
       trapSize2++;
       }
      
       //Squares
       for(int i = 5; i <= 10; i++)
       {
           System.out.print(" ");
           System.out.print("*");
       }
       System.out.println("");
       for(int i = 5; i <= 10; i++)
       {
           System.out.print(" ");
           System.out.print("*");
       }
       System.out.println("");
       for(int i = 5; i <= 10; i++)
       {
           System.out.print(" ");
           System.out.print("*");
       }
       System.out.println("");
       for(int i = 5; i <= 10; i++)
       {
           System.out.print(" ");
           System.out.print("*");
       }
       System.out.println("");
       for(int i = 5; i <= 10; i++)
       {
           System.out.print(" ");
           System.out.print("*");
       }
       System.out.println("");
      
}
      
   }
