
public class TestArray {
  
  public static void demo1() {
    int size1 =5;
    int[]arr;
    MyArray1 m=new MyArray1();
    
    arr=m.inputInt2Array(size1);
    for(int i= 0;i<arr.length;i++){
        System.out.println("Index "+i+"  IS  "+arr[i]);
    }
    System.out.println("Number Max in Array is :"+m.Max(arr));
      
    
  }

  public static void main(String[] args) {
    

    demo1();
  }
}
