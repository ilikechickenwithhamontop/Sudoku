import java.awt.*;
import javax.swing.*;
public class testswing2{

    public static void main(String[] args){
         JPanel board = new JPanel(new GridLayout(9, 9));
    for(int i= 0; i < 9; i++) {

        for(int j = 0; j < 9; j++) {

            board[i][j] = new JLabel();

            board[i][j].setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));


            Font font = new Font("Arial", Font.PLAIN, 20);

            board[i][j].setFont(font);

            board[i][j].setForeground(Color.WHITE);

            board[i][j].setBackground(Color.WHITE);


            board[i][j].setOpaque(true);

            board[i][j].setHorizontalAlignment(JTextField.CENTER);

            Board.add(board[i][j]);

        }
    }
    }


}