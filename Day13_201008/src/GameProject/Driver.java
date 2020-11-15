package GameProject;

import java.util.Scanner;

//게임진행
public class Driver {
	String[] player = new String[2];
	int i = 0;
	int[] sum = new int[2];
	PairOfDice po = new PairOfDice();
	
	
	Scanner scan = new Scanner(System.in);
	
	void menu() {
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 게임 진행");
			System.out.println("2. 게임 종료");
			int c = scan.nextInt();
	
			if(c == 1) {
				
				for(i = 0; i<player.length; i++) {
					player[i] = scan.next();
					System.out.println((i+1) + "번째 사용자 : " + player[i]);
				}
				
				po.roll();
				System.out.println(player[0] + "가 던진 주사위 값은" +  po.getFaceValue1() + ", " + po.getFaceValue2());
				System.out.println(player[1] + "가 던진 주사위 값은" + po.getFaceValue1() + ", " + po.getFaceValue2());
				
				sum[0] = po.getFaceValue1() + po.getFaceValue2();
				sum[1] = po.getFaceValue1() + po.getFaceValue2();
				
				if(sum[0] > sum[1]) {
					System.out.println(player[0] + "가 이겼습니다.");
				} else if (sum[0] < sum[1]) {
					System.out.println(player[1] + "가 이겼습니다.");
				} else
					System.out.println("두 선수가 비겼습니다.");
				
			} 
			if(c == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		d.menu();
	}

}
