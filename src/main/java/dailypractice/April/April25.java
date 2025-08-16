package dailypractice.April;
//write a fibonacci number and print them
//O(n) = 2 ^ N

public class April25 {
    public static void main(String[] args) {
       // System.out.println(fib(5));
       // fibPrint(5);
        System.out.println(fancyFib(5));
    }
  public  static int fib(int num){
        if(num <=1 )
            return num;
        return fib(num -1) + fib(num -2);
    }
//buttom up approach called tabulation! complexity O(N)
  public static int fancyFib(int num){
        if(num <=1)
            return num;
        int [] cache = new int[num + 1];
        cache[1] = 1;
        for(int i = 2 ; i <= num ; i++){
            cache[i] = cache[i - 1] + cache[i -2];
        }
        return cache[num];
  }

//0 - 1 - 1 -2 -3 -5
    public static void fibPrint(int num){
        int num1 =0;
        int num2 =1;

        for (int i =0; i <= num ; i++) {
            System.out.println("num :[" + i + "] = [ " + num1+ "]");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }



}
