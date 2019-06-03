import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
public class tester{

public static void main (String[] args){
    int[][] testgrid = new int[9][9];
    for(int i = 0; i < 9; i++){
    for(int j = 0; j < 9; j++){
    testgrid[i][j] = i;
    }
    }
    SudokuGrid x = new SudokuGrid(testgrid);
    JPanel[][]y =x.getGrid();
    ArrayList<JFormattedTextField> textfields = x.getTextFields();
    System.out.println(textfields.get(0).getText());
    
}


}