# Primecount
import java.io.*;
import java.util.*;
public class Primecount
{
public static void main(String args[])
{
int n1,n2,flag;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the starting limit");
n1=sc.nextInt();
System.out.println("Enter the ending limit");
n2=sc.nextInt();
System.out.println("print prime numbers between n1 and n2");
for(int i=n1;i<=n2;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
flag=0;
break;
}
else
{
flag=1;
}
}
}
}
}
