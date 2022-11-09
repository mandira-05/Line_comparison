import java.util.Scanner;

public class UC4 {
    Scanner scanner=new Scanner(System.in);

    public Double input() {
        System.out.println("Enter point x1: ");
        int x1=scanner.nextInt();

        System.out.println("Enter point y1: ");
        int y1=scanner.nextInt();

        System.out.println("Enter point x2: ");
        int x2=scanner.nextInt();

        System.out.println("Enter point y2: ");
        int y2=scanner.nextInt();

        return calculateLength(x1,y1,x2,y2);

    }

    public static void main(String[] args) {

        UC4 object1 = new UC4();
        UC4 object2 = new UC4();

        Double  result1,result2;

        System.out.println("Line 1 points ");
        result1=object1.input();
        System.out.println("Calculated length for first line: " +result1);

        System.out.println("Line 2 points ");
        result2=object2.input();

        System.out.println("Calculated length for second line: " +result2);

        if (result1.equals(result2)) {

            System.out.println("Lines are equal");

        } else {

            System.out.println("Lines are not equal");
        }

        if (result1.compareTo(result2) == 0) {

            System.out.println("Line are equal");

        } else if (result1.compareTo(result2) == -1) {

            System.out.println("Line 1 is Smaller than line 2"); // -1 for less

        } else {

            System.out.println("Line 1 is greater than line 2"); // 1 for greater
        }
    }
    public double calculateLength(double x1, double y1, double x2, double y2) {
        double len;
        len = Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));
        return len;
    }

}


