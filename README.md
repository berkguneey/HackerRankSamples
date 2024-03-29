# HackerRankSamples
***HackerRank Samples***

**Append And Delete:**

You have two strings of lowercase English letters. You can perform two types of operations on the first string:
- Append a lowercase English letter to the end of the string.
- Delete the last character of the string. Performing this operation on an empty string results in an empty string.

Given an integer, k, and two strings, s and t, determine whether or not you can convert s to t by performing exactly k of the above operations on s. If it's possible, print Yes. Otherwise, print No.

**Between Two Sets:**

There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
- The elements of the first array are all factors of the integer being considered.
- The integer being considered is a factor of all elements of the second array.

These numbers are referred to as being between the two arrays. Determine how many such numbers exist.

**Bigger Is Greater:**

Lexicographical order is often known as alphabetical order when dealing with strings. A string is greater than another string if it comes later in a lexicographically 
sorted list. Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:
- It must be greater than the original word.
- It must be the smallest word that meets the first condition.

**Cavity Map:**

You are given a square map as a matrix of integer strings. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side, or edge.

Find all the cavities on the map and replace their depths with the uppercase character X.

**Counting Valleys:**

An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly steps steps, for every step it was noted if it was an uphill, U, or a downhill,D  step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms:

- A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
- A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.  

**Encryption:**

An English text needs to be encrypted using the following encryption scheme. First, the spaces are removed from the text. Let L be the length of this text.

**Featured Products:**

An e-commerce site tracks the purchases made each day. The product that is purchased the most one day is the featured product for the following day. If there is a tie for
the product purchased most frequently, those product names are ordered alphabetically ascending and the last name in the list is chosen.

**Find Digits:**

An integer d is a divisor of an integer n if the remainder of n % d = 0.  
Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

**Grouping Transactions By Items' Name:**

Migros-Coderspace Question

**Library Fine:**

Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

- If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0).  
- If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, fine = 15 Hackos x (the number of days late).  
- If the book is returned after the expected return month but still within the same calendar year as the expected return date, the fine = 500 Hackos x (the number of months late).  
- If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.  

Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be 10,000 Hackos.

**Manasa And Stones:**

Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that any two consecutive stones' numbers differ by one of two values. Legend has it that there is a treasure trove at the end of the trail. If Manasa can guess the value of the last stone, the treasure will be hers.

**Organizing Containers of Balls:**

David has several containers, each with a number of balls in it. He has just enough containers to sort each type of ball he has into its own container. 
David wants to sort the balls using his sort method. David wants to perform some number of swap operations such that:
-Each container contains only balls of the same type.
-No two balls of the same type are located in different containers.

**Picking Numbers:**

Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.

**Save the Prisoner!:**

A jail has a number of prisoners and a number of treats to pass out to them. Their jailer decides the fairest way to divide the treats is to seat the prisoners 
around a circular table in sequentially numbered chairs. A chair number will be drawn from a hat. Beginning with the prisoner in that chair, one candy will be 
handed to each prisoner sequentially around the table until all have been distributed.  
The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes awful. Determine the chair number occupied by the prisoner 
who will receive that candy.

**Sherlock and Squares:**

Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value that describe a range of integers, inclusive of the endpoints. Sherlock must determine the number of square integers within that range.

Note: A square integer is an integer which is the square of an integer, e.g. 1, 4, 9, 16, 25.

**Sherlock and the Valid String:**

Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just 1 character at 1 index 
in the string, and the remaining characters will occur the same number of times. Given a string s, determine if it is valid. If so, return YES, otherwise return NO.

**Sub Division**

Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.  
Lily decides to share a contiguous segment of the bar selected such that:
- The length of the segment matches Ron's birth month, and,  
- The sum of the integers on the squares is equal to his birth day.  

Determine how many ways she can divide the chocolate.

**The Time in Words:**

5:00 -> five o'clock.  
5:01 -> one minute past five.  
5:10 -> ten minutes past five.  
5:45 -> quarter to six.  

At minutes = 0, use o' clock. For 1 <= minutes <= 30, use past, and for 30 < minutes use to. Note the space between the apostrophe and clock in o' clock. 
Write a program which prints the time in words for the input given in the format described.

**Time Conversation:**

Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.  
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
