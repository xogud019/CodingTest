package Hackers.JavaPrac;
import java.util.*;

public class BitwiseAND {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            int answer = Integer.MIN_VALUE;

            for(int i=1; i<n; i++){
                for(int j=i+1; j<=n; j++){
                    int temp = i&j;
                    if(temp<k&&answer<temp){
                        answer = temp;
                    }
                }
            }

            System.out.println(answer);
        }

        scanner.close();
    }
}
