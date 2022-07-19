public class ValidPerfectSquare {

    //https://leetcode.com/problems/valid-perfect-square/

    public static void main(String args[]) {
        System.out.println(isPerfectSquare(49));
        System.out.println(isPerfectSquare(3));
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long start = 0;
        long end = num;
        while (start <= end) {
            long mid = start + (end - start)/2;
            long square = mid * mid;
            if (square > num) {
                end = mid - 1;
            } else if (square < num) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}


