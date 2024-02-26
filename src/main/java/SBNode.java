/**
 * File header: This file contains a java code representing a node to be used in Linked List.
 *
 * @author Yong Hoon Do, A Kim.
 * @since Dec 8, 2017.
 */

/**
 * SBNode is used as a LinkedList containing a single character as its data.
 */
public class SBNode {

    public char data;
    public SBNode nextNode;

    /**
     * Creates an instance of SBNode with the given character.
     *
     * @param c A character.
     */
    public SBNode(char c) {
        this.data = c;
        nextNode = null;
    }
}
