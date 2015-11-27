package bbb;

import Entrega3.DATA;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taniagarridosalido
 */



  
  public class Game extends JFrame implements GLEventListener {
      private static final long serialVersionUID = 1L;
  
      final private int width = 800;
     final private int height = 600;
        private int texture;
        private float x = 0;
        private float y = 0;
        private float gapX = -1;
        private float gapY = -1;
        private GLCanvas canvas;
        private ArrayList<Position> pos;
        private boolean penStatus = true;
        private Color col = new Color(255,255,255);
 
     private class Position{
         public float x,y;
         Color col = new Color(255,255,255);
         
         public Position(float x,float y, Color col){
             this.x = x;
             this.y = y;
             this.col = col;
         }
     }
     
     private class Color{
         int R = 255,G = 255,B = 255;
         
         public Color(int R, int G, int B){
             this.R = R;
             this.G = G;
             this.B = B;
         }
         
         public Color(Color a){
             this.R = a.R;
             this.G = a.G;
             this.B = a.B;
         }
     }
     
     public Game() {
         super("Minimal OpenGL");
         GLProfile profile = GLProfile.get(GLProfile.GL2);
         GLCapabilities capabilities = new GLCapabilities(profile);
 
         pos = new ArrayList<>();
         canvas = new GLCanvas(capabilities);
         canvas.addGLEventListener(this);
 
         this.setName("Minimal OpenGL");
         this.getContentPane().add(canvas);
 
         this.setSize(width, height);
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);
         this.setResizable(false);
         
         FPSAnimator anim = new FPSAnimator(canvas,60);
         //anim.add(canvas);
         anim.start();
         
         canvas.requestFocusInWindow();
     }

      public void play() {
      }
      
      @Override
      public void display(GLAutoDrawable drawable) {
        render(drawable);
    }
    
    public void changeColor(int type, float color){
        if ( type == DATA.RED)
            col.R = (int)color;
        else if (type == DATA.GRN)
            col.G = (int)color;
        else if (type == DATA.BLU)
            col.B = (int)color;
    }
    public void pinDown(){
        penStatus = false;
    }
    
    public void pinUp(){
        penStatus = true;
    }
      
    public void move(float x, float y){
        if (penStatus){
            pos.add(new Position(this.x,this.y,new Color(col)));
            pos.add(new Position(x/10.0f,y/10.0f,new Color(col)));
        }
        this.x = x/10.0f;
        this.y = y/10.0f;
    }
      
    private void render(GLAutoDrawable drawable){
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        gl.glLineWidth((float) 6.0);
        gl.glBegin(GL2.GL_LINES);
        // Drawing Using Triangles 
        for (int i = 0; i < pos.size()/2; i++){
            gl.glColor3f(pos.get(i*2).col.R/255.0f,pos.get(i*2).col.G/255.0f,pos.get(i*2).col.B/255.0f);
            gl.glVertex3f(gapX + pos.get(i*2).x , gapY + pos.get(i*2).y,0);
            gl.glVertex3f(gapX +pos.get(i*2+1).x, gapY + pos.get(i*2+1).y,0);
        }
        gl.glEnd();
        gl.glBegin( GL2.GL_TRIANGLES );  

        gl.glColor3f(1.0f, 0.11f, 0.68f);  
        gl.glVertex3f( x         + gapX , + gapY + y        ,0.0f);//triangle one first vertex
        gl.glVertex3f( x - 0.05f + gapX , + gapY + y - 0.05f,0.0f);//triangle one second vertex
        gl.glVertex3f( x + 0.05f + gapX , + gapY + y - 0.05f,0.0f);//triangle one third vertex
        gl.glEnd();
        gl.glFlush();
          
      }
      
     @Override
     public void dispose(GLAutoDrawable drawable) {
     }
 
     @Override
     public void init(GLAutoDrawable drawable) {
         GL2 gl = drawable.getGL().getGL2();
         gl.glClearColor(0.3f, 0.3f, 0.3f, 1.0f);
         
         
     }
 
     @Override
     public void reshape(GLAutoDrawable drawable, int x, int y, int width,
             int height) {
     }
 }