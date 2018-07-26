package javastudysubs0726;

import java.util.Scanner;

public class Main1 {
//소수판별 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("판별할 수:");
		int su=sc.nextInt();
		int i=2;
		
		
		while(i<=su/2) {
			if(su%i==0) {
				break;
			}
			i=i+1;
		}
		if(i==su/2+1) {
			System.out.println("소수");
		}else {
			System.out.println("소수아님.");
		}
		sc.close();
	}

}
