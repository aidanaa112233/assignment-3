import java.util.Arrays;

public class Experiment {

    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(arr);
        } else {
            sorter.advancedSort(arr);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {

        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = randomArray.clone();

            Arrays.sort(sortedArray);

            System.out.println("Array Size: " + size);

            long bubbleTime = measureSortTime(randomArray.clone(), "basic");
            long quickTime = measureSortTime(randomArray.clone(), "advanced");

            long searchTime = measureSearchTime(sortedArray, sortedArray[size / 2]);

            System.out.println("Bubble Sort Time: " + bubbleTime + " ns");
            System.out.println("Quick Sort Time: " + quickTime + " ns");
            System.out.println("Binary Search Time: " + searchTime + " ns");

            System.out.println(" ");
        }
    }
}