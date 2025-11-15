class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> remove = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        while (head != null && remove.contains(head.val)) {
            head = head.next;
        }
        if (head == null) return null;

        ListNode curr = head;

        while (curr.next != null) {
            if (remove.contains(curr.next.val)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}