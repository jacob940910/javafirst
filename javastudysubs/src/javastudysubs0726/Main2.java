package javastudysubs0726;

public class Main2 {

	public static void main(String[] args) {
		int idx=1;
		int i=1;
		int j=1;
		while(j<=5) {
			i = 1;
			while(i<=5) {
				System.out.printf("%3d", idx);
				i=i+1;
				idx=idx+1;
			}
			j=j+1;
			System.out.println(" ");
		}
	}

}
