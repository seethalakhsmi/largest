import java.io.*;
import java.util.*;
public class largest
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b[]=new int[a];
for(int k=0;k<a;k++)
{
b[k]=scan.nextInt();
}
int max=b[0];
for(int i=0;i<a;i++)
{
if(max<b[i])
{
max=b[i];
}
else
{
System.out.println("the largest num is"+max);
}
}
}
}
