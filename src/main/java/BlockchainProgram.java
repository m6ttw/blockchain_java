public class BlockchainProgram {

    public static void main(String[] args) {

        String statement1 = "it is wednesday my dudes";
        int hashvalue = statement1.hashCode(); // this is built into java

        System.out.println("Statement = " + statement1);
        System.out.println("Hash value = " + hashvalue);
    }

}