import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수값:");
        int n = stdIn.nextInt();
        
        if(n>0)
            System.out.println("값이 양수입니다");
        else if(n<0)
            System.out.println("값이 음수입니다");
        else
            System.out.println("값이 0입니다");
        
        
    }
}
