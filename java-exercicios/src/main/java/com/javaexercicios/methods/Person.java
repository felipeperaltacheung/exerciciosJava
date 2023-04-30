package com.javaexercicios.methods;

public class Person {

    private String middleName = "Christopher";

    public static int[] nums = initNums();

    static {
        nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 3;
    }

    public static int [] initNums() {
        int [] nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 3;
        return nums;
    }

    public char getMiddleInitial(){
        return middleName.charAt(0);
    }

    public int sumTwoNumbers(int n1, int n2){
        return n1 + n2;
    }

    public void test(String[] args) {
        //do sometring clever with words
    }

    public void test2(int num1, int num2, String ... words){
        System.out.println(words.length);
    }

    public static void main(String[] args) {
        Person p = new Person();

        char middleInitial = p.getMiddleInitial();
        System.out.println(middleInitial);
        System.out.println();

        System.out.println(p.sumTwoNumbers(20, 20));

        System.out.println();
        String[]words = new String[] {"one", "two", "three"};
       // p.test(3, 5, words);
        p.test2(3,5,"one", "two", "three");

        System.out.println(nums);
    }

}
