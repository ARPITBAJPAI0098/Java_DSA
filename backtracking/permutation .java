/*class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<ArrayList<Integer>> hp1 = new HashSet<>();
        permutations(arr, n, 0, result, hp1);
        Collections.sort(result, (a, b) -> {
            for (int i = 0; i < n; i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        });
        return result;
    }

    private static void permutations(ArrayList<Integer> arr, int n, int index,
                                      ArrayList<ArrayList<Integer>> result, HashSet<ArrayList<Integer>> hp1) {
        if (index == n) {
            if (!hp1.contains(new ArrayList<>(arr))) {
                // Add the current permutation to the result
                result.add(new ArrayList<>(arr));
                hp1.add(new ArrayList<>(arr));
            }
            return;
        }

        for (int i = index; i < n; i++) {
            // Swap elements at index and i
            Collections.swap(arr, index, i);

            // Recursively find permutations for the next index
            permutations(arr, n, index + 1, result, hp1);

            // Backtrack - undo the swap for the next iteration
            Collections.swap(arr, index, i);// to obtain the original array
        }
    }
}
*/
/*use of comparator

Certainly! The Collections.sort() method is a utility method in Java that is used to sort collections (such as lists) in their natural order or using a specified comparator. In the provided code, Collections.sort(result, comparator) is used to sort the result list of permutations.

Here's an explanation of the relevant parts:

Collections.sort(result, comparator): This method is used to sort the result list. The comparator is used to define the custom ordering of elements.

comparator: In the provided code, a custom comparator is created using a lambda expression (a, b) -> { /* comparison logic */ }. The purpose of the comparator is to define the sorting order of two elements (a and b) in the list.

//Inside the lambda expression, there is a loop that iterates over the elements of the permutations (a and b). It compares the elements at each position in the permutation.

//If the elements are not equal, it returns the result of comparing them (Integer.compare(a.get(i), b.get(i))). This ensures that the permutations are sorted lexicographically.

//If the elements are equal at all positions, the loop continues to the next position.

//The overall result is the lexicographical comparison of the two permutations.

//By using this custom comparator, the Collections.sort() method sorts the result list of permutations lexicographically before returning it.
