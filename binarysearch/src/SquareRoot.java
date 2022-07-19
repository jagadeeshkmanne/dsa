public class SquareRoot {

    //problem: https://leetcode.com/problems/valid-perfect-square/
    //solution: https://leetcode.com/submissions/detail/749854269/

    public static void main(String args[]) {
        System.out.println(mySqrt(49));
        System.out.println(mySqrt(3));
    }

    public static int mySqrt(int number) {
        if(number == 0 || number == 1)
            return number;

        int start = 0;
        int end = number;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == number/mid) {
                return mid;
            } else if (mid > number/mid) {
                end =  mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}


