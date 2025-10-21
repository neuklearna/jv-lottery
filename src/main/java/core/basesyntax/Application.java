package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println("The drawn ball is: " + lottery.getRandomBall());
        System.out.println("The drawn ball is: " + lottery.getRandomBall());
        System.out.println("The drawn ball is: " + lottery.getRandomBall());
    }
}
