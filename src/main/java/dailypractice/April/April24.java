package dailypractice.April;
//write a fibunacco
public class April24 {
    public static void main(String[] args) {
        int myfibNum = 5;
        int myfibSeries;
        System.out.println( fib(5));
        FibPrint(myfibNum);
    }

    //1 : 0 , 2 :1 , 3: 1, 4 :2 , 5 : 5, 6 : 5, 13 ,21 ,
    public static int fib(int num) {
        if (num <= 1) {
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static void FibPrint(int num) {
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i <= num; i++) {
            System.out.println( "num : [ " + i + " ] = "  + num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
