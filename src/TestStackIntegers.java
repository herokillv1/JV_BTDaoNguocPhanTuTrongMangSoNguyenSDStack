public class TestStackIntegers {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer[] integers = new Integer[5];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        integers[3] = 4;
        integers[4] = 5;
        System.out.println("Integer array is: ");
        for (Integer value : integers) {
            System.out.print(value + "\t");
        }
        System.out.println();

        for (Integer integer : integers){
            stack.push(integer);
        }

        for (int i = 0; i < integers.length; i++){
            integers[i] = stack.pop();
        }

        System.out.println("Integer array after reverse is: ");
        for (Integer integer : integers) {
            System.out.print(integer + "\t");
        }
    }
}
