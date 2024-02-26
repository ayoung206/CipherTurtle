/**
 * MyStringBuilder allows us to have a collection of character so that we can create a String!
 */

import java.util.Iterator;

/**
 * It has four major operations that we can add, remove, change, toString of the collection of characters.
 * Linked List is internally used to maintain a chain of letters.
 *
 * @author Yong Hoon Do, A Kim.
 * @since Dec 8, 2017.
 */
public class MyStringBuilder implements Iterable<SBNode> {
    // A root node of our Linked List.
    public SBNode firstNode;
    // simply keeps track of how many SBNodes we have.
    public int count;

    /**
     * gives default values to our variables.
     */
    public MyStringBuilder() {
        count = 0;
        firstNode = null;
    }

    /**
     * Adds a new character so that we concatenate characters linearly with a help of SBNode.
     * Note that a null character won't be considered as a valid character.
     */
    public void add(char addingChar) {
        if (addingChar == '\0') {
            return;
        }

        SBNode node = new SBNode(addingChar);
        if (firstNode == null) {
            firstNode = node;
            count++;
            return;
        }

        SBNode root = firstNode;
        while (root.nextNode != null) {
            root = root.nextNode;
        }

        root.nextNode = node;
        count++;
    }

    /**
     * Changes a letter at a specified index with a new character. It checks if the position has invalid boundary,
     * so it will raise a StringIndexOutOfBoundsException if an invalid position is given.
     * Also, it might raise an exception if a null character is given.
     */
    public void change(char changeChar, int position) throws Exception {
        if (position < 0 || position >= count) {
            throw new StringIndexOutOfBoundsException("invalid bound of position given: " + position + ", count: " + count);
        }

        if (changeChar == '\0') {
            throw new IllegalArgumentException("An invalid character is given: " + changeChar);
        }

        SBNode root = firstNode;
        while (root != null && position > 0) {
            root = root.nextNode;
            position--;
        }

        if (root != null) {
            root.data = changeChar;
        }
    }

    /**
     * A helper method to print our letters by iterating through every nodes
     * and pick their char data to create a String.
     */
    private String getWord() {
        int i = 0;
        char arr[] = new char[count];
        for (SBNode b : this) {
            arr[i++] = b.data;
        }

        return String.valueOf(arr);
    }

    /**
     * Creates a new String from iteration of SBNode.
     * For more information,
     *
     * @see #getWord()
     */
    public String toString() {
        return getWord();
    }

    /**
     * The position goes from 0 to the length - 1 of our Linked List. It removes a node at the given position.
     *
     * @return A removed character.
     */
    public char remove(int position) {
        char removedCharacter = '\0';
        if (position < 0 || position >= count) {
            throw new StringIndexOutOfBoundsException("Invalid boundary of position is given.");
        }

        SBNode dummy = new SBNode('\0');
        dummy.nextNode = firstNode;
        SBNode prev = dummy;
        SBNode root = dummy.nextNode;
        while (position-- > 0) {
            prev = root;
            root = root.nextNode;
        }

        removedCharacter = root.data;
        prev.nextNode = root.nextNode;
        firstNode = dummy.nextNode;
        count--;
        return removedCharacter;
    }

    /**
     * Simply overrides a method to provide a capability: iteration of our Linked List.
     */
    @Override
    public Iterator<SBNode> iterator() {
        return new LetterIterator(firstNode);
    }

    /**
     * A helper class to iterate through every SBNode from the root to the tail node.
     */
    private static class LetterIterator implements Iterator<SBNode> {

        // A pointer of our SBNode to be used for the iterator and for each.
        private SBNode itRoot;

        private LetterIterator(SBNode root) {
            itRoot = root;
        }

        @Override
        public boolean hasNext() {
            return itRoot != null;
        }

        @Override
        public SBNode next() {
            SBNode tmp = itRoot;
            itRoot = itRoot.nextNode;
            return tmp;
        }
    }
}