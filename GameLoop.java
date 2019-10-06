import java.awt.*;

public class GameLoop extends GameBase {

    SqBlock testBlock;
    int count = 0;

    @Override
    public void initialize() {

        testBlock = new SqBlock(200, 200, 0);

    }

    @Override
    public void inTheGameLoop() {

        count++;
        if(count==30){testBlock.moveDn(10); count=0;}

        if(pressed[LT]){testBlock.moveLt(50); pressed[LT] = false;}
        if(pressed[RT]){testBlock.moveRt(50); pressed[RT] = false;}
        if(pressed[DN]){testBlock.moveDn(10); pressed[DN] = false;}
        if(pressed[SP]){testBlock.rotate();       pressed[SP] = false;}

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        testBlock.draw(g);
    }
}
