import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Homework3 h = new Homework3();
        Scanner sc = new Scanner(System.in);
        int i;
        int max = 0;
        int min = 0;
        int[] arr;

        System.out.println("몇 개의 수를 입력할 예정인가요? ");
        i = sc.nextInt();
        arr = new int[i];
        System.out.println("수를 입력하세요: ");
        for (int n = 0; n < i; n++) {
            arr[n] = sc.nextInt();
        }
        int k = arr.length;
        max = arr[0];
        min = arr[0];
        for (int x = 1; x < k; x++) {
            if (max < arr[x]) {max = arr[x];}
            if (min > arr[x]) {min = arr[x];}
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}







