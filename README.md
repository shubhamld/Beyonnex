Anagrams :- Two string are called Anagrams if they both are permutation of each other, meaning they are made up of same length and same number of characters irrespective of the order

File Description:-
 * Anagrams.java - Contains the implementation of the solution for Anagrams problem
 * AnagramsTest.java - Contains all the Junit tests for the anagrams solution
     
How To Run the project:-
* Please clone this repository using SSH or HTTP
* To Run all the tests, run command in terminal from project root directory - 'mvn test' (Made this project using MAVEN build system for extensibility and readability)
* To run a single test: mvn test -Dtest="AnagramsTest#shouldReturnFalseWhenEitherInputStringIsNull"

Implementation:
Chose this (HashMap) approach with maven build system because this solution seems to be most performant with easy readability and also could be easily extended.

Language used: Java 17
Testing framework: Junit 4

  Assumptions:
  * inputs can contains character of different cases, hence have to make solution case sensitive
  * inputs can contain special characters and digits
  * inputs can be null, if either input is null solution will return false
  
  HashMap Approach:
  * Code intializes a HashMap of (character, Integer) key-value pair to hold the character count from one input string
  * Then code traverses other input string and decreases the character count
  * For success scenario for being Anagrams all the count of character left in the hash table must be zero (which will mean both string are made up of same number of characters)
  * If any character count is not zero then code declares input strings to be not anagrams
  
  Time complexity of this solution is : O(n)
  As it traverses once on both strings of length n in separate individual loops
  
Further Notes:
* If we assume only characters from 'a' - 'z' are allowed, Array approach could also be used to store character count instead of hashmap like below, rest of the logic will remain same:
  int[] charCountArray = new int[26]
* Theoretically, this approach will also have time complexity of - O(n)
* Practically this approach could be even faster as hashMaps put operations(hash value calculations) are eliminated
