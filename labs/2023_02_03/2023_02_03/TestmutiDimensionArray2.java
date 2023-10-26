
public class TestmutiDimensionArray2 {

  static int number[][] = new int[10][];
  public static void main(String[] args) {
      
      

      int count = 1 ;
      int num = 1 ;
    for (int i = 0; i < 10; i++){
      number[i] = new int[count++];
      for (int j = 0; j<= i; j++){
          number[i][j] = num++ ;

          System.out.print(number[i][j] + "\t");
      }
      
      System.out.println();
    }
      
  }
  
}