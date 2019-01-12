package task.fromJavarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMaxNumberInArray {
    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] numbers = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++)
        {
            String s = br.readLine();

            numbers[i] = Integer.parseInt(s);

        }

        return numbers;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] > max)
                max = array[i];
        }

        return max;
    }
}
