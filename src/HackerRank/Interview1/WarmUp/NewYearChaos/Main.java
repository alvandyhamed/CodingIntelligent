package HackerRank.Interview1.WarmUp.NewYearChaos;

import java.util.Scanner;

import static HackerRank.Interview1.WarmUp.NewYearChaos.Solution.minimumBribes;

public class Main {
    public static void main(String[] args) {
        Solution.minimumBribes(new int[]{3,2,1,5,4});
        Solution.minimumBribes(new int[]{2,5,1,3,4});

        Solution.minimumBribes(new int[]{5,1,2,3,7,8,6,4});
        Solution.minimumBribes(new int[]{1,2,5,3,7,8,6,4});



    }
 /*  private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }*/
}
