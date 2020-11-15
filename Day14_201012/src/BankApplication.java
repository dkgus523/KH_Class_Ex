import java.util.Scanner;

public class BankApplication {
	//���������
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("---------------------------------");
			System.out.print("����>>");
			
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				createAccount();
			} else if(menu == 2) { 
				accountList();
			} else if(menu == 3) {
				deposit();
			} else if(menu == 4) {
				withdraw();
			} else if(menu == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	//���»����ϱ�
	private static void createAccount() {
		System.out.print("���� ��ȣ : ");
		String ano = scanner.next();
		System.out.print("������ :");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		
		 Account a1 = new Account(ano, owner, balance);
		 
		 for(int i=0; i<accountArray.length; i++) {
			 if(accountArray[i] == null) {
				accountArray[i] = a1;
			 	System.out.println("��� : ���°� �����Ǿ����ϴ�.");
			 	break;
			 }
		 }
	}
	//���¸�Ϻ���
	private static void accountList() {
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.println(account.getBalance());
					
			}
		}
	}
	//�����ϱ�
	private static void deposit() {
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("���:�Ա��� �����Ǿ����ϴ�.");
	}
	//����ϱ�
	private static void withdraw() {
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("���:����� �����Ǿ����ϴ�.");
		
	}
	//Account �迭���� ano�� ������ Account��ü ã��
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
		
	}
}
