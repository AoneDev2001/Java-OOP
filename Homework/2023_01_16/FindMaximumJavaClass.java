import java.util.Scanner;
class FindMaximumJavaClass {
   public static void main(String[] args) {
         Scanner kb=new Scanner(System.in);  
        
        System.out.println("Pless Input Your Number OF Array");//รับจำนวน array จากuser
        int numArr=kb.nextInt();
        int[]A=new int[numArr];  //สร้างarray เเล้วยัดจำนวนเลขตามข้อมูลที่รับมาจากuser ลงในarray


        for (int i = 0; i < A.length; i++) {  //loop ข้อมูลใส่array เเต่ละ index
            System.out.print("Enter  number in Array " + i + ": ");
            A[i] = kb.nextInt();
        }

       System.out.println("Number Max in Array is :"+FindMaximum(A));//เลียกใช้ method FindMaximum เเล้วส่งArrayไปหาค่ามากที่สุด เเล้วprint ออกมา
   } 

   //สร้างmethod FindMaximum ในการหาค่าหาค่า maximum 
   static int FindMaximum(int []Array){
     int maxvalue1 =0;
     for(int i=0;i<Array.length;i++){
        if(Array[i]>maxvalue1){
            maxvalue1=Array[i];
        }   
    }
    return maxvalue1;  //return ส่งค่ากลับออกมา
   }
}
