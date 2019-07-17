package coding_190717;

import java.util.ArrayList;

public class Generator {

	public static void main(String[] args)
    {
        calculateNumbersHasGenerator();
        int sum = 0;
        for (int j = 0; j < 5001; j++)
            if (!hasGenerator(j))
                sum += j;
        System.out.println("гу : "+sum);
    }

    private static boolean hasGenerator(int num)
    {
        return numbersHasGenerator.contains(num);
    }

    private static ArrayList<Integer> numbersHasGenerator;

    private static void calculateNumbersHasGenerator()
    {
        numbersHasGenerator = new ArrayList<Integer>();
        for (int i = 0; i <= 5000; i++)
        {
            String num = String.valueOf(i);
            int no = 0;
            for (int n = 0; n < num.length(); n++)
                no += Integer.parseInt(num.substring(n, n + 1));
            numbersHasGenerator.add(no + i);
        }
    }
}
