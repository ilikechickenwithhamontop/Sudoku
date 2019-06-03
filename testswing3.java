import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.*;
public class testswing3 extends JFrame{
    
    
    public static void main(String[] args){
        JFrame test = new JFrame("x");
        Box[][] box = new Box[9][9];
        test.setPreferredSize(new Dimension(800,800));
        test.setLayout(new GridLayout(9,9));
        JPanel[][] p2 = new JPanel[9][9];
           
   
         for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    p2[i][j] = new JPanel();
                    p2[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                    JLabel test2 = new JLabel("");
                    JFormattedTextField test3 = new JFormattedTextField(0);
                    test2.setSize(50,50);
                    p2[i][j].add(test3);
                    test.add(p2[i][j]);
            }
        } 
        test.pack();
        test.setVisible(true);
    }
}
    

    



