public class SqBlock extends Block {
    final static private int[][] bloks = {
            {25, -25, -25, 25}, {75, 25, 25, 75}, {25, -25, -25, 25}, {75, 25, 25, 75}, //xbloks
            {-25, -25, 25, 25}, {-25, -25, 25, 25}, {25, 25, 75, 75}, {25, 25, 75, 75}  //ybloks
    };

    public SqBlock(double x, double y, int angle) { super(x, y, angle, bloks); }


}
