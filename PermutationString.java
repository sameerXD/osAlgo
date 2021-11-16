import java.util.*;




class OermutationString{
  public static int factorial(String str){
    int n = str.length();
  int fact = 1;
  
  while(n>=1){
   fact *= n;
   n--;
  }
  return fact;
}
  
  public static void solution(String str){
  int fact = factorial(str);
  for(int i =0; i<fact; i++){
    StringBuilder sb = new StringBuilder(str);
    int tempI = i;
    for(int j =str.length(); j>=1; j--){
      int remainder = tempI%j;
      tempI /=j;
      System.out.print(sb.charAt(remainder));
      sb.delete(remainder,remainder+1);
    }
    System.out.println();
  }
}

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    solution(str);
  }
}