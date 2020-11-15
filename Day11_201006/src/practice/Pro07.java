package practice;
class Television {
	private String model;
	
	public String getModel() {
		return model;
	}
	void setModel(String b) {
		model = b;
	}
	
}
public class Pro07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television t = new Television();
		t.setModel("STV-101");
		String b = t.getModel() ;
	}

}
