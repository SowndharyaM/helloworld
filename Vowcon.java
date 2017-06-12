import java.io.*;
import java.util.*;
class Vowcon
{
 public static void main(String args[])
 {
 char c;
 Scanner s=new Scanner(System.in);
 c=Scanner.next().charAt(0);
 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
 {
 System.out.print("vowel");
 }
 else
 {
 System.out.print("consonant");
 }
 }
} 
