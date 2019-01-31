package array;

public class array1 {
/*题目：求八个数的总格和平均数（20 30 10 20 20 20 40 0）
 * 
 */
	public array1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] a = {20,30,10,20,20,20,40,0};
		double sum = 0;
		double avg = 0;
		for (int i =0; i<a.length; i++) {
			sum += a[i];
		}
		avg = sum / a.length;
		System.out.println("sum = "+ sum);
		System.out.println("average = "+ avg);
	}

}
