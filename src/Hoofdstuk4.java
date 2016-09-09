import java.applet.Applet;

/**
 * Created by Niurca on 9-9-2016.
 */

//Voorbeeld 4.1

        import java.awt.*;
        import java.applet.*;

public class Hoofdstuk4 extends Applet {

    public void init() {
    }
/*tabellen*/
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(40, 20, 40, 220);
        g.drawLine(40, 220, 180, 220);

        g.drawString("V", 50,240 );
        g.drawString("J", 110,240 );
        g.drawString("H", 170,240 );

        g.drawString("100", 15, 35 );
        g.drawString("80", 25, 75 );
        g.drawString("60", 25, 115 );
        g.drawString("40", 25, 155 );
        g.drawString("20", 25, 195 );

        g.fillRect(50,145,50,75);

        g.setColor(Color.red);
        g.fillRect(100,35,50,220 - 35);

        g.setColor(Color.orange);
        g.fillRect(150,50,50,170); /*tabellen*/

        /*praktijkopdracht*/
        g.setColor(Color.black);
        g.drawLine(400, 60, 270, 60);
        g.drawString("Lijn",330, 70 ); /*lijn*/

        g.drawRect(500, 20, 100, 50);
        g.drawString("Rechthoek",520, 80 ); /*rechthoek*/

        g.setColor(Color.magenta);
        g.fillRect(650, 20, 100, 50); /*rechthoek*/
        g.setColor(Color.black);
        g.drawOval(650,20, 100, 50); /*ellips*/
        g.drawString("Gevulde rechthoek met ovaal",630, 80 ); /*rechthoek*/

        g.setColor(Color.black);
        g.drawRoundRect(850, 20, 100, 50, 10, 10);
        g.drawString("Afgeronde rechthoek",850, 80 ); /*Afgeronde rechthoek*/

        g.setColor(Color.magenta);
        g.fillOval(975,20, 100, 50);
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal",985, 80 );

        g.drawOval(1100, 20, 100, 100);
        g.drawString("Cirkel ",1135, 140 );

        g.drawOval(250,175,120,80);
        g.setColor(Color.magenta);
        g.fillArc(250, 175, 120, 80, 90, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen ",235, 275 );










































    }
}
