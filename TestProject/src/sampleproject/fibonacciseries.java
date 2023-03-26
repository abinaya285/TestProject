package sampleproject;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		int n1 = 0, n2 = 1;
		
		for (int i=1;i<=count;i++)
		{
			System.out.print (n1 + " ");
			int sum = n1 + n2; // 0+1
			n1 = n2; // n1=1
			n2 = sum; // n2=1
		}
		
	}
}

