// Tester for PA9

public class PA9Tester {

    // Seed passed to random generator to match the expected output
    private static int SEED = 2017;

    public static void main(String[] args) throws Exception {
        System.out.println("****************** Testing PA9 ******************");

        int score = 0;
        score += test_SBNode();
        score += test_MyStringBuilder();

        System.out.println("*************************************************");
        System.out.println("************** SCORE " + score + " / 6 points ***************");
        System.out.println("*************************************************");
        System.out.println("NOTE: THIS TESTER DOES NOT GUARANTEE FULL CREDIT IN THE PA");
    }

    // TEST SBNode
    public static int test_SBNode() throws Exception {
        System.out.println("- Testing Part 2A: SBNode");
        int score = 0;
        try {
            SBNode nodeOne = new SBNode('a');
            SBNode nodeTwo = new SBNode('b');
            System.out.print("[SBNode] Testing constructor char..........");
            if (nodeOne.data == 'a' && nodeTwo.data == 'b') {
                System.out.println("passed");
                score += 1;
            } else {
                System.out.println("FAILED");
            }

            nodeOne.nextNode = nodeTwo;
            System.out.print("[SBNode] Testing nextNode assignment.......");
            if (nodeOne.nextNode == nodeTwo) {
                System.out.println("passed");
                score += 1;
            } else {
                System.out.println("FAILED");
            }


            return score;
        } catch (Exception e) {
            return score;
        }
    }

    // TEST MyStringBuilder
    public static int test_MyStringBuilder() throws Exception {
        System.out.println("- Testing Part 2B-E: MyStringBuilder");
        int score = 0;
        try {
            MyStringBuilder msb = new MyStringBuilder();
            msb.add('a');
            msb.add('b');
            SBNode nodeOne = msb.firstNode;
            SBNode nodeTwo = nodeOne.nextNode;
            System.out.print("[MyStringBuilder] Testing add()............");
            if (nodeOne.data == 'a' && nodeTwo.data == 'b') {
                System.out.println("passed");
                score += 1;
            } else {
                System.out.println("FAILED");
            }

            msb.change('c', 0);
            System.out.print("[MyStringBuilder] Testing change().........");
            if (nodeOne.data == 'c' && nodeTwo.data == 'b') {
                System.out.println("passed");
                score += 1;
            } else {
                System.out.println("FAILED");
            }

            msb.add('\0');
            String myString = msb.toString();
            String javaString = "cb";

            System.out.print("[MyStringBuilder] Testing toString().......");
            if (myString.equals(javaString)) {
                System.out.println("passed");
                score += 1;
            } else {
                System.out.println("FAILED");
            }

            msb.remove(0);
            System.out.print("[MyStringBuilder] Testing remove().........");
            if (msb.firstNode.data == 'b') {
                System.out.println("passed");
                score += 1;
            } else {
                System.out.println("FAILED");
            }

            return score;
        } catch (Exception e) {
            return score;
        }
    }
}
