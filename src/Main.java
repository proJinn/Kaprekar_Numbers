import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите начала диапазона: ");
        long a = sc.nextInt();
        System.out.print("Введите конец диапазона: ");
        long b = sc.nextInt();
        for(long x = a; x <= b; x++){
            long sqr = x*x,
                    left, right,
                    des = 10;
            do{
                left = sqr/des;
                right = sqr%des;
                des *= 10;
            }while(left > 9 && left+right != x);

            if(left+right == x && right != 0){
                System.out.print("" + x + "^2 = " + sqr);
                System.out.println(", " + left + " + " + right + " = " + (left+right));
            }
        }

    }
}
