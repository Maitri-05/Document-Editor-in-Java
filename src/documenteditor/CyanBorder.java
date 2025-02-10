
package documenteditor;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class CyanBorder implements Borrder {
    public JTextArea specialpanel;
    public CyanBorder(JTextArea specialpanel) {
        this.specialpanel=specialpanel;
    }
    
    @Override
    public JTextArea makePanel(){
         
       specialpanel=addBorder(specialpanel); 
        return specialpanel;  
    }
    @Override
    public JTextArea addBorder (JTextArea j){
        Border border = BorderFactory.createLineBorder(Color.CYAN, 5);
        j.setBorder(border);
        return j;
 } 
}
