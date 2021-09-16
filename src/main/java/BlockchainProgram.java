import java.util.ArrayList;
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

        // a series of blocks in a chain
        ArrayList<Block> blockChain = new ArrayList<Block>();

        String[] initialValues = {"Matt has £300", "James has £550", "Sean has £600"};
        Block genesisBlock = new Block(initialValues, 0);
        blockChain.add(genesisBlock);
        System.out.println("First block is " + genesisBlock.toString());
        System.out.println("The blockchain is " + blockChain.toString());
    }

}