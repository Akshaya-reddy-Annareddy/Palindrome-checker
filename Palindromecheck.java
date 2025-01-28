import java.util.*;
public class Palindromecheck{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str1 = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String revstr = "";
    for(int i = str1.length()-1; i >= 0; i--){
      revstr += str1.charAt(i);
    }
    if(revstr.equals(str1)){
      System.out.printf("The string \"%s\" is a palindrome.",str);
    }else{
      System.out.printf("The string \"%s\" is not a palindrome.",str);
    }
  }
}
