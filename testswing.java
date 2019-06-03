import javax.swing.*;
import java.awt.*;
public class testswing{


    public static void main(String[] args)
    {
            createWindow();
    }

    public static void createWindow()
    {
            JPanel main, left, right;
            JFrame frame = new JFrame("Sudoku Frame");
            Box [] box = new Box[81];
            

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            main = new JPanel();
            main.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));

            //Left side holds boxes
            left = new JPanel();
            left.setLayout(new GridLayout(9, 9));

            for(int i = 0; i < 81; i++)
            {
                    box[i] = new Box(BoxLayout.X_AXIS);
                    box[i].setBorder(BorderFactory.createLineBorder(Color.black));
                    box[i].add(new JLabel("      " + (i+1) + "      "));
                    left.add(box[i]);
            }

  

            //Add everything to window
            main.add(left, BorderLayout.WEST);
        

            frame.add(main);
            frame.getContentPane();

            //Window Stuff
            frame.setBounds(50,50,1000,1000);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
    }
}


        


