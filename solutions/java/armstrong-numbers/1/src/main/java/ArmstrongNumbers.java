class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberStr = String.valueOf(numberToCheck);
        int numberOfDigits = numberStr.length();
        int sum = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            sum += Math.pow(digit, numberOfDigits);
        }

        return sum == numberToCheck;
    }

}
