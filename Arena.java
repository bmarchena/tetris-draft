import java.awt.*;

public class Arena {

    Rect ltSide = new Rect(0, 150, 250, 550);

    Rect rtSide = new Rect(750, 150, 250, 550);

    Rect bottom = new Rect(250,600,500,100);

    public Arena(){

    }

    public void draw(Graphics g){
        ltSide.draw(g);
        rtSide.draw(g);
        bottom.draw(g);
        g.drawString("¡TETRIS!",500, 50);
    }

//    public boolean overlaps(Block b){
//
//    }

}
