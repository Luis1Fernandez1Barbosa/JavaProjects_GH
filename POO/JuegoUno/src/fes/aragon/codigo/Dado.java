
package fes.aragon.codigo;

import java.util.Random;

public class Dado {
        private int cara;

    public Dado() {
    }
    
    public void lanzar () {
       Random rd=new Random();
        this.cara = rd.nextInt(5);        
    }

    public int getCara() {
        return cara;
    }

    public void setCara(int cara) {
        this.cara = cara;
    }
    
} 
   
