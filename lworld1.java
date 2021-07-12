import  java.util.*;
class lword1 {

    public int lengthOfLastWord(String s) {
        if(s.isEmpty()==true)
            return 0;
        else
        {
        int space,len2=s.length();
        String lword;
        space=s.lastIndexOf(' ');
        if(space== -1)
        return s.length();
        else
        {
        lword=s.substring(space,(len2-1));
            return lword.length();
        }
        }
    }
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        lword1 ob = new lword1();
        System.out.println("ENter your string");
        String s = in.nextLine();
       System.out.println( ob.lengthOfLastWord(s));
    }
}
