
package Presentacion;

import javax.swing.JProgressBar;
 
public class cargar extends Thread{
    
 JProgressBar progressBar;
 public cargar(JProgressBar progressBar)
 {
     
     super();
     this.progressBar = progressBar;
     
 }
 @Override
 public void run()
 {
	 try {
		
	
     for(int a = 1; a<=100; a++)
     {
    	 progressBar.setValue(a);
         pausa(10);
     }
	 } catch (NullPointerException e) {
			System.out.println("Ejecutado correctamente");
		}
	     
 }
 
 public void pausa(int mlseg)
 {
     try {
         Thread.sleep(mlseg);
         
     } catch (Exception e) {
     }
 }
   
}
