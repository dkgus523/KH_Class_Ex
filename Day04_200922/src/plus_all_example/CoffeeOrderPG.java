package plus_all_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeOrderPG {

	public static void main(String[] args)throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("======�޴���======");
			System.out.println("1. �Ƹ޸�ī��(hot)");
			System.out.println("2. �Ƹ޸�ī��(ice)");
			System.out.println("3. ������");
			
			System.out.print("�޴��� ���ÿ� : ");
			String str1 = br.readLine();
			int num = Integer.parseInt(str1);
			
			System.out.print("������ ������ ������ �Է��Ͻÿ� : ");
			String str2 = br.readLine();
			int get = Integer.parseInt(str2);
			
			switch(num) {
				case 1 :
					System.out.println("�Ƹ޸�ī��(hot) " + 2500*get+ "��");
					break;
				case  2:
					System.out.println("�Ƹ޸�ī��(ice) " + 3000*get+ "��");
					break;
				case 3 :
					System.out.println("������ " + 4000*get+ "��");
					break;
				case 4 :
					br.close();
					System.out.println("���α׷� ����" );
					break;		
			}
			
		}

	}

