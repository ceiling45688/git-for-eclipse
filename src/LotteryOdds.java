import java.util.Scanner;

public class LotteryOdds {
//º∆À„C£®n,k£©
	public LotteryOdds() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("input n: ");
		int n = in.nextInt();
		System.out.println("input k: ");
		int k = in.nextInt();
		
		int lotteryodds = 1;
		for (int i=1; i<=k; i++) {
			lotteryodds = lotteryodds * (n-i+1) / i;
		}
		System.out.println("C("+n+","+k+") = "+ lotteryodds);
	}

}
