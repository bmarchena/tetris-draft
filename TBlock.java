public class TBlock extends Block {
    final static int[][] bloks = {
            {25, -25, -25, 25}, {75, 25, 25, 75}, {125, 75, 75, 125}, {75, 25, 25, 75}, //xbloks
            {-25, -25, 25, 25}, {-25, -25, 25, 25}, {-25, -25, 25, 25}, {25, 25, 75, 75}  //ybloks
    };

    public TBlock(double x, double y, int angle) {
        super(x, y, angle, bloks);
    }
}
