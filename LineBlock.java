public class LineBlock extends Block {

    final static int[][] bloks = {
            {25, -25, -25, 25}, {75, 25, 25, 75}, {125, 75, 75, 125}, {175, 125, 125, 175}, //xbloks
            {-25, -25, 25, 25}, {-25, -25, 25, 25}, {-25, -25, 25, 25}, {-25, -25, 25, 25}  //ybloks
    };

    public LineBlock(int x, int y, int angle) {
        super(x, y, angle, bloks);
        this.rtEdge = x - 25;
        this.ltEdge = x + 175;
        this.btEdge = y + 25;
    }

    @Override
    public void rotate() {
        super.rotate();
        System.out.println(angle);

//        if(angle >= 360) angle -= 360;
//        if(angle < 0)    angle += 360;
//        switch (angle){
//
//
//            case 0:
//                this.rtEdge = x - 25;
//                this.ltEdge = x + 175;
//                this.btEdge = y + 25;
//                System.out.println("TEST CASE 0");
//                System.out.println(rtEdge);
//                System.out.println(ltEdge);
//                System.out.println(btEdge);
//
//
//            case 90:
//                this.ltEdge = x - 25;
//                this.rtEdge = x + 25;
//                this.btEdge = y + 25;
//                System.out.println("TEST CASE 90");
//                System.out.println(rtEdge);
//                System.out.println(ltEdge);
//                System.out.println(btEdge);
//
//            case 180:
//                this.ltEdge = x - 175;
//                this.rtEdge = x + 25;
//                this.btEdge = y + 25;
//                System.out.println("TEST CASE 180");
//                System.out.println(rtEdge);
//                System.out.println(ltEdge);
//                System.out.println(btEdge);
//
//            case 270:
//                this.ltEdge = x - 25;
//                this.rtEdge = x + 25;
//                this.btEdge = y + 175;
//                System.out.println("TEST CASE 270");
//                System.out.println(rtEdge);
//                System.out.println(ltEdge);
//                System.out.println(btEdge);
//        }
    }
}
