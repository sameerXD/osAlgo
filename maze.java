import java.util.*;

class maze{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    
    int m = scn.nextInt();
    int n = scn.nextInt();
    
    int[][] arr = new int[m][n];
    
    for(int i =0; i<m ; i++){
      for(int j =0 ; j<n; j++){
        arr[i][j] = scn.nextInt();
      }
    }
    
    int dir = 0;
     int i =0;
     int j =0;
    while(true){
      //    right 
      dir = (dir + arr[i][j])%4;
      if(dir ==0){
        j++;
      }
//      down
      else if(dir ==1){
        i++;  
      }
//     left 
      else if(dir==2){
        j--;
      }else if(dir == 3){
        i--;
      }
      
      if(i<0){
        i++;
        break;
      }else if(j<0){
        j++;
        break;
      }else if(i==m){
        i--;
        break;
      }else if(j==m){
        j--;
        break;
      }
    }
    
     System.out.println(i);
     System.out.print(j);
    }

}