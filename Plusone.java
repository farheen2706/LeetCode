class Solution {
  public static void main(String[] args) {
       StringBuffer number = new StringBuffer ();
        int digits[] = {9,8,7,6,5,4,3,2,1,0}      ;
       String number1,num,number2;
      int tonum,sum,tonum2;
      char a;
    for(int i=0;i<digits.length;i++){
  num=Integer.toString(digits[i]);
  number.append(num);
}
     number2= number.toString();
      tonum=Integer.valueOf(number2);
      sum=tonum+1;
      number1=Integer.toString(sum);
      int newarr[] = new int[number1.length()];
      for(int i=0;i<newarr.length;i++)
      {
          a=number1.charAt(i);
          tonum2=Character.getNumericValue(a);
          newarr[i]=tonum2;
      }
      for(int i=0;i<newarr.length;i++)
      {
        System.out.print(newarr[i]+",");
      }
  }
}
