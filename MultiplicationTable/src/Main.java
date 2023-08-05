import  java.util.Scanner;

public class Main{
	public static  void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		System.out.println("------------------------------------");
		System.out.println("Multiplication table of "+ a +" and "+b+" is:");
		for(int i=1;i<=10;i++){
			System.out.println(a+"*"+i+"="+a*i+"\t"+"\t"+"\t"+b+"*"+i+"="+b*i);
		}
		System.out.println("------------------------------------");
	}
}