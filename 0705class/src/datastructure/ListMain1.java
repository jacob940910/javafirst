package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		//문자열을 저장할수 있는 ArrayList 생성
		LinkedList<String> arrayList = new LinkedList<>();
		//데이터를삽입
		arrayList.add("나라");
		arrayList.add("설현");
		arrayList.add("아이린");
		arrayList.add("수지");
		arrayList.add("유리");
		//데이터 개수
		System.out.println("데이터개수:"+arrayList.size());
		for(String temp : arrayList) {
			System.out.println(temp);
		}
		//2번째 데이터 출력하기
		System.out.println("===============");
		System.out.println(arrayList.get(3));

	}
	

}
