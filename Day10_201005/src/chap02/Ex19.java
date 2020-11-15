package chap02;

import java.util.ArrayList;

public class Ex19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("c++");
		list.add("java");
		list.add("python");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

