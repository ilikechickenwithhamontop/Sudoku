import java.awt.*;
import javax.swing.*;
public class testswing4{

public static void main(String[] args){
JFrame test = new JFrame("x");
test.setPreferredSize(new Dimension(800,800));
test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Box test1 = new Box(BoxLayout.X_AXIS);
test1.setLayout(new GridLayout(9,9));
test.add(test1);

test.pack();
test.setVisible(true);
}

}