import java.util.Scanner;

public class LL {
    public static void main(String[] args) {
        int n = 5;
        Scanner in = new Scanner(System.in);
        ListNode head = new ListNode();
        ListNode tail = head;

        for(int i = 0;i<n;i++){
            ListNode newNode = new ListNode(in.nextInt());

            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
        }

        ListNode iter = head;
        // while(iter != null){
        //     System.out.print(iter.val+ "->");
        //     iter = iter.next;
        // }

        tail.next = head;
        System.out.println(isCycle(head));
        
    }

    static ListNode getMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    static boolean isCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}



class ListNode{
    int val;
    ListNode next;

    public ListNode(){}

    public ListNode(int val){
        this.val = val;
    }
}
