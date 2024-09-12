package com.mycompany.main;


import java.awt.*;
import javax.swing.*;
// Create a constructor method
public class Main extends JPanel{
public Main(){
super();
}
/* Create a paintComponent() method to override the one in
JPanel.This is where the drawing happens. We don't have
to call it in our program, it gets called automatically
whenever the panel needs to be redrawn, like when it is
made visible or moved or whatever.
*/
public void paintComponent(Graphics g){
g.drawLine(200,200,200,50); // Draw a line from (x,y) to (x2,y2)
g.drawLine(110, 130, 290, 130);
//creating quadrants 

g.drawLine(200, 50, 210, 130);
g.drawLine(200, 60, 220, 130);
g.drawLine(200, 70, 230, 130);
g.drawLine(200, 80, 240, 130);
g.drawLine(200, 90, 250, 130);
g.drawLine(200, 100, 260, 130);
g.drawLine(200, 110, 270, 130);
g.drawLine(200, 120, 280, 130);
g.drawLine(200, 130, 290, 130);
//q1

g.drawLine(200, 200, 210, 130);
g.drawLine(200, 190, 220, 130);
g.drawLine(200, 180, 230, 130);
g.drawLine(200, 170, 240, 130);
g.drawLine(200, 160, 250, 130);
g.drawLine(200, 150, 260, 130);
g.drawLine(200, 140, 270, 130);
g.drawLine(200, 130, 280, 130);
//q2

g.drawLine(200, 50, 190, 130);
g.drawLine(200, 60, 180, 130);
g.drawLine(200, 70, 170, 130);
g.drawLine(200, 80, 160, 130);
g.drawLine(200, 90, 150, 130);
g.drawLine(200, 100, 140, 130);
g.drawLine(200, 110, 130, 130);
g.drawLine(200, 120, 120, 130);
g.drawLine(200, 130, 110, 130);
//q4

g.drawLine(200, 200, 190, 130);
g.drawLine(200, 190, 180, 130);
g.drawLine(200, 180, 170, 130);
g.drawLine(200, 170, 160, 130);
g.drawLine(200, 160, 150, 130);
g.drawLine(200, 150, 140, 130);
g.drawLine(200, 140, 130, 130);
g.drawLine(200, 130, 120, 130);
g.drawLine(200, 120, 110, 130);
//q3

//other graphis that I can do

//g.drawRect(50, 50, 40, 40);
//g.drawRect(60, 80, 225, 30);
//g.drawOval(75, 65, 20, 20);
//g.drawLine(35, 60, 100, 120);
//g.drawString("Out of all the clutter, find simplicity", 110, 70);
//g.drawString("-- Albert Einstein", 130, 100);
}


public static void main(String arg[]){
JFrame frame = new JFrame("BasicJPanel");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,300);
// Create a new identifier for a BasicJPanel called "panel",
// then create a new BasicJPanel object for it to refer to.
Main panel = new Main();
// Make the panel object the content pane of the JFrame.
// This puts it into the drawable area of frame, and now
// we do all our drawing to panel, using paintComponent(), above.
frame.setContentPane(panel);
frame.setVisible(true);
}
}