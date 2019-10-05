public class LBlock extends Block {
    final static int[][] bloks = {
            {25, -25, -25, 25}, {25, -25, -25, 25}, {25, -25, -25, 25}, {75, 25, 25, 75}, //xbloks
            {-25, -25, 25, 25}, {25, 25, 75, 75}, {75, 75, 125, 125}, {75, 75, 125, 125}  //ybloks
    };

    public LBlock(double x, double y, int angle) {
        super(x, y, angle, bloks);
    }
}
