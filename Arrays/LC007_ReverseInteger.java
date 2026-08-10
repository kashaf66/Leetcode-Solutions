public class LC007_ReverseInteger {
    public static int reverse(int x) {
        int sign=1;
        if(x<0){
            sign= -1;
            x=-x;
        }
        
        int rev=0;
        while(x>0){
        int digit=x%10;
        if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
        rev=rev*10+digit;
        x=x/10;
        }
        return rev * sign;
    
    }
}
