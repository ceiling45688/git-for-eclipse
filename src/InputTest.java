import java.util.Scanner;

public class InputTest {

	public InputTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input your name:");
		String name = in.nextLine();
		System.out.println("input your age:");
		int age = in.nextInt();
		//����������ʲô��ʽ�������
		
		System.out.println("name: "+ name + " age: " + age);
		
	}
}
