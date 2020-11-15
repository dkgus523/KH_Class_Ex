package plus_all_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeOrderPG {

	public static void main(String[] args)throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("======메뉴판======");
			System.out.println("1. 아메리카노(hot)");
			System.out.println("2. 아메리카노(ice)");
			System.out.println("3. 핫초코");
			
			System.out.print("메뉴를 고르시오 : ");
			String str1 = br.readLine();
			int num = Integer.parseInt(str1);
			
			System.out.print("구매할 음료의 개수를 입력하시오 : ");
			String str2 = br.readLine();
			int get = Integer.parseInt(str2);
			
			switch(num) {
				case 1 :
					System.out.println("아메리카노(hot) " + 2500*get+ "원");
					break;
				case  2:
					System.out.println("아메리카노(ice) " + 3000*get+ "원");
					break;
				case 3 :
					System.out.println("핫초코 " + 4000*get+ "원");
					break;
				case 4 :
					br.close();
					System.out.println("프로그램 종료" );
					break;		
			}
			
		}

	}

