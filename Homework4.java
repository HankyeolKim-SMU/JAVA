import java.util.Scanner;

class cd{
    int gcd(int m, int n){
        int i;
        if(m < n){
            i = n;
            n = m;
            m = i;
        }
        if(m == 0){
            return m;
        }
        if(m % n == 0){
            return n;
        }
        i = m % n;
        m = i;
        n = m;
        return gcd(m, n);
    }
}

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cd c = new cd();
        System.out.println("두 수를 입력하세요(0이상의 정수): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d입니다.", c.gcd(a,b));
    }
}

