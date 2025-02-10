package documenteditor;

import java.awt.Color;
import javax.swing.JTextArea;

class whitebackground implements Background{
  public JTextArea specialpanel;
    public whitebackground(JTextArea specialpanel) {
        this.specialpanel=specialpanel;
    }
    @Override
    public JTextArea makePanel(){
         
       specialpanel=addBackground(specialpanel); 
        return specialpanel;  
    }
  

    @Override
    public JTextArea addBackground(JTextArea j) {
         j.setBackground(Color.white);
     return j; 
    }
}