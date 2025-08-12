# Day-8: Write a program that takes a string as input and finds:
1.The smallest word(s) in the string.
2.The longest word(s) in the string.
3.If there are multiple smallest or longest words, print all of them. Words are separated by spaces, and punctuation should be ignored.

**TestCases:**
1. **Input:** I love Python and Java equally   **output:** Smallest word(s): I    Longest word(s): equally
2. **Input:** Data science and AI are fun and amazing  **output:** Smallest word(s): AI   Longest word(s): science, amazing


 **Intuition**
1.The problem is to find:
  Smallest word(s) in the string.
  Largest word(s) in the string.
2.First, figure out the smallest and largest word lengths.
3.Then, print all words that match those lengths.
4.We don’t need to store all lengths or use extra arrays — just keep track of the smallest and largest lengths while scanning through the words once. Then, make a second pass to print matching words.

**Algorithm**
1: Read the input string.
2: Split the string into words using split("\\s+") (splits by one or more spaces).
3: Initialize minLen and maxLen with the length of the first word.
4: Loop through all words once:
  If current word length < minLen → update minLen.
  If current word length > maxLen → update maxLen.
5: Print all words with length = minLen (second loop).
6: Print all words with length = maxLen (second loop).

**Complexity analysis**
Time Complexity: O(n × m).
Space Complexity: O(n × m).
