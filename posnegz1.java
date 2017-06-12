import java.io.*;
import java.util.*;
class posnegz1
{
public static void main(String args[])
 {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   if(n>0)
   {
   System.out.println("Positive number");
   }
   elseif(n<0)
   {
   System.out.println("Negative number");
   }
   else
   {
   System.out.println("Zero");
   }
 }
} 
