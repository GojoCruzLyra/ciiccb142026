class Task8{
    public static int sumOfCumulativeSums(int... numbers){
        int totalSum = 0;

    for (int num : numbers) {
        int cumulativeSum = 0;
        for (int i = 1; i <= num; i++){
            cumulativeSum += i;
        }

        totalSum += cumulativeSum;

    }

    return totalSum;

    }

    public static void main(String[] args){
        int result = sumOfCumulativeSums(4, 5, 10);

        System.out.println("The total sum is:" + result);
    }
}