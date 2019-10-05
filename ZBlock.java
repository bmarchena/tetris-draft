public class ZBlock extends Block {
    final static int[][] bloks = {
            {25, -25, -25, 25}, {25, -25, -25, 25}, {75, 25, 25, 75}, {75, 25, 25, 75}, //xbloks
            {-25, -25, 25, 25}, {25, 25, 75, 75}, {25, 25, 75, 75}, {75, 75, 125, 125}  //ybloks
    };

    public ZBlock(double x, double y, int angle) { super(x, y, angle, bloks); }


}
