# HashTables
***Question 1:*** 
Using the large prime number is a far more functional solution, as numbers with many factors reduce the uniqueness of the hash function. Large, ugly numbers generate functional, unique values.

***Question 2:*** 
In the same sense, there are many ways to sum to the same value, so using character summation will only limit the functionality of the method. With fewer possible ways to arrive at a solution, there are fewer possible collisions.

***Question 3:*** 
The native Java hashCode() method uses two prime numbers in a recursive function. The hash value starts as a simple prime, is multiplied by a larger prime, and is then summed with the recursive value of the hashCode() of the next key in the key array. Then, the method returns the recursive total value of the hash.
