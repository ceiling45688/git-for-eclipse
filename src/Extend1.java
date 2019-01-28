class Parent {
	private int num;
	public void set(int num) {
		this.num = num;
	}
	public int get() {
		return num;
	}
}

public class Extend1 extends Parent{

	public Extend1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Extend1 ex1 = new Extend1();
		ex1.set(10086);
		System.out.println("number is: " + ex1.get());
	}
	//main()必须在主类中
}
