public class Main {
    public static void main(String[] args) {

        // [] -> Array
        int[] numbers = {5, 10, 4};

        int sum = numbers[1] + numbers[0];
        System.out.println(sum);
        numbers[2] = 5;

        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 4;
        nums[3] = 20;

    }

    public static void printNumbers(int[] currywurst) {
        System.out.println(currywurst[0]);
        System.out.println(currywurst[1]);
        System.out.println(currywurst[2]);
        System.out.println(currywurst[3]);
    }
}