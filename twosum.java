import java.util.Scanner;
import java.util.Arrays;

class twosum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();           // read array size
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {   // read array elements
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();      // read target

        int[] b = new int[2];           // to store the answer

        outer:                          // label to break both loops
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {   // j starts from i+1
                if (a[i] + a[j] == target) {
                    b[0] = i;
                    b[1] = j;
                    break outer;        // stop searching after finding the pair
                }
            }
        }

        System.out.println(Arrays.toString(b)); // print like [i,j]
    }
}
