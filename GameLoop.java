import java.awt.*;

public class GameLoop extends GameBase {

    SqBlock testBlock;
    int count = 0;


    Arena arena = new Arena();

    @Override
    public void initialize() {

        testBlock = new SqBlock(475, 175, 0);

    }

    @Override
    public void inTheGameLoop() {

        count++;
        if(count==45){testBlock.moveDn(10); count=0;}

        if(released[LT]){testBlock.moveLt(50); released[LT] = false;}
        if(released[RT]){testBlock.moveRt(50); released[RT] = false;}
        if(released[DN]){testBlock.moveDn(10); released[DN] = false;}
        if(released[SP]){testBlock.rotate();       released[SP] = false;}


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        testBlock.draw(g);
        arena.draw(g);
    }
}
