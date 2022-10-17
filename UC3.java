public class UC3 {
    public static float len(int x1, int y1, int x2, int y2) {
        float len = (float) Math.sqrt(((x2 - x1) * (x2 - x1)) + (y2 - y1) * (y2 - y1));
        return len;
    }

    public static void main(String[] args) {
        int len1_x1 = 2;
        int len1_y1 = 15;
        int len1_x2 = 10;
        int len1_y2 = 29;

        int len2_x1 = 2;
        int len2_y1 = 1;
        int len2_x2 = 10;
        int len2_y2 = 29;

        Float result1 = len(len1_x1, len1_y1, len1_x2, len1_y2);
        System.out.println("Length of line1 is " + result1);

        Float result2 = len(len2_x1, len2_y1, len2_x2, len2_y2);
        System.out.println("Length of line2 is " + result2);

        int Compare_len = result1.compareTo(result2);
        if (Compare_len > 0) {
            System.out.println("Line1 is greater than Line2");
        } else if (Compare_len == 0 ) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Line 1 is less than Line2");
        }


    }
}
