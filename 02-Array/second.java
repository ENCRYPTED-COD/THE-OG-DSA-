void main() {
    int[] number = {5, 12, 9, 25, 18};

    int largestNumber = number[0];

    for (int i = 0; i < number.length; i++) {
        if (number[i] > largestNumber) {
            largestNumber = number[i];
        }
    }

    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < number.length; i++) {
        if (number[i] < largestNumber) {
            if (number[i] > secondLargest) {
                secondLargest = number[i];
            }
        }
    }

    System.out.println("Largest: " + largestNumber);
    System.out.println("Second largest: " + secondLargest);
}
