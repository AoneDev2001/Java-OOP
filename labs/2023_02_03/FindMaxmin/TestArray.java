
public class TestArray {
  
  public static void demo1() {
    int size1 =5;                                        //กำหนดsize ของ array
    int[]arr;                                           //สร้าง array  ว่าง
    MyArray1 m=new MyArray1();                          //สร้างobj จากคลาส MyArray1
    arr=m.inputInt2Array(size1);                        //ส่ง size ไปให้ method inputInt2Array เเล้วเอาตัวเเปล arr มารับค่าผ่านobj ที่returnกลับมา
    for(int i= 0;i<arr.length;i++){                     //loop สมาชิคเต่ละindex ใน array มาเเสดง
        System.out.println("Index "+i+"  IS  "+arr[i]);  
       }
    System.out.println("Number Max in Array is :"+m.Max(arr)); //เเสดงค่ามากที่สุด
  }

  public static void demo2() {
   MyArray2 m=new MyArray2();
     m.setArr();
    int[] array=m.getArray();

     for(int i= 0;i<array.length;i++){                      //loop สมาชิคเต่ละindex ใน array มาเเสดง
      System.out.println("Index "+i+"  IS  "+array[i]);
          }
     System.out.println( "max is "+m.Max()+ " Min is"+m.Min());
   
  }
  
  public static void demo3() {
    MyArray2 m=new MyArray2();    
    m.genArr();
    int[] array=m.getArray();

     for(int i= 0;i<array.length;i++){                      //loop สมาชิคเต่ละindex ใน array มาเเสดง
      System.out.println("Index "+i+"  IS  "+array[i]);
     }
    System.out.println( "max is "+m.Max()+ " Min is"+m.Min());
  }
  
  public static void demo4() {
    MyArray1 m=new MyArray1();
    int arr[]={20,50,44,1,6};
    //max
    System.out.println("Max is "+m.Max(arr));
    //min
    System.out.println("Min is "+m.Min(arr));
  }



  public static void main(String[] args) {
    
    //demo2(); 
    //demo3();
    demo4();
  }
}
