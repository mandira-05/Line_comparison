public class UC2 {
    public static float len(int x1, int y1,int x2, int y2) {
        float len = (float) Math.sqrt(((x2 - x1) * (x2 - x1)) + (y2 - y1) * (y2 - y1));
        return len;
    }

        public static void main(String[] args) {
            int len1_x1 = 2;
            int len1_y1 = 1;
            int len1_x2 = 10;
            int len1_y2 = 29;

            int len2_x1 = 2;
            int len2_y1 = 1;
            int len2_x2 = 10;
            int len2_y2 = 29;

            Float result1 = len(len1_x1, len1_y1, len1_x2, len1_y2);
            System.out.println("Length of line1 is " + result1);

            Float result2 = len(len2_x1, len2_y1, len2_x2, len2_y2);
            System.out.println("Length of line2 is " + result1);

            if (result1.equals(result2)) {
                System.out.println("Lines are equal");
            } else {

                System.out.println("Lines are not equal");
            }

    }

}
