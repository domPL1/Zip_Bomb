
package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Bomb implements Runnable {
        private Thread t;
        String filename;
        byte[] b = new byte[105000];

    Bomb(String a) {
        this.filename=a;
    }

    Bomb() {
        
    }
        @Override
        public void run() {
            for (int i=0;i<105000;i++)
                {
                    b[i]='a';
                 }
            try {
                try (FileOutputStream out = new FileOutputStream("asd.bin", true)) {
                    out.write(b);
                    out.close();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Zip_Bomb.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Zip_Bomb.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        public void start () {
      if (t == null) {
         t = new Thread(new Bomb());
         t.start ();
      }
   }
}
        
public class Zip_Bomb {
    public static void main(String[] args) {
for(int i = 0; i < 10; i++){
            Bomb u = new Bomb(); 
            u.start();
        }
    }
}



