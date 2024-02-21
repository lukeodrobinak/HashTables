# HashTables
***Question 1***
Using the large prime number is a far more functional solution, as numbers with many factors reduces the unique-ness of the hash fucntion. Large ugly numbers generate functional unique values.

***Question 2***
In the same sense, there are many ways to sum to the same value, so using charater summation will only limit the functionality. Less possible ways to arrive at a solution, less possible collisions.

***Question 3***
The native Java hashCode() method uses two prime number in a recursive function. The has value starts as a simple prime, is multiplied by a larger prime, then summed with the recuriseve value of the hashCode() of the next key the the key array. Then it returns the recursive total value of the hash.
