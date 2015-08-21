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
  public class Solution {
    /**
     * @param buildings: A list of lists of integers
     * @return: Find the outline of those buildings
     */
    private class Building {
      int start, end, h;

      Building(int start, int end, int h) {
        this.start = start;
        this.end = end;
        this.h = h;
      }
    }

    private Comparator<Building> buildComp = new Comparator<Building>() {
      @Override
      public int compare(Building b1, Building b2) {
        return b1.start - b2.start;
      }
    };

    public ArrayList<ArrayList<Integer>> buildingOutline(int[][] buildings) {
      // write your code here
      ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
      if (buildings == null || buildings.length == 0 || buildings[0].length == 0) {
        return ans;
      }
      Queue<Building> b = new PriorityQueue(buildings.length, buildComp);
      for (int[] building: buildings) {
        b.offer(new Building(building[0], building[1], building[2]));
      }

      while (!b.isEmpty()) {
        Building cur = b.poll();

        while (!b.isEmpty() && b.peek().start < cur.end) {
          Building next = b.poll();
          if (cur.h == next.h) {
            cur.end = Math.max(cur.end, next.end);
          } else if (cur.h < next.h) {
            if (cur.end > next.end) {
              b.offer(new Building(next.end, cur.end, cur.h));
            }
            cur.end = next.start;
            b.offer(next);
          } else {
            if (cur.end < next.end) {
              next.start = cur.end;
              b.offer(next);
            }
          }
        }

        if (cur.start != cur.end) {
          ArrayList<Integer> temp = new ArrayList<>();
          temp.add(cur.start);
          temp.add(cur.end);
          temp.add(cur.h);
          ans.add(temp);
        }
      }

      return ans;
    }
  }

  public static void main(String[] args) {
    String[] temp = {"2","*","6","-","(","23","+","7",")","/","(","1","+","2",")"};

    Set<String> dict = new HashSet<String>();

    for (int i = 0; i < temp.length; i++) {
      dict.add(temp[i]);
    }

    String[] strA = {"O"};
    char[][] board = new char[strA.length][strA[0].length()];
    int i = 0;
    for (String str: strA) {
      board[i++] = str.toCharArray();
    }

    char[][] sodoku = {{'X', 'X', 'X', 'X'},
        {'X', 'O', 'O', 'X'},
        {'X', 'X', 'O', 'X'},
        {'X', 'O', 'X', 'X'}};
    int[] A = {1, 2, 7, 7, 2, 10, 3, 4, 5};
    int[][] matrix1 = {{12,13,0,12},{13,4,13,12},{13,8,10,12},{12,13,12,12},{13,13,13,13}};

//    TreeNode root = new TreeNode(1);
//    root.left = new TreeNode(2);
//    root.right = new TreeNode(5);
//    root.left.left = new TreeNode(3);
//    root.left.right = new TreeNode(4);
//    root.right.right = new TreeNode(6);
//    TreeLinkNode tln = new TreeLinkNode(1);
//    tln.left = new TreeLinkNode(2);
//    tln.right = new TreeLinkNode(3);
//    tln.left.left = new TreeLinkNode(4);
//    tln.left.right = new TreeLinkNode(5);
//    tln.right.right = new TreeLinkNode(7);


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

    ListNode head = new ListNode(4);
    head.next = new ListNode(3);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(5);
    head.next.next.next.next = new ListNode(2);
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
//    System.out.println(new temp().medianSlidingWindow(A, 2));

    List<Integer> a1 = new ArrayList<>(B);
    List<Integer> a2 = new ArrayList<>(B);
    System.out.println();
  }
}

