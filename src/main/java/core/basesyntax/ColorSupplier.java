package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Random rand = new Random();
        Colors [] colors = Colors.values();
        int index = rand.nextInt(colors.length);
        return colors[index];
    }
}
