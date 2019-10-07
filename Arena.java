import java.awt.*;

public class Arena {

    Rect ltSide = new Rect(0, 150, 250, 550);

    Rect rtSide = new Rect(750, 150, 250, 550);

    Rect bottom = new Rect(250,650,500,50);

    public Arena(){

    }

    public void draw(Graphics g){

        ltSide.draw(g);
        rtSide.draw(g);
        bottom.draw(g);
//        g.setColor(Color.red);
//        g.drawLine(300,150,300,650);
//        g.drawLine(350,150,350,650);
//        g.drawLine(400,150,400,650);
//        g.drawLine(450,150,450,650);
//        g.drawLine(500,150,500,650);
//        g.drawLine(550,150,550,650);
//        g.drawLine(600,150,600,650);
//        g.drawLine(650,150,650,650);
//        g.drawLine(700,150,700,650);
//        g.setColor(Color.black);

        g.drawString("¡TETRIS!",500, 50);
    }

    public boolean overlaps(Block b){

        if(b.btEdge >= 650 || b.rtEdge >= 750 || b.ltEdge <= 250) return true;
        else return false;

    }

}
