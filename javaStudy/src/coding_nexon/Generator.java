package coding_nexon;

import java.util.ArrayList;

public class Generator {
	
	/***********************************************************************************
	 * 
	 * � �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.
	 * ���� ���
	 * 
	 * d(91) = 9 + 1 + 91 = 101
	 * 
	 * �� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.
	 * � ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. 
	 * 
	 * �׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, 
	 * �̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���.
	 * 
	 * ���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.
	 *  
	 * 1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
	 *  
	 ***********************************************************************************/

	public static void main(String[] args)
    {
        calculateNumbersHasGenerator();
        int sum = 0;
        for (int j = 0; j < 5001; j++)
            if (!hasGenerator(j))
                sum += j;
        System.out.println("�� : "+sum);
    }

    private static boolean hasGenerator(int num)
    {
        return numbersHasGenerator.contains(num);
    }

    private static ArrayList<Integer> numbersHasGenerator;

    private static void calculateNumbersHasGenerator()
    {
        numbersHasGenerator = new ArrayList<Integer>();
        for (int i = 0; i < 5001; i++)
        {
            String num = String.valueOf(i);
            int no = 0;
            for (int n = 0; n < num.length(); n++)
                no += Integer.parseInt(num.substring(n, n + 1));
            numbersHasGenerator.add(no + i);
        }
    }
}
