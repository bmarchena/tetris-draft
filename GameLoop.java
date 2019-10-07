import java.awt.*;

public class GameLoop extends GameBase {

    LineBlock testBlock;
    int count = 0;


    Arena arena = new Arena();

    @Override
    public void initialize() {

        testBlock = new LineBlock(475, 175, 0);

    }

    @Override
    public void inTheGameLoop() {

        count++;
        if(count==60){testBlock.moveDn(50); count=0;}

        if(released[LT]){testBlock.moveLt(50); released[LT] = false;}
        if(released[RT]){testBlock.moveRt(50); released[RT] = false;}
        if(released[DN]){testBlock.moveDn(10); released[DN] = false;}
        if(released[SP]){testBlock.rotate();       released[SP] = false;}


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        arena.draw(g);
        testBlock.draw(g);
    }
}
