public class Neighbours {

    public static void main(String[] args) {
        int[] array = {4, 8, 6, 1, 2, 9, 4};

        System.out.println(findMinimumDistance(array));
    }

    private static int findMinimumDistance(int[] numbers) {
        int minDistance = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentDistance = Math.abs(numbers[i] - numbers[i + 1]);

            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                result = i;
            }
        }
        return result;
    }
}
