import java.util.*;

class PalindromicSubstrings{
  
  public static boolean palindrome(String str){
    String temp="";
    
    for(int i =str.length()-1; i>=0;i--){
      temp+=str.charAt(i);
    }
   
    if(temp.equals(str)){
      return true;
    }
    return false;
  }
  
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    
    String str = scn.nextLine();
//    System.out.println(str.length() + str.substring(0,3));
    
    for(int i = 0 ; i< str.length(); i++){
      for (int j =i+1; j<=str.length(); j++){
//        System.out.println(str.substring(i,j));
        if(palindrome(str.substring(i,j))){
          System.out.print(str.substring(i,j));
           System.out.println();
        }
       
      }
    }
    
    
  }
}