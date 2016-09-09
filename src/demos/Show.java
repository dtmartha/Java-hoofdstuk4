package demos;

/**
 * Created by Niurca on 8-9-2016.
 */
/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Dil", 50, 60 );
        g.setColor(Color.red);
        g.drawString("martha", 50, 70 );

        g.drawLine(180, 100,240, 60);
        g.drawLine(240, 60, 300, 100);
        g.drawLine(180, 100, 300, 100); /*gelijkbenige driehoek*/

        g.drawLine(360, 200,480, 120);
        g.drawLine(480, 120, 600, 200);
        g.drawLine(360, 200, 600, 200); /*dak*/

        g.drawRect(200, 200, 400, 160); /*muren*/
        g.drawRect(250, 250, 100, 50); /*raam*/
        g.drawRect(200, 200, 330, 160);




        g.setColor(Color.black);
        g.drawLine(120, 50, 120, 270); /*vlaggenstok*/

        g.setColor(Color.red);
        g.fillRect(120, 50, 50, 25); /*vlag*/

        g.setColor(Color.white);
        g.fillRect(120, 75, 50, 25); /*vlag*/

        g.setColor(Color.blue);
        g.fillRect(120, 100, 50, 25); /*vlag*/

        g.fillRect(600, 20, 100, 50); /*rechthoek*/

        g.setColor(Color.yellow);
        g.fillOval(600,20, 100, 50); /*ellips*/

        g.setColor(Color.black); /*stoplicht*/
        g.fillRect(800, 20, 50, 170);

        g.setColor(Color.red); /*stoplicht*/
        g.fillOval(800,20, 50, 50);

        g.setColor(Color.orange);
        g.fillOval(800,70, 50, 50); /*stoplicht*/

        g.setColor(Color.green);
        g.fillOval(800,120, 50, 50); /*stoplicht*/

        g.setColor(Color.black);
        g.fillRect(1000, 20, 110, 110); /*dobbelsteen*/

        g.setColor(Color.white); /*dobbelsteen*/
        g.fillOval(1000,20, 50, 50);
        g.fillOval(1050,20, 50, 50);
        g.fillOval(1000,70, 50, 50);
        g.fillOval(1050,70, 50, 50);










































































        ;























        ;










    }

}