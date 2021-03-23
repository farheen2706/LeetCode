class Solution {
    public boolean isPalindrome(int x) {
        int num=x,rem,rev=0;
        if(num<0)
            return false;
        else{
            while(num!=0)
            {
                rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            if(rev==x)
            return true;
            else
            return false;
        }
    }
}
