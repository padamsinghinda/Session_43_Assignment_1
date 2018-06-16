// Databricks notebook source
/* Task 1
Given a list of numbers 
- List[Int] (1, 2, 3, 4, 5, 6, 7, 8, 9, 10) 
- find the sum of all numbers 
- find the total elements in the list 
- calculate the average of the numbers in the list 
- find the sum of all the even numbers in the list
- find the total number of elements in the list divisible by both 5 and 3
*/

// COMMAND ----------

// Create a list
val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// COMMAND ----------

// - find the sum of all numbers 
list.reduceLeft(_ + _)

/* 
Other ways to calculate sum of the elements are :
a. list.reduceRight(_ + _)
b. list.reduce(_ + _)
c. list.reduceLeft((x,y) => x + y)
*/

// COMMAND ----------

// - find the total elements in the list 
list.length

// COMMAND ----------

// - calculate the average of the numbers in the list 
(list.reduce(_ + _)) / (list.length)

// COMMAND ----------

// - find the sum of all the even numbers in the list
list.filter(_ % 2 == 0).reduce(_ + _)

// COMMAND ----------

//- find the total number of elements in the list divisible by both 5 and 3
list.filter(x => x % 3 == 0 || x % 5 == 0).length

// COMMAND ----------


