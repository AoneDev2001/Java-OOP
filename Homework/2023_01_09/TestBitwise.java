/**
 * TestBitwise
 */
public class TestBitwise {

    public static void main(String[] args) {
        int bit1 =66; //66 มีค่าเท่ากับ 0000 0000 0000 0000 0000 0000 0100 0010
        int bit2 =30; //30 มีค่าเท่ากับ 0000 0000 0000 0000 0000 0000 0001 1110
        int bit3 =-30; //-33มีค่าเท่ากับ 1111 1111 1111 1111 1111 1111 1110 0010
        
        
        System.out.println(bit1+"="+Integer.toBinaryString((bit1 ))+"base 2" );
        System.out.println(bit2+"="+Integer.toBinaryString((bit2 ))+"base 2");
        System.out.println(bit3+"="+Integer.toBinaryString((bit3 ))+"base 2");
        System.out.print( bit1 + " AND " + bit2 + " = " + (bit1 & bit2) + " (base 10) " + " = " + Integer.toBinaryString((bit1 & bit2)) + " (base 2)\n");
        System.out.print( bit1 + " OR " + bit2 + " = " + (bit1 | bit2) + " (base 10) " + " = " + Integer.toBinaryString((bit1 | bit2)) + " (base 2)\n");
        System.out.print( bit1 + " XOR " + bit2 + " = " + (bit1 ^ bit2) + " (base 10) " + " = " + Integer.toBinaryString((bit1 ^ bit2)) + " (base 2)\n");
        System.out.println("NOT"+bit1+"="+ (~bit1 )+ " (base 10) " +"="+Integer.toBinaryString((~bit1 ))+ " (base 2) ");
        System.out.println("NOT"+bit2+"="+(~bit2 )+ " (base 10) " +"="+Integer.toBinaryString((~bit2 ))+ " (base 2) ");
        System.out.println(bit1+" Right Shift"+ "3 bit"+"="+ (bit1>>bit3 )+"(base 10)"+Integer.toBinaryString((bit1>>bit3 ))+ "(base 2) ");
        System.out.println(bit3+" Right Shift"+ "3 bit"+"="+ (bit3>>bit3 )+"(base 10)"+Integer.toBinaryString((bit3>>bit3 ))+ "(base 2) ");
        System.out.println(bit1+" Unsigned Right Shift"+" 3 bit"+"="+( bit1>>>3 )+"(base 10)"+"="+Integer.toBinaryString((bit1>>>bit3 ))+ "(base 2) ");
        System.out.println(bit3+" Unsigned Right Shift"+" 3 bit"+"="+( bit3>>>3 )+"(base 10)"+"="+Integer.toBinaryString((bit3>>>bit3 ))+ "(base 2) ");
        System.out.println(bit2+"Left Shift"+" 6 bit"+"="+( bit2<<6 )+ "(base 10) "+"="+Integer.toBinaryString((bit2<<6 ))+ "(base 2) ");
           
         
    }

}