import java.util.*;

class MatrixMultiplication{
  

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int m1 = scn.nextInt();
    int n1 = scn.nextInt();
    
    int[][] mat1 = new int[m1][n1];
    

    for(int i =0; i<m1; i++){
      for(int j =0; j<n1;j++){
        mat1[i][j] = scn.nextInt();
      }
    }
    
    

    int m2 = scn.nextInt();
    int n2 = scn.nextInt();
    
    int[][] mat2 = new int[m2][n2];
    
    for(int i =0; i<m2; i++){
      for(int j =0; j<n2;j++){
        mat2[i][j] = scn.nextInt();
      }
    }
    
    
    if(m1!=n2){
      System.out.print("Invalid input");
      return;
    }
    
    int[][] mul = new int[m1][n2];
    int sum=0; 
    for(int i =0; i<m1; i++){
      for(int j =0; j<n2;j++){
        
        for(int k =0; k<n1; k++){
          sum+=mat1[i][k] * mat2[k][j];
        }
        mul[i][j] = sum;
        sum =0;
      }
    }
    
        for(int i =0; i<m1; i++){
      for(int j =0; j<n2;j++){
        System.out.print(mul[i][j] + " ");
      }
      System.out.println();
    }
    
  }
}