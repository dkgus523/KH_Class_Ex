package oop.sample;
public class Point { // Ŭ���� ���
	private int posX=10;// ����ʵ�
	private int posY; // ����ʵ�
	// �޼ҵ�
	public int getPosX() { 
		return posX; 
		}
	public void setPosX(int posX) { 
		this.posX = posX; 
		}
	public int getPosY() { 
		return posY; 
		}
	public void setPosY(int posY) { 
		this.posY = posY; 
		}
	// ������
	public Point ( ) {
		
	}
	public Point (int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	

}
