package bbb;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import javax.swing.JFrame;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.GL4;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.Animator;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.TextureIO;
import java.io.File;
import java.io.IOException;

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
        private GLCanvas canvas;
 
     public Game() {
         super("Minimal OpenGL");
         GLProfile profile = GLProfile.get(GLProfile.GL2);
         GLCapabilities capabilities = new GLCapabilities(profile);
 
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
        System.out.print("Display");
    }
    
    public void move(float x, float y){
        this.x = x;
        this.y = y;
    }
      
    private void render(GLAutoDrawable drawable){
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        
        gl.glBegin( GL2.GL_TRIANGLES );  

        // Drawing Using Triangles 

        gl.glColor3f(0.5f, 0.0f, 1.0f);  
        gl.glVertex3f((-.05f+ x),(-.5f)+ y,0.0f);//triangle one first vertex
        gl.glVertex3f( 0.05f+ x , -0.5f+ y,0.0f);//triangle one second vertex
        gl.glVertex3f( 0f   + x , -.4f + y,0.0f);//triangle one third vertex


        gl.glEnd();
        gl.glFlush();
          
      }
      
     @Override
     public void dispose(GLAutoDrawable drawable) {
     }
 
     @Override
     public void init(GLAutoDrawable drawable) {
         GL2 gl = drawable.getGL().getGL2();
         gl.glClearColor(0.392f, 0.584f, 0.929f, 1.0f);
         
         
     }
 
     @Override
     public void reshape(GLAutoDrawable drawable, int x, int y, int width,
             int height) {
     }
 }