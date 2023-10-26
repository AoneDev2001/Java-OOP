import java.util.Scanner;
 class MyArray1 {
    
    public int[] inputInt2Array(int n){
        Scanner kb=new Scanner(System.in);
        
        int[]A2=new int[n];
        for (int i = 0; i < n; i++) {  //loop ข้อมูลใส่array เเต่ละ index
            System.out.print("Enter  number in Array " + i + ": ");
            A2[i] = kb.nextInt();
        }
        return A2;//return arr ส่งค่ากลับออกมา
       }
       
    public int Max(int []Array){
        int maxvalue1 =Array[0];
        for(int i=1;i<Array.length;i++){
           if(Array[i]>maxvalue1){
               maxvalue1=Array[i];
           }   
       }
       return maxvalue1;  //return max ส่งค่ากลับออกมา
      }

}