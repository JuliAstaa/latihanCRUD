/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihancrud;

/**
 *
 * @author SCU
 */
public class LatihanCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);
        try {
            for(int i = 0; i<=100; i++){
                Thread.sleep(25);
                splash.loading.setValue(i);
                splash.persen.setText("Loading " + Integer.toString(i)+ "%");
                if(i == 100){
                   new FormNAMA().setVisible(true);
                   splash.setVisible(false);
                }
            }
            
        } catch(Exception e){
            
        }
    }
    
}
