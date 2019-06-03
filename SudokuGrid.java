import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
public class SudokuGrid extends JFrame implements ActionListener{
JPanel[][] grid;
ArrayList<JFormattedTextField> textfields = new ArrayList<JFormattedTextField>();
JFormattedTextField[][] testarr = new JFormattedTextField[9][9];
public SudokuGrid(int[][] game){
    JFrame test = new JFrame("x");
    Box[][] box = new Box[9][9];
    test.setPreferredSize(new Dimension(800,800));
    test.setLayout(new GridLayout(10,9));
    grid = new JPanel[9][9];  
    for (int i = 0; i < 9; i++){
                    for (int j = 0; j < 9; j++){
                        grid[i][j] = new JPanel();
                        grid[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                        JLabel test2 = new JLabel("");
                        JFormattedTextField test3 = new JFormattedTextField(0);
                        if(game[i][j] != 0){
                        JLabel preset = new JLabel(game[i][j]+" ");
                        testarr[i][j] = new JFormattedTextField(game[i][j]);
                        grid[i][j].add(preset);
                        test.add(grid[i][j]);
                        }
                        else{
                        testarr[i][j] = test3;
                        test2.setSize(50,50);
                        grid[i][j].add(test3);
                        test.add(grid[i][j]);
                    }
                }
            } 
    JButton end = new JButton("end");
    end.addActionListener(this);
    test.add(end, BorderLayout.WEST);
    test.pack();
    test.setVisible(true);
}
public void actionPerformed(ActionEvent e){
SudokuGame y = new SudokuGame(this.getCurrentBoard());
/*for(JFormattedTextField[] x: testarr){
for(JFormattedTextField f : x){
System.out.println(f.getText());
}
}
*/
if(!y.isWinner()){
System.out.println("you lose");
}
else{
System.out.println("you win");
}
}
public JPanel[][] getGrid(){
    return grid;
}
public ArrayList<JFormattedTextField> getTextFields(){
    return textfields;
}
public JFormattedTextField[][] getCurrentBoard(){
return testarr;
}

}