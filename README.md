You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

https://leetcode.com/problems/add-two-numbers/


將兩組數字串相加，相加結果大於10要進位，輸入的數值是這樣讀   2 (個位)-> 4(十位) -> 3 (百位)，判斷當兩個數字串該位數都沒有且沒有進位，就結束迴圈
