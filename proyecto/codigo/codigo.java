import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.RenderingHints;
import java.util.Random;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Arreglo extends JPanel {
    long T;
    long TI;
    long TF;
    int abejas = 18000000;  //maximo 18.000.000
    //int menorX = 3000;
    int[] x = new int[abejas];
    int[] y = new int[abejas];
    //int[] xi = new int[abejas];
    //int[] yi = new int[abejas];

    public void llenarArreglo() {
        TI = System.currentTimeMillis();
        for (int i = 0; i < abejas; i++) {
            //Random r = new Random();
            int cx = (int) (Math.random() * 1870) + 1;
            int cy = (int) (Math.random() * 890) + 1;
            x[i] = cx;
            y[i] = cy;
        }
        /*for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + ",");
        }
        System.out.println("");
        for(int i = 0; i < y.length; i++){
            System.out.print(y[i] + ",");
        }
        System.out.println("");*/
        quicksort(x, y, 0, x.length - 1);
        //choque(x,y,g2d);
        /*for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + ",");
        }
        System.out.println("");
        for(int i = 0; i < y.length; i++){
            System.out.print(y[i] + ",");
        }*/
    }

    public static void quicksort(int x[], int y[], int izq, int der) {
        int pivote = x[izq];
        int pivotey = y[izq];
        int i = izq;
        int j = der;
        int aux;
        int auxy;

        while (i < j) {
            while (x[i] <= pivote && i < j) {
                i++;
            }
            while (x[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = x[i];
                x[i] = x[j];
                x[j] = aux;
                auxy = y[i];
                y[i] = y[j];
                y[j] = auxy;
            }
        }
        x[izq] = x[j];
        x[j] = pivote;
        y[izq] = y[j];
        y[j] = pivotey;
        if (izq < j - 1) {
            quicksort(x, y, izq, j - 1);
        }
        if (j + 1 < der) {
            quicksort(x, y, j + 1, der);
        }
    }

    public void choque(int[] x, int[] y, Graphics g) {
        int numChoques = 0;
        Font font = new Font("Serif", Font.PLAIN, 15);
        g.setFont(font);
        
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] == x[i + 1]) {
                if (y[i] == y[i + 1]) {
                    numChoques += 1;
                    //System.out.println("Choque en: X: " + x[i] + ", Y: " + y[i]);
                    g.setColor(Color.BLACK);
                    g.drawOval(x[i] - 3, y[i] - 3, 10, 10); 
                    g.drawString("X: " + x[i] + ", Y: " + y[i], x[i] - 35, y[i] - 10);
                } /*else {
                  casiChoque(x,y,g,i);
                }*/
            }
        }
        System.out.println("Numero de choques: " + numChoques);
        TF = System.currentTimeMillis();
        T = TF - TI;
        System.out.println("Tiempo de ejecucion = " + T + " Milisegundos");
    }
    
    /*public void casiChoque(int[]x,int[]y,Graphics g,int pos){
        int aux = -1;
        for(int i = pos; i < x.length - 1; i++){
            if(Math.abs(y[i] - y[i + 1]) <= 5){
                g.setColor(Color.blue);
                g.drawOval(x[pos], y[i], 50, 50);
                break;
            }
        }
        if(aux >= 0){
            /*g.setColor(Color.blue);
            g.drawOval(x[pos], y[aux], 50, 50);*/
      //  }
  //  }
    private synchronized void waitMethod() {
        while (true) {
            llenarArreglo();
            repaint();
            //System.out.println("always running program ==> " + Calendar.getInstance().getTime());
            try {
                this.wait(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
	}
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (int i = 0; i < abejas; i++) {
            //Random r = new Random();
            //int cx = (int) (Math.random() * 1920) + 1;
            //int cy = (int) (Math.random() * 960) + 1;
            //x[i] = cx;
            //y[i] = cy;
            g2d.setColor(Color.PINK);
            g2d.fillOval(x[i], y[i], 5, 5);
        }
        choque(x, y, g2d);
        //llenarAreglo();
        //repaint();
    }

    public static void main(String[] args) {
        Arreglo miArreglo = new Arreglo();
        miArreglo.llenarArreglo();
        JFrame frame = new JFrame("Abejas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(miArreglo);
        frame.setSize(1920, 960);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        miArreglo.waitMethod();
        /*while(x){
            long start = System.currentTimeMillis();
            System.out.println(System.currentTimeMillis());
            if(start >= 10000){
                
                //main(args);
                start=0;
                miArreglo.llenarArreglo();
                miArreglo.updateUI();
                System.out.println("ejecute");
                //System.out.println("start: "+start);
                
            }
        }*/
    }

    private void llenarAreglo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
