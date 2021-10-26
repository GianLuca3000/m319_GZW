public class m319 {

    public static void main(String[] args)
    {   // Custom string input
        String str = "DieserStringwirdsortiert";
        // Convertingstring into an array for computation
        char arr[] = str.toCharArray(); // Convert to static array
        char temp;
        int i = 0;                      // Sort starts at the beginning
        while (i < arr.length) {        // outer loop i
            int j = i + 1;              // j is next character in row
            innereSchleife(arr, i, j);
            i += 1;                     // get next character to sort
        }
        // output sorted Array
        System.out.println(arr);
    }

    private static void innereSchleife(char[] arr, int i, int j) {
        char temp;
        while (j < arr.length) {    // inner loop j till the end
            if(arr[j] < arr[i]) {   //Comparing the characters one by one
                temp = arr[i];      // Swap characters if second is "smaller"
                arr[i] = arr[j];    // this takes "smaller" char to front
                arr[j] = temp;

            }
            j += 1;                 // get next character to compare
        }
    }
}
