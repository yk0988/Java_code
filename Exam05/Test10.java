import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);
        System.out.println("정수를 더합니다");
        System.out.println("몇 개를 더 할까요?");
        int n =stdIn.nextInt(); //정수의 개수
        int sum = 0; //합계
        int count = 0;
        int i;
        for (i=0; i<n; i++){
            System.out.println("정수");
            int t=stdIn.nextInt();
            if (t<0){
                System.out.println("음수는 더하지 않습니다.");
                continue;
            }
            sum += t;
            count++;
        }
        System.out.println("합계는"+sum+"입니다.");
        if(i !=0)
            System.out.println("평균은 "+sum/count+"입니다.");
    }
}
