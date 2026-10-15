void main() {
    int[] number = {10, 20, 30, 50, 60};

    int largestNumber = 0;
    int digit = 0;

    for (int i = 0; i < number.length; i++) {
        digit = number[i];

        if (digit > largestNumber) {
            largestNumber = digit;
        }
    }

    System.out.println("The largest number in the array is: " + largestNumber);
}