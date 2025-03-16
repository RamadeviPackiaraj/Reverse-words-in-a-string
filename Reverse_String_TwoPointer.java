//space 0(n) time O(1)
import java.util.*;
public class Reverse_String_TwoPointer{
    static String reverseWords(String str){
        StringBuilder s=new StringBuilder(str);
        s.reverse();
        int n=s.length();
        int i=0;
        for(int l=0;l<n;++l){
            if(s.charAt(l)!='.')//when we find the non dot character, we start processing a word
            if(i!=0)
            s.setCharAt(i++,'.');//ensures words are seperated by  IndexOutOfBoundsException
            //go to end of the words
            //this function used to know the word until the . is finded
            int r=l;
            while(r<n&&s.charAt(r)!='.'){
                s.setCharAt(i++,s.charAt(r++));
            }
            //reverse the word
            int start=i-(r-l);
            int end=i-1;
            while(start<end){
                char temp=s.charAt(start);
                s.setCharAt(start,s.charAt(end));
                s.setCharAt(end,temp);
                start++;
                end--;
            }
            //move to next word
            l=r;
        }
        return s.substring(0,i);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.next();
        System.out.println(reverseWords(s));
        
    }
}