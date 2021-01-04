public class SumOfOddNumbers {

    public static void main(String[] args) {
    int result =  calculateProduct();
        System.out.println(result);
    }

    public static int calculateProduct() {
        int product = 1;
        int i = 0;
        for (i = 0; i <= 15; i++) {
            if (i % 2 != 0) {
                product = product * i;
            }
        }
        return product;

    }

}