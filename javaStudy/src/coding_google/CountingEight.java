package coding_google;

public class CountingEight {

	/***********************************************************************************
	 * 
	 * 1���� 10,000���� 8�̶�� ���ڰ� �� ��� �����°�?
	 * 
	 * 8�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 8�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�. (�� ������� 8808�� 3,
	 * 8888�� 4�� ī���� �ؾ� ��)
	 * 
	 ***********************************************************************************/

	public static void main(String[] args) {
		for (int i = 0; i <= 10000; i++) {
			searchEight(i);
		}
		System.out.println("1���� 10,000 ���̿� �����ϴ� 8�� ������? " + count);
	}

	private static int count = 0;

	public static void searchEight(int num) {
		if (num % 10 == 8)
			count++;
		if (num > 10)
			searchEight(num / 10);
	}

}
