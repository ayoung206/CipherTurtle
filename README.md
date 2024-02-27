## Program

**Part 1**

Caesar cipher is an algorithm that takes a message in the form of a letter (sequence of characters) and returns another sequence of characters which is apparently hard to read but it can be converted back into the original letter. Turning the original letter into the cipher is called encryption; reversing the process is called decryption. Animation is a process of making the motion. In this part, it will provide a running animation of a turtle/turtles writing each of the encrypted character of the letter out.

**Part 2**

MyStringBuilder lets you modify your string since it views a string as a collection of characters internally.
It concatenates characters using a Linked List so that these active characters are liearly staying together which makes us iterating them in order. It supports three modifications of the string: add, remove, change. Also, it provides a capability to view this active String.

## Testing

**Part 1**

We would ensure that the both encryption methods are correct because the animation draws the encrypted text as the GIFs provided. For part a, a single turtle drawing the encrypted message for “ENCRYPTION” appears. Also, for part b, turtles are created as much as the number of characters are in a String  and they draw each character simultaneously. Thus, we ensure that multithreading is working because the animation with multiple turtles was done more quickly.

**Part 2**

We tested with various edge cases:
- if it can handle the operations with a null character
- if it can recognize a valid position or a valid character given as an argument
- if it shows a complete String (even calling multiple times in series)

Other than that, for our desired result, we tested general operations:
- adding a new character
- removing an existing character at a given position
- changing an existing character at a given position with a new character
- showing a correct String. 
