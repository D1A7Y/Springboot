package com.example.demo;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


class ListNode {
    int val;
    ListNode next = null;
    ListNode(){}
    ListNode(int val) {
        this.val = val;
    }
}

public class MathTest {
    static int length = 0;

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        List list = printListFromTailToHead2(listNode);
        System.out.println(list);
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = length(listNode);
        for (int i = a; i > 0; i--) {
            list.add(getListNode(listNode,i).val);
        }
        return list;
    }

    public static ListNode getListNode(ListNode listNode,int key) {
        key--;
        while (key > 0) {
            return getListNode(listNode.next,--key);
        }
        return listNode;
    }

    public static int length(ListNode listNode) {
        if (listNode != null) {
            length++;
        }
        if (listNode.next == null) {
            return length;
        }
        return length(listNode.next);
    }
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        if (listNode ==null){
            return null;
        }
        while (true){
            if (listNode==null){
                break;
            }
            list.add(listNode.val);
            listNode = listNode.next;
        }
        for (int i = list.size()-1;i>=0;i--){
            list2.add(list.get(i));
        }
        return list2;
    }
//
//    public boolean Find(int target, int[][] array) {
//        for (int a = 0; a < array.length; a++) {
//            for (int b = 0; b < array[a].length; b++) {
//                if (target == array[a][b]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//
//    public void sort() {
//        String arr = "aaasdddfggghhre1234234";
//        HashMap<Character, Integer> charIntegerHashMap = new HashMap<>();
//        char[] chars = arr.toCharArray();
//        for (char c : chars) {
//            if (!charIntegerHashMap.containsKey(c)) {
//                charIntegerHashMap.put(c, 1);
//            } else {
//                int a = charIntegerHashMap.get(c);
//                a++;
//                charIntegerHashMap.put(c, a);
//            }
//        }
//        System.out.println(charIntegerHashMap);
//    }
}
