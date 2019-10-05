public class LineBlock extends Block {

    final static int[][] bloks = {
            {25, -25, -25, 25}, {75, 25, 25, 75}, {125, 75, 75, 125}, {175, 125, 125, 175}, //xbloks
            {-25, -25, 25, 25}, {-25, -25, 25, 25}, {-25, -25, 25, 25}, {-25, -25, 25, 25}  //ybloks
    };

    public LineBlock(int x, int y, int angle) {
        super(x, y, angle, bloks);
    }
}
