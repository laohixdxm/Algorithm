import java.util.*;

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */
public class temp {
  public int[] singleNumber(int[] nums) {
    int[] ans = new int[2];
    if (nums == null || nums.length < 3) {
      return nums;
    }

    int combine = 0;
    for (int num: nums) {
      combine ^= num;
    }

    int i = 0;
    while (i < 31) {
      if (((combine >> i) & 1) == 1) {
        break;
      }
    }
    for (int num: nums) {
      if (((num >> i) & 1) == 1) {
        ans[0] ^= num;
      } else {
        ans[1] ^= num;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    String[] temp = {"oath", "pea", "eat", "rain"};
    char[][] board = {
        {'o', 'a', 'a', 'n'},
        {'e', 't', 'a', 'e'},
        {'i', 'h', 'k', 'r'},
        {'o', 'f', 'l', 'v'}
    };

    Set<String> dict = new HashSet<String>();

    for (int i = 0; i < temp.length; i++) {
      dict.add(temp[i]);
    }

    String[] strA = {"1 + 1", " 2-1 + 2", "(1 + (4+5+2)-3) + (6+8)"};
    int i = 0;


    char[][] sodoku = {{'X', 'X', 'X', 'X'},
        {'X', 'O', 'O', 'X'},
        {'X', 'X', 'O', 'X'},
        {'X', 'O', 'X', 'X'}};
    int[] A = {1, 2, 3, 4, 5};
    int[][] matrix1 = {

        {3, 2, 2},
        {1, 2, 4},
        {1, 20, 4}
    };

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.right = new TreeNode(6);
    TreeLinkNode tln = new TreeLinkNode(1);
    tln.left = new TreeLinkNode(2);
    tln.right = new TreeLinkNode(3);
    tln.left.left = new TreeLinkNode(4);
    tln.left.right = new TreeLinkNode(5);
    tln.right.right = new TreeLinkNode(7);


    List<Interval> test = new ArrayList<>();
    test.add(new Interval(1, 2));
    test.add(new Interval(3, 5));
    test.add(new Interval(6, 7));
    test.add(new Interval(8, 10));
    test.add(new Interval(12, 16));
    Queue<Set<String>> myQueue = new LinkedList<>();

    ArrayList<Integer> B = new ArrayList<Integer>();
    for (int n: A) {
      B.add(n);
    }
//    Point[] pts= {new Point(0, 0), new Point(0, 1), new Point(2, 2), new Point(2, 1)};
//
//    ListNode head = new ListNode(4);
//    head.next = new ListNode(3);
//    head.next.next = new ListNode(1);
//    head.next.next.next = new ListNode(5);
//    head.next.next.next.next = new ListNode(2);
    boolean check = dict.contains("hot");
    String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
    int[] pre = {1, 2, 5, 6, 3, 7, 8};
    int[] in = {5, 2, 6, 1, 7, 3, 8};
    int[] post = {5, 6, 2, 7, 8, 3, 1};
    ArrayList<Interval> quries = new ArrayList<>();
    quries.add(new Interval(1, 2));
    quries.add(new Interval(0, 4));
    quries.add(new Interval(2, 4));
    int[] col = new int[1000];

    List<Integer> a1 = new ArrayList<>(B);
    List<Integer> a2 = new ArrayList<>(B);
    System.out.println(new temp().binaryTreePaths(root));
  }
}

