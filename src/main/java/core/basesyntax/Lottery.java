package core.basesyntax;

import java.util.Random;

public class Lottery {
    Colors randomColor;
    int randomNumber;
    public Ball getRandomBall (){
        ColorSupplier colorSupplier = new ColorSupplier();
        randomColor = colorSupplier.getRandomColor();
        Random rand = new Random();
        randomNumber = rand.nextInt(101);
        Ball ball = new Ball(randomColor,randomNumber);
        return ball;
    }
}
