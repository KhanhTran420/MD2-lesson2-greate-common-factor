import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a =scanner.nextInt();
        System.out.println("Enter second number: ");
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a== 0 || b == 0){
            System.out.println("No greatest common factor");
        }
        // ta sẽ trừ cho đến khi 2 số bằng nhau thì dừng lại
        while (a!=b){
            if(a>b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}