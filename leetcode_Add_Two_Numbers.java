/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1_t = l1;
        ListNode l2_t = l2;
        ListNode ans = new ListNode(0);
        ListNode temp = ans; // 這樣宣告，temp則是繼承了ans的記憶體位置 call by address 
 
        int v1 = 0, v2 = 0, sum = 0, carry = 0;
        while (l1_t != null || l2_t != null) {
 
            if (l1_t == null)
                v1 = 0;
            else
                v1 = l1_t.val;
 
            if (l2_t == null)
                v2 = 0;
            else
                v2 = l2_t.val;
 
            sum = carry + v1 + v2; // 要加原本已經進位的數值
            carry =0;
            if (sum >= 10) {
                sum = sum % 10;
                carry=1;
            }
 
            if (l1_t != null)
                l1_t = l1_t.next;
 
            if (l2_t != null)
                l2_t = l2_t.next;
 
            temp.val = sum;
            sum =0;
            if (l1_t != null || l2_t != null || carry >= 1) { //3個條件都不符合就不要在串新的listnode了
                temp.next = new ListNode(carry);
                temp = temp.next;
            }
 
        }
        return ans;
    }
}
