import java.util.Scanner;
public class FindMaximumJavaClass2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);  
        
        System.out.println("Pless Input Your Number OF Array");//รับจำนวน array จากuser
        int numArr=kb.nextInt();
        int[]A=new int[numArr];  //สร้างarray เเล้วยัดจำนวนarrayตามข้อมูลที่รับมาจากuser


        for (int i = 0; i < A.length; i++) {  //loop ข้อมูลใส่array เเต่ละ index
            System.out.print("Enter  number in Array " + i + ": ");
            A[i] = kb.nextInt();
        }


        FindMaximum(A); //เลียกใช้ method FindMaximum เเล้วส่งArrayไปหาค่ามากที่สุด
    }
    
    //สร้างmethod FindMaximum ในการหาค่าหาค่า maximum
    static void FindMaximum(int []Array){
        int Maxval =0;
        for(int i=0;i<Array.length;i++){
            if(Array[i]>Maxval){
                Maxval=Array[i];
            }   
        }
       System.out.println("Number Max in Array is :"+Maxval);//เเสดงค่า
    }
}
