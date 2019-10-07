import java.awt.*;

public class Block {
    double x;
    double y;

    double rtEdge;
    double ltEdge;
    double btEdge;

    int angle;

    int[] xblok1;
    int[] yblok1;

    int[] xblok2;
    int[] yblok2;

    int[] xblok3;
    int[] yblok3;

    int[] xblok4;
    int[] yblok4;

    public Block(double x, double y, int angle, int[][] bloks){
        this.x = x;
        this.y = y;
        this.angle = angle;

        xblok1 = bloks[0];
        xblok2 = bloks[1];
        xblok3 = bloks[2];
        xblok4 = bloks[3];

        yblok1 = bloks[4];
        yblok2 = bloks[5];
        yblok3 = bloks[6];
        yblok4 = bloks[7];

    }

    public void rotate(){angle -= 90;}

    public void moveLt(int dx){ x -= dx;}

    public void moveRt(int dx){ x += dx;}

    public void moveDn(int dy){ y += dy;}

    public void draw(Graphics g)
    {
        int[] xp = new int[4];
        int[] yp = new int[4];

        if(angle >= 360) angle -= 360;
        if(angle < 0)    angle += 360;

        double cosA = Lookup.cos[angle];
        double sinA = Lookup.sin[angle];


        for(int i = 0; i < 4; i ++)
        {
            xp[i] = (int)((xblok1[i]*cosA - yblok1[i]*sinA) + x);
            yp[i] = (int)((xblok1[i]*sinA + yblok1[i]*cosA) + y);
        }

        g.drawPolygon(xp, yp, 4);


        for(int i = 0; i < 4; i ++)
        {
            xp[i] = (int)((xblok2[i]*cosA - yblok2[i]*sinA) + x);
            yp[i] = (int)((xblok2[i]*sinA + yblok2[i]*cosA) + y);
        }

        g.drawPolygon(xp, yp, 4);


        for(int i = 0; i < 4; i ++)
        {
            xp[i] = (int)((xblok3[i]*cosA - yblok3[i]*sinA) + x);
            yp[i] = (int)((xblok3[i]*sinA + yblok3[i]*cosA) + y);
        }

        g.drawPolygon(xp, yp, 4);


        for(int i = 0; i < 4; i ++)
        {
            xp[i] = (int)((xblok4[i]*cosA - yblok4[i]*sinA) + x);
            yp[i] = (int)((xblok4[i]*sinA + yblok4[i]*cosA) + y);
        }

        g.drawPolygon(xp, yp, 4);


        g.drawLine((int)x ,(int)y ,(int)x,(int)y);

    }


}

