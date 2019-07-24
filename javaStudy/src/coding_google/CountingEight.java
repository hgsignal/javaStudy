package coding_google;

public class CountingEight {

	/***********************************************************************************
	 * 
	 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
	 * 
	 * 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다. (※ 예를들어 8808은 3,
	 * 8888은 4로 카운팅 해야 함)
	 * 
	 ***********************************************************************************/

	public static void main(String[] args) {
		for (int i = 0; i <= 10000; i++) {
			searchEight(i);
		}
		System.out.println("1에서 10,000 사이에 존재하는 8의 개수는? " + count);
	}

	private static int count = 0;

	public static void searchEight(int num) {
		if (num % 10 == 8)
			count++;
		if (num > 10)
			searchEight(num / 10);
	}

}
