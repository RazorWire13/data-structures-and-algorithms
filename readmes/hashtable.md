# Challenge 29: Hash Tables
Implement basic functionality methods of a hashtable

## Challenge
Implement a Hashtable with the following capabilities:

`Add()`
 When adding a new key/value pair to a hashtable:
* Send the key to the GetHash method.
* Once you determine the index of where it should be placed, go to that index
* Check if something exists at that index already, if it doesn’t, add it with the key/value pair.
* If something does exist, add the new key/value pair to the data structure within that bucket.

`Find()`
* The Find takes in a key, gets the Hash, and goes to the index location specified.
* Once the index location is found in the array, it is then the responsibility of the algorithm the iterate through the bucket and see if the key exists and return the value.

`Contains()`
* The Contains method will accept a key, and return a bool on if that key exists inside the hashtable.
* The best way to do this is to have the contains call the GetHash and check the hashtable if the key exists in the table given the index returned.

`GetHash()`
* The GetHash will accept a key as a string, conduct the hash, and then return the index of the array where the key/value should be placed.

## Approach & Efficiency
 add() - O(n) Time and O(1) Space
 find() & contains() - O(n) Time O(1) Space
 
## Checklist

  - [x] Read challenge
  - [x] Whiteboard challenge
  - [x] Code Challenge
  - [x] Write tests
  - [x] A-C-P and document

### Reference Documents
* During the course of this lab I referred to the following sites for instruction on building out this lab:
- https://tekmarathon.com/2013/03/11/creating-our-own-hashmap-in-java/
- https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/tutorial/
- https://coderanch.com/t/667996/java/building-simple-hash-table-scratch
- https://stackoverflow.com/questions/2624192/good-hash-function-for-strings