package CodingTest.Hackers.Medium.Greedy;
import java.io.*;
import java.util.*;

public class MaxMin {
    static int maxMin(int k, int[] arr) {
        int[] subArr;
        int answer = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int i=0; i<arr.length-k+1; i++){
            subArr = new int[k];
            int idx = 0;
            for(int j=i; j<k+i; j++){
                subArr[idx++] = arr[j];
            }

            answer= Math.min(answer, subArr[k-1]-subArr[0]);
        }

        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        int result = maxMin(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}