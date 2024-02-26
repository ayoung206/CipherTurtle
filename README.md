## Program [4 Points]

For Part 1: describe the Caesar Cipher in high level, the animation, and how they relate. Assume that you are writing for someone without a computer science background.

For Part 2: on this part only you may use CS terms. The individual file, class, and method descriptions are already included as part of style points; here, describe the functionality of your StringBuilder in high level and what you can do with them. Discuss how this data structure provides the programmer better tools to manipulate Strings. You can ignore the fact that the Java libraries exist; write as if you wrote the first ever StringBuilder.

**Answer for Part 1**

Caesar cipher is an algorithm that takes a message in the form of a letter (sequence of characters) and returns another sequence of characters which is apparently hard to read but it can be converted back into the original letter. Turning the original letter into the cipher is called encryption; reversing the process is called decryption. Animation is a process of making the motion. In this part, it will provide a running animation of a turtle/turtles writing each of the encrypted character of the letter out.

**Answer for Part 2**

MyStringBuilder lets you modify your string since it views a string as a collection of characters internally.
It concatenates characters using a Linked List so that these active characters are liearly staying together which makes us iterating them in order. It supports three modifications of the string: add, remove, change. Also, it provides a capability to view this active String.

## Testing [4 Points] 

For Part 1: describe how you ensured algorithmic correctness of both encryption methods and how they connected with the animation. 

For Part 2: explain the reasoning behind how you tested each method, describe (don’t list) what test cases you created, and rate how sure you are that your data structure’s methods were correct (not sure it’s totally correct or very sure it’s entirely correct). Write at least four sentences in total.

(Remember that as a data structure designer, you provide tools for others, just like how the Java libraries provides you tools for your assignments. Functional correctness is definitely vital here. )

**Answer for Part 1**

We would ensure that the both encryption methods are correct because the animation draws the encrypted text as the GIFs provided. For part a, a single turtle drawing the encrypted message for “ENCRYPTION” appears. Also, for part b, turtles are created as much as the number of characters are in a String  and they draw each character simultaneously. Thus, we ensure that multithreading is working because the animation with multiple turtles was done more quickly.

**Answer for Part 2**

We tested with various edge cases:
- if it can handle the operations with a null character
- if it can recognize a valid position or a valid character given as an argument
- if it shows a complete String (even calling multiple times in series)

Other than that, for our desired result, we tested general operations:
- adding a new character
- removing an existing character at a given position
- changing an existing character at a given position with a new character
- showing a correct String. 

## Conceptual Question [2 Point]

In the context of encryptMT(), given:

```
a legal 8-character String
a maximum of two threads running simultaneously
```

Assuming every character takes the same amount of time to encrypt and draw, how long will the encryption take to finish the drawing? The unit of time is charTime, the amount of time it takes to encrypt and draw one character. You don’t have to show your work.

4 charTime
