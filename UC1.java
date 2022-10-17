import java.util.Scanner;

public class UC1 {
    public static float len(int x1, int y1,int x2, int y2) {
        float len = (float) Math.sqrt (((x2-x1)*(x2-x1))+ (y2-y1)*(y2-y1));
        return len;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 value");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1 value");
        int y1 = scanner.nextInt();
        System.out.println("Enter x2 value");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2 value");
        int y2 = scanner.nextInt();


        float result1=len(x1,y1,x2,y2);
        System.out.println("Lenthg of line is " +result1);

    }


}
