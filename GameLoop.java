import java.awt.*;

public class GameLoop extends GameBase {

    SqBlock testBlock;

    @Override
    public void initialize() {

        testBlock = new SqBlock(200, 200, 0);

    }

    @Override
    public void inTheGameLoop() {

        testBlock.moveDn(10);

        if(pressed[LT]){testBlock.moveLt(50);}
        if(pressed[RT]){testBlock.moveRt(50);}
        if(pressed[DN]){testBlock.moveDn(10);}
        if(pressed[SP]){testBlock.rotate();}

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        testBlock.draw(g);
    }
}
