package sortingalgo;

public class countsort {
    public static void countsorts(int arr[]) {
        int n = 6;

        int count[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            // very important step as by default 0 hoga
            // count array me jo insex jitni bar repreat horhi usi index ki value me ut
            // net repetition add ho jaega

        }
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;// very important
            }
        }

    }

    public static void represent(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5 };
        countsorts(arr);
        represent(arr);

    }

}
