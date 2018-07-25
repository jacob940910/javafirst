package javastudysubs0725;

public class main1 {

	public static void main(String[] args) {
		/*
		int i = 0;
		for(i=1;i<=10;i=i+1) {
			if(i%4==0) {
				continue;
			}
			System.out.println(i);
		}
		*/
		/*
		for(int i=0;i<2;i=i+1) {
			for(int j=0;j<3;j=j+1) {
				
				System.out.println(i+":"+j);
			}
		}
		*/
		/*
		//구구단 2단만들기 
		for(int i=1;i<10;i=i+1) {
			System.out.println("2*"+i+"="+2*i);
		}
		*/
		/*
		//구구단 만들
		for(int i=1;i<10;i=i+1) {
			for(int j=2;j<=9;j=j+1) {
				System.out.print(j+"*"+i+"="+j*i+" ");
			}
			System.out.println("");
		}
		*/
		/*
		 //*찍
			for(int i=0;i<6;i=i+1) {
				for(int j=0;j<6;j=j+1) {
					System.out.print("*");
					
				}
			
				System.out.println(" ");
				
			}
			
		*/	
		
		for(int i=0;i<6;i=i+1) {
			for(int k=0;k<5-i;k=k+1) {
				System.out.print(" ");
			}
			for(int j=0;j<=2*i;j=j+1) {
				System.out.print("*");
			}
		
			
			System.out.println(" ");
		}

	}

}
