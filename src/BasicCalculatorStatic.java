class BasicCalculatorStatic {
    public static void main(String[] args) {
        double number1 = 10.5; // Example value
        double number2 = 2.5;  // Example value

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division of "
                + number1 + " and " + number2 + " are "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}