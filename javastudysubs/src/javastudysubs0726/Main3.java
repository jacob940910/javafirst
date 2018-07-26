package javastudysubs0726;

public class Main3 {

	public static void main(String[] args) {
		int idx=1;
		int j=1;
		int i=1;
		while(j<=5) {
			i=1;
			while(i<=6-j) {  //i<=-1*j+6
				System.out.printf("%3d", idx);
				idx=idx+1;
				i=i+1;
			}
			System.out.println(" ");
			j=j+1;
		}
	}

}
