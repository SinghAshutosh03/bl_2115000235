class DistanceConversionStatic {
    public static void main(String[] args) {
        double distanceInFeet = 5280.0; // Example distance
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}