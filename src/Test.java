import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.sameNumbersAI();
    }

    public void sameNumbersAI() {
        System.out.println("Same Number Checker by Aryan Inamdar");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num1 = random.nextInt(9 - 4) + 4;
            int num2 = random.nextInt(9 - 4) + 4;
            int num3 = random.nextInt(9 - 4) + 4;
            if (num1 == num2 && num2 == num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3 +
                        " three are the same");
            }
            else if ((num1 == num3 && num2 != num1) || (num1 == num2 && num2 != num3) || (num2 == num3 && num2 != num1)) {
                System.out.println(num1 + ", " + num2 + ", " + num3 +
                        " two are the same");
            }
            else {
                System.out.println(num1 + ", " + num2 + ", " + num3 +
                        " none are the same");
            }
        }
    }
}
