import java.util.Scanner;

class Homework1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, num;
        int sum = 0;
        for(i = 0; i<5; i++)
        {
            System.out.println("정수를 입력하세요 :");
            num = sc.nextInt();
            sum += num;
            System.out.println("지금까지 입력된 정수의 합은 " + sum + " 입니다.\n");
        }
        System.out.println("총 합은"+ sum+"입니다.");
    }
}