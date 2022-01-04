package array_challenge;

public class Array_Challenge {

    public static void main(String[] args) {
        int myArray[] = new int[50];

        int num = 0;
        while (num < myArray.length) {
            myArray[num] = num + 2;
            num++;
        }
        int x = 0;
        while (x < myArray.length) {
            myArray[x] += 1;
            x++;
        }

        for (int i = 0; i < myArray.length; i++) {
            if ((myArray[i] % 2 == 0) || (myArray[i] % 11 == 0)) {
                System.out.print(myArray[i] + ", ");
            }
        }
    }
}
