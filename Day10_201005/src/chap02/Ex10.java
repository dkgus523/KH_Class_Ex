package chap02;

public class Ex10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;

		if(score >= 90) {
			System.out.println("A����");
		}else if(score >= 80) {
			System.out.println("B����");	
		}else {
			System.out.println("F����");
		}

		System.out.println("���α׷��� �����մϴ�.");

	}
}



/*

	

		int rank = 1;
		char medalColor;

		switch(rank) {
		case 1: medalColor = 'G';
		System.out.println("�ݸ޴�");
		break;
		case 2: medalColor = 'S';
		System.out.println("���޴�");
		break;
		case 3: medalColor = 'B';
		System.out.println("���޴�");
		break;
		default : medalColor = 'X';
		}
		System.out.println( rank + "���� " + medalColor + "�޴� �Դϴ�.");

 */