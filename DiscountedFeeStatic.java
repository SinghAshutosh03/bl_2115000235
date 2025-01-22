class DiscountedFeeStatic {
    public static void main(String[] args) {
        double fee = 125000; // Given in the question
        double discountPercent = 10; // Given in the question
        double discount = fee * (discountPercent / 100.0);
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}