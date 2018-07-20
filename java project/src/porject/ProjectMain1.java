package porject;

public class ProjectMain1 {

	public static void main(String[] args) {
		int idx=0;
		for(int i=0;i<6;i=i+1) {
			int j;
			for(j=0;j<5-i;j=j+1) {
				System.out.print(" ");
			}
			//10보다작을때 %
			System.out.print(idx%10 );
			idx=idx+1;
			if(i>=1 && i<=4) {
				for(j=0;j<2*i-1;j=j+1) {
					System.out.print(" ");
				}
				System.out.print(idx%10);
				idx=idx+1;
			}
			//맨밑의 0부터9까지 
			if(i==5) {
				for(j=0;j<2*i;j=j+1) {
				System.out.print(idx%10);
				idx=idx+1;
				}
			}
			//for문이끝날때마다줄바꿈을 위해서 println을이용
			System.out.println(" ");
		}
		
		
	}

}