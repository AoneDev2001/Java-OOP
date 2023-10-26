public class TestExcepsion3 {
    public static void main(String[] args) {
        try{
            Class.forName("come.mysql.jdbc.Driver"); 
        } catch (ClassNotFoundException e){
            System.out.println("com.mysql.jdbc.Driver not found");
            System.out.println("You should be put the correct class name");
        }
    }

}
