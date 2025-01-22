class MaximumHandshakesStatic {
    public static void main(String[] args) {
        int numberOfStudents = 5; // Example number of students
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
    }
}