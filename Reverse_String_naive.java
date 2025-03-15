// time O(n) space O(n)
import java.util.Scanner;
import java.util.Stack;
public class Reverse_String_naive{
    static String reverseWords(String str){
    Stack<String> stack=new Stack<>();
    StringBuilder word=new StringBuilder();
    for(int i=0;i<str.length();i++){
        //if not a dot ,build the current word
        if(str.charAt(i)!='.'){
            word.append(str.charAt(i));
        }
        else if(word.length()>0){
            stack.push(word.toString());
            word.setLength(0);
        }
    }
    if(word.length()>0){
        stack.push(word.toString());
    }
    StringBuilder result=new StringBuilder();
    while(!stack.isEmpty()){
    result.append(stack.pop());
    if(!stack.isEmpty()){
        result.append(".");
    }
    }
    return result.toString();
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    System.out.println(reverseWords(str));
}
}