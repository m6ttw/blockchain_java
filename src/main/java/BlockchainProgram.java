import java.util.Arrays;

public class BlockchainProgram {

    public static void main(String[] args) {

        // hash function example
        String statement1 = "it is wednesday my dudes"; // -900083336
        int hashValue = statement1.hashCode(); // this is built into java

        System.out.println("Statement = " + statement1);
        System.out.println("Hash value = " + hashValue);

        // hashing arrays
        String [] testList1 = {"apple", "ball", "cat"}; // -699612432
        String [] testList2 = {"apple", "ball", "cat"}; // -699612432
        String [] testList3 = {"Apple", "Ball", "Cat"}; // 935457424

        int hashList1 = Arrays.hashCode(testList1);
        int hashList2 = Arrays.hashCode(testList2);
        int hashList3 = Arrays.hashCode(testList3);

        System.out.println("Hash 1 = " + hashList1 + " and Hash 2 = " + hashList2 + " and Hash 3 = " + hashList3);
    }

}