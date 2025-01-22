class TriangleAreaStatic {
    public static void main(String[] args) {
        double base = 15.0;   // Example value in cm
        double height = 10.0; // Example value in cm
        double areaCm2 = 0.5 * base * height;
        double areaInches2 = areaCm2 / 6.4516;
        System.out.println("The area of the triangle is " + areaCm2 + " square cm and " + areaInches2 + " square inches.");
    }
}