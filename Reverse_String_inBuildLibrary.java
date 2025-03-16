//time O(n) space O(n)
import java.util.*;
class Reverse_String_inBuildLibrary{
    static String reverseString(String str){
    //split '.'
    List<String> words=new ArrayList<>();
    //ignoring multiple dots 
    String[] parts=str.split("\\.");
    for(String word:parts){
        if(!word.isEmpty()){
            //ignore empty word
            words.add(word);
        }
    }
    //reverse the words
    Collections.reverse(words);
    return String.join(".",words);
    
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.next();
        System.out.println(reverseString(s));
        
    }
}