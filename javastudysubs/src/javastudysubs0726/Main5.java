package javastudysubs0726;

public class Main5 {

	public static void main(String[] args) {
		for(int j=0;j<=2;j=j+1) {
			for(int i=0;i<5-j;i=i+1) {
				System.out.print(" ");
			}
			for(int i=0;i<=j*2;i=i+1) {
				System.out.printf("%1s","*");
			}
			System.out.println(" ");
		}
		
		for(int j=3;j<5;j=j+1) {
			for(int i=0;i<=j;i=i+1) {
				System.out.print(" ");
			}
			for(int i=0;i<=-2*j+8;i=i+1) {
				System.out.printf("%1s","*");
			}
			System.out.println(" ");
		}
		

	}

}
