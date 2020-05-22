/**
 * This program tracks and displays the location of the mouse
 */

package com.company;

import acm.graphics.*;
import acm.program.*;
//import acm.util.*;

//import java.applet.*;
//import java.awt.*;
import java.awt.event.*;


public class Main extends GraphicsProgram {

    public static void main(String[] args) {


        (new com.company.Main()).start();
    }

    public void run() {
        label = new GLabel("");
        label.setFont("Trebuchet MS-24");
        add(label, 75, 75);
        addMouseListeners(); // this is a method that is called to listen for Mouse events (already built in Java)

    }

    public void mouseMoved(MouseEvent e) {
        label.setLabel("Mouse Location is (" + e.getX() + " , " + e.getY()+" )");

    }


    /*
    Instance variable declaration below here
     */

    private GLabel label;

}
