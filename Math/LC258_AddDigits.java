public class LC258_AddDigits {

    // public int addDigits(int num) {

    //     while (num >= 10) {
    //         int sum = 0;

    //         while (num > 0) {
    //             sum += num % 10;
    //             num /= 10;
    //         }

    //         num = sum;
    //     }

    //     return num;
    // }
    public boolean isUgly(int n) {
       if(n<=0) {
        return false;
       }
       while(n%2==0){
        n/=2;
       }
       while(n%3==0){
        n/=3;
       }
       while(n%5==0){
        n/=5;
       }
       return n==1;
    }
    public static void main(String[] args) {
        LC258_AddDigits obj = new LC258_AddDigits();

        System.out.println(obj.isUgly(9));
    }
}

