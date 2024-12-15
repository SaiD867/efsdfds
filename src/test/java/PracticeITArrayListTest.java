package src.test.java;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PracticeITArrayListTest {

    @Test
    public void testSwapPairs1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("four");
        list1.add("score");
        list1.add("and");
        list1.add("seven");
        list1.add("years");
        list1.add("ago");

        PracticeITArrayList.swapPairs(list1);
        assertArrayEquals(new String[]{"score", "four", "seven", "and", "ago", "years"}, list1.toArray());
    }

    @Test
    public void testSwapPairs2() {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("to");
        list2.add("be");
        list2.add("or");
        list2.add("not");
        list2.add("to");
        list2.add("be");
        list2.add("hamlet");

        PracticeITArrayList.swapPairs(list2);
        assertArrayEquals(new String[]{"be", "to", "not", "or", "be", "to", "hamlet"}, list2.toArray());
    }

    @Test
    public void testSwapPairs3() {
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("I");
        list3.add("love");
        list3.add("programming!");

        PracticeITArrayList.swapPairs(list3);
        assertArrayEquals(new String[]{"love", "I", "programming!"}, list3.toArray());
    }

    @Test
    public void testSwapPairs4() {
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Pretty");
        list4.add("straight");
        list4.add("forward");
        list4.add("test");
        list4.add("with");
        list4.add("a");
        list4.add("twist");

        PracticeITArrayList.swapPairs(list4);
        assertArrayEquals(new String[]{"straight", "Pretty", "test", "forward", "a", "with", "twist"}, list4.toArray());
    }

    @Test
    public void testSwapPairs5() {
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("don't move me");

        PracticeITArrayList.swapPairs(list5);
        assertArrayEquals(new String[]{"don't move me"}, list5.toArray());
    }

    @Test
    public void testSwapPairs6() {
        ArrayList<String> list6 = new ArrayList<>();

        PracticeITArrayList.swapPairs(list6);
        assertArrayEquals(new String[]{}, list6.toArray());
    }

    @Test
    public void testRemoveEvenLength1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("This");
        list1.add("is");
        list1.add("a");
        list1.add("test");

        PracticeITArrayList.removeEvenLength(list1);
        assertArrayEquals(new String[]{"a"}, list1.toArray());
    }

    @Test
    public void testRemoveEvenLength2() {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("even");
        list2.add("odd");
        list2.add("ev");
        list2.add("o");

        PracticeITArrayList.removeEvenLength(list2);
        assertArrayEquals(new String[]{"odd", "o"}, list2.toArray());
    }

    @Test
    public void testRemoveEvenLength3() {
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Did");
        list3.add("you");
        list3.add("solve");
        list3.add("it");
        list3.add("or");
        list3.add("what?");

        PracticeITArrayList.removeEvenLength(list3);
        assertArrayEquals(new String[]{"Did", "you", "solve", "what?"}, list3.toArray());
    }

    @Test
    public void testRemoveEvenLength4() {
        ArrayList<String> list4 = new ArrayList<>();

        PracticeITArrayList.removeEvenLength(list4);
        assertArrayEquals(new String[]{}, list4.toArray());
    }

    @Test
    public void testDoubleList1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("how");
        list1.add("are");
        list1.add("you?");

        PracticeITArrayList.doubleList(list1);
        assertArrayEquals(new String[]{"how", "how", "are", "are", "you?", "you?"}, list1.toArray());
    }

    @Test
    public void testDoubleList2() {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("I");
        list2.add("am");
        list2.add("great,");
        list2.add("thanks!");

        PracticeITArrayList.doubleList(list2);
        assertArrayEquals(new String[]{"I", "I", "am", "am", "great,", "great,", "thanks!", "thanks!"}, list2.toArray());
    }

    @Test
    public void testDoubleList3() {
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("One string only");

        PracticeITArrayList.doubleList(list3);
        assertArrayEquals(new String[]{"One string only", "One string only"}, list3.toArray());
    }

    @Test
    public void testDoubleList4() {
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("1");
        list4.add("4");
        list4.add("3");

        PracticeITArrayList.doubleList(list4);
        assertArrayEquals(new String[]{"1", "1", "4", "4", "3", "3"}, list4.toArray());
    }

    @Test
    public void testDoubleList5() {
        ArrayList<String> list5 = new ArrayList<>();

        PracticeITArrayList.doubleList(list5);
        assertArrayEquals(new String[]{}, list5.toArray());
    }

    @Test
    public void testMinToFront1() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(8);
        list1.add(92);
        list1.add(4);
        list1.add(2);
        list1.add(17);
        list1.add(9);

        PracticeITArrayList.minToFront(list1);
        assertArrayEquals(new Integer[]{2, 3, 8, 92, 4, 17, 9}, list1.toArray(new Integer[0]));
    }

    @Test
    public void testMinToFront2() {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);

        PracticeITArrayList.minToFront(list2);
        assertArrayEquals(new Integer[]{1}, list2.toArray(new Integer[0]));
    }

    @Test
    public void testMinToFront3() {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(1);
        list3.add(4);
        list3.add(-2);

        PracticeITArrayList.minToFront(list3);
        assertArrayEquals(new Integer[]{-2, 6, 1, 4}, list3.toArray(new Integer[0]));
    }

    @Test
    public void testMinToFront4() {
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(0);
        list4.add(1);
        list4.add(2);
        list4.add(3);

        PracticeITArrayList.minToFront(list4);
        assertArrayEquals(new Integer[]{0, 1, 2, 3}, list4.toArray(new Integer[0]));
    }

    @Test
    public void testMinToFront5() {
        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(3);
        list5.add(2);
        list5.add(1);
        list5.add(0);

        PracticeITArrayList.minToFront(list5);
        assertArrayEquals(new Integer[]{0, 3, 2, 1}, list5.toArray(new Integer[0]));
    }

    @Test
    public void testRemoveDuplicates1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("be");
        list1.add("be");
        list1.add("is");
        list1.add("not");
        list1.add("or");
        list1.add("question");
        list1.add("that");
        list1.add("the");
        list1.add("to");
        list1.add("to");

        PracticeITArrayList.removeDuplicates(list1);
        assertArrayEquals(new String[]{"be", "is", "not", "or", "question", "that", "the", "to"}, list1.toArray());
    }

    @Test
    public void testRemoveDuplicates2() {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("duplicate");
        list2.add("duplicate");
        list2.add("duplicate");
        list2.add("duplicate");
        list2.add("duplicate");

        PracticeITArrayList.removeDuplicates(list2);
        assertArrayEquals(new String[]{"duplicate"}, list2.toArray());
    }

    @Test
    public void testRemoveDuplicates3() {
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("unique");

        PracticeITArrayList.removeDuplicates(list3);
        assertArrayEquals(new String[]{"unique"}, list3.toArray());
    }

    @Test
    public void testRemoveDuplicates4() {
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("be");
        list4.add("is");
        list4.add("not");
        list4.add("or");
        list4.add("question");
        list4.add("that");
        list4.add("the");
        list4.add("to");

        PracticeITArrayList.removeDuplicates(list4);
        assertArrayEquals(new String[]{"be", "is", "not", "or", "question", "that", "the", "to"}, list4.toArray());
    }

    @Test
    public void testRemoveDuplicates5() {
        ArrayList<String> list5 = new ArrayList<>();

        PracticeITArrayList.removeDuplicates(list5);
        assertArrayEquals(new String[]{}, list5.toArray());
    }

    @Test
    public void testRemoveInRange1() {
        ArrayList<Integer> list1 = new ArrayList<>();
        int[] temp = {0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16};
        for(int i : temp){
            list1.add(i);
        }

        PracticeITArrayList.removeInRange(list1, 0, 5, 13);

        assertArrayEquals(new Integer[]{0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16}, list1.toArray(new Integer[0]));
    }

    @Test
    public void testRemoveInRange2() {
        ArrayList<Integer> list2 = new ArrayList<>();
        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10};
        for(int i : temp){
            list2.add(i);
        }

        PracticeITArrayList.removeInRange(list2, 9, 8, 10);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, list2.toArray(new Integer[0]));
    }

    @Test
    public void testRemoveInRange3() {
        ArrayList<Integer> list3 = new ArrayList<>();
        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10};
        for(int i : temp){
            list3.add(i);
        }

        PracticeITArrayList.removeInRange(list3, 9, 8, 11);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 10}, list3.toArray(new Integer[0]));
    }

    @Test
    public void testRemoveInRange4() {
        ArrayList<Integer> list4 = new ArrayList<>();
        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10};
        for(int i : temp){
            list4.add(i);
        }

        PracticeITArrayList.removeInRange(list4, 9, 9, 11);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, list4.toArray(new Integer[0]));
    }

    @Test
    public void testRemoveInRange5() {
        ArrayList<Integer> list5 = new ArrayList<>();
        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10};
        for(int i : temp){
            list5.add(i);
        }

        PracticeITArrayList.removeInRange(list5, 9, 5, 3);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10}, list5.toArray(new Integer[0]));
    }

    @Test
    public void testStutter1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hi");
        list1.add("there");

		PracticeITArrayList.stutter(list1, 2);
		
        assertArrayEquals(new String[]{"hi", "hi", "there", "there"},
							list1.toArray(new String[0]));
    }

    @Test
    public void testStutter2() {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("World");

		PracticeITArrayList.stutter(list2, 5);
        
		assertArrayEquals(new String[]{"Hello", "Hello", "Hello", "Hello", "Hello", "World", "World", "World", "World", "World"}, 
            list2.toArray(new String[0]));
    }

    @Test
    public void testStutter3() {
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("just");
        list3.add("one");

		PracticeITArrayList.stutter(list3, 2);

        assertArrayEquals(new String[]{"just", "just", "one", "one"}, 
            list3.toArray(new String[0]));
    }

    @Test
    public void testStutter4() {
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("a");

		PracticeITArrayList.stutter(list4, 4);

        assertArrayEquals(new String[]{"a", "a", "a", "a"}, 
            list4.toArray(new String[0]));
    }
    
        @Test
    public void testStutter5() {
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("b");

		PracticeITArrayList.stutter(list5, 0);

        assertArrayEquals(new String[]{}, 
            list5.toArray(new String[0]));
    }
    
        @Test
    public void testStutter6() {
        ArrayList<String> list6 = new ArrayList<>();
        list6.add("c");

		PracticeITArrayList.stutter(list6, -5);

        assertArrayEquals(new String[]{}, 
            list6.toArray(new String[0]));
    }

    @Test
    public void testStutter7() {
        ArrayList<String> list7 = new ArrayList<>();

		PracticeITArrayList.stutter(list7, 42);

        assertArrayEquals(new String[]{}, 
            list7.toArray(new String[0]));
    }

    @Test
    public void testRemoveShorterStrings1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("four");
        list1.add("score");
        list1.add("and");
        list1.add("seven");
        list1.add("years");
        list1.add("ago");

        PracticeITArrayList.removeShorterStrings(list1);

        assertArrayEquals(new String[]{"score", "seven", "years"}, list1.toArray());
    }

    @Test
    public void testRemoveShorterStrings2() {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Lots");
        list2.add("of  ");
        list2.add("ties");
        list2.add("in  ");
        list2.add("this");
        list2.add("test");

        PracticeITArrayList.removeShorterStrings(list2);

        assertArrayEquals(new String[]{"of  ", "in  ", "test"}, list2.toArray());
    }

    @Test
    public void testRemoveShorterStrings3() {
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Don't");
        list3.add("remove");
        list3.add("the");
        list3.add("last");
        list3.add("string (me)");

        PracticeITArrayList.removeShorterStrings(list3);

        assertArrayEquals(new String[]{"remove", "last", "string (me)"}, list3.toArray());
    }

    @Test
    public void testRemoveShorterStrings4() {
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Don't remove me");

        PracticeITArrayList.removeShorterStrings(list4);

        assertArrayEquals(new String[]{"Don't remove me"}, list4.toArray());
    }

    @Test
    public void testRemoveShorterStrings5() {
        ArrayList<String> list5 = new ArrayList<>();

        PracticeITArrayList.removeShorterStrings(list5);

        assertArrayEquals(new String[]{}, list5.toArray());
    }

    @Test
    public void testInterleave1() {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(4);
        a2.add(5);
        a2.add(6);
        a2.add(7);
        a2.add(8);

        PracticeITArrayList.interleave(a1, a2);

        assertArrayEquals(new Integer[]{10, 4, 20, 5, 30, 6, 7, 8}, a1.toArray());
        assertArrayEquals(new Integer[]{4, 5, 6, 7, 8}, a2.toArray());
    }

    @Test
    public void testInterleave2() {
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(10);
        a3.add(20);
        a3.add(30);
        a3.add(40);
        a3.add(50);
        ArrayList<Integer> a4 = new ArrayList<>();
        a4.add(6);
        a4.add(7);
        a4.add(8);

        PracticeITArrayList.interleave(a3, a4);

        assertArrayEquals(new Integer[]{10, 6, 20, 7, 30, 8, 40, 50}, a3.toArray());
        assertArrayEquals(new Integer[]{6, 7, 8}, a4.toArray());
    }

    @Test
    public void testInterleave3() {
        ArrayList<Integer> a5 = new ArrayList<>();
        a5.add(55);
        a5.add(44);
        a5.add(33);
        ArrayList<Integer> a6 = new ArrayList<>();
        a6.add(8);

        PracticeITArrayList.interleave(a5, a6);

        assertArrayEquals(new Integer[]{55, 8, 44, 33}, a5.toArray());
        assertArrayEquals(new Integer[]{8}, a6.toArray());
    }

    @Test
    public void testInterleave4() {
        ArrayList<Integer> a7 = new ArrayList<>();
        a7.add(65);
        a7.add(87);
        a7.add(-147);
        ArrayList<Integer> a8 = new ArrayList<>();
        a8.add(4);
        a8.add(8);
        a8.add(1);
        a8.add(3);
        a8.add(9);
        a8.add(22);

        PracticeITArrayList.interleave(a7, a8);

        assertArrayEquals(new Integer[]{65, 4, 87, 8, -147, 1, 3, 9, 22}, a7.toArray());
        assertArrayEquals(new Integer[]{4, 8, 1, 3, 9, 22}, a8.toArray());
    }

    @Test
    public void testInterleave5() {
        ArrayList<Integer> a9 = new ArrayList<>();
        a9.add(10);
        ArrayList<Integer> a10 = new ArrayList<>();
        a10.add(20);

        PracticeITArrayList.interleave(a9, a10);

        assertArrayEquals(new Integer[]{10, 20}, a9.toArray());
        assertArrayEquals(new Integer[]{20}, a10.toArray());
    }

    @Test
    public void testInterleave6() {
        ArrayList<Integer> a11 = new ArrayList<>();
        a11.add(64);
        ArrayList<Integer> a12 = new ArrayList<>();

        PracticeITArrayList.interleave(a11, a12);

        assertArrayEquals(new Integer[]{64}, a11.toArray());
        assertArrayEquals(new Integer[]{}, a12.toArray());
    }

    @Test
    public void testInterleave7() {
        ArrayList<Integer> a13 = new ArrayList<>();
        ArrayList<Integer> a14 = new ArrayList<>();
        a14.add(42);

        PracticeITArrayList.interleave(a13, a14);

        assertArrayEquals(new Integer[]{42}, a13.toArray());
        assertArrayEquals(new Integer[]{42}, a14.toArray());
    }

    @Test
    public void testInterleave8() {
        ArrayList<Integer> a15 = new ArrayList<>();
        ArrayList<Integer> a16 = new ArrayList<>();

        PracticeITArrayList.interleave(a15, a16);

        assertArrayEquals(new Integer[]{}, a15.toArray());
        assertArrayEquals(new Integer[]{}, a16.toArray());
    }

}
