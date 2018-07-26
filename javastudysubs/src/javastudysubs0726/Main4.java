package javastudysubs0726;

public class Main4 {

	public static void main(String[] args) {
		int j=1;
		int idx=1;
		
		while(j<=5) {
			int i=1;
			while(i<=5-j) {
				System.out.printf("   ");
				i=i+1;
			}
			i=1;
			while(i<=j) {
				
				System.out.printf("%3d", idx);
				i=i+1;
				idx=idx+1;
			}
			System.out.println("  ");
			j=j+1;
			
		}
	}

}
