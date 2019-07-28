package coding_perfect;

import java.util.Scanner;

public class PerfectNumber {


	/***********************************************************************************
	 * �ڱ� �ڽ��� ������ ��� ���� ������� ���� �ڱ� �ڽ��� �Ǵ� �ڿ����� ��������� �Ѵ�. 
	 * 
	 * ���� ���, 6�� 28�� �������̴�. 
	 * 
	 * 6=1+2+3 			// 1,2,3�� ���� 6�� ��� 
	 * 28=1+2+4+7+14 	// 1,2,4,7,14�� ���� 28�� ���
	 * 
	 * �Է����� �ڿ��� N�� �ް�, ������� N ������ ��� �������� ����ϴ� �ڵ带 �ۼ��϶�.
	 * 
	***********************************************************************************/
	
	private static Scanner sc;
	
	public static void main(String args[]){
		
		sc = new Scanner(System.in);

	    System.out.print("�� �Է� : ");
	    int n = sc.nextInt();

	    for(int i=1; i<=n; i++) {
	        int sum = 0;
	        for(int j=1; j<i; j++) {
	            if(i%j==0) {
	                sum += j;
	            }
	        }
	        if(i==sum) {
	            System.out.println(i);
	        }
	    }
	}
}
