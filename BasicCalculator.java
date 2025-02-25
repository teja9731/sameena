import java.util.Scanner;
public class BasicCalculator
{
public static void main(String args[])
{
double num1,num2,ans;
char op;
Scanner reader=new Scanner(System.in);
System.out.print("Enter two number:");
num1=reader.nextDouble();
num2=reader.nextDouble();
System.out.print("\n Enter any operator(+,-,*,/):");
op=reader.next().charAt(0);
switch(op) {
case '+':ans=num1+num2;
break;
case '-':ans=num1-num2;
break;
case '*':ans=num1*num2;
break;
case '/':ans=num1/num2;
break;
default: System.out.print("Error! Enter correct operator");
return ; }
System.out.print("\n the result is given as follows:\n");
System.out.print(num1+ " "+op+ " "+num2+"="+ans);}}
