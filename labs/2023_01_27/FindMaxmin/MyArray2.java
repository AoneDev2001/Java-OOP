import java.util.Random;
import java.util.Scanner;

public class MyArray2 {
     private int[] array;
    
     public int[] getArray() {
        return array;
    }

    public  void setArr(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter size of your Array");
          int size =sc.nextInt();
          this.array=new int[size];
          for(int i=0;i<array.length;i++){                    
            System.out.print("Enter  number in Array " + i + ": ");
            array[i]=sc.nextInt();
        }
       }
       public  void genArr(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Entter size of your Array");
        int size =sc.nextInt();
        this.array=new int[size];
        for(int i=0;i<array.length;i++){                     
            array[i]=rand.nextInt(100);
        } 
       }
       public int Max(){
        int maxvalue1 =array[0];
        for(int i=1;i<array.length;i++){                  //loop ข้อมูลใน array หาค่ามากสุด
            if(array[i]>maxvalue1){
                maxvalue1=array[i];
            }   
        }
        return maxvalue1;                                //return max ส่งค่ากลับออกมา
       }

       public int Min(){
        int minvalue1 =array[0];
        for(int i=1;i<array.length;i++){                  //loop ข้อมูลใน array หาค่ามากสุด
            if(array[i]<minvalue1){
                minvalue1=array[i];
            }   
        }
        return minvalue1;   
       }
    
}
