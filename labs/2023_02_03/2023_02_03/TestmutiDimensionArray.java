
public class TestmutiDimensionArray {

    int number[][] = new int[10][];
    public static void main(String[] args) {
        
        TestmutiDimensionArray td=new TestmutiDimensionArray();

        int count = 1 ;
        int num = 1 ;
      for (int i = 0; i < 10; i++){
        td.number[i] = new int[count++];
        for (int j = 0; j<= i; j++){
            td.number[i][j] = num++ ;

            System.out.print(td.number[i][j] + "\t");
        }
        
        System.out.println();
      }
        
    }
    
}