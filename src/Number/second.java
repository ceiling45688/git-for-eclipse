package Number;


public class second {
	
	public second() {
		// TODO Auto-generated constructor stub
	}
	
	private int num;
	public void set(int num) {
		this.num = num;
	}
	public int get() {
		return num;
	}
}
class third extends second {
	public static void main() {
		third three = new  third();
		three.set(10086);
		System.out.println("number is: "+ three.get());
	}
}
