import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int x;
        do{
            System.out.println("양의정수값");
            x= stdIn.nextInt();
        }while (x<=0);
        while (x>=0)
            System.out.println(--x);
        System.out.println("x의 값이 "+x+"이 됐습니다.");
    }
}
