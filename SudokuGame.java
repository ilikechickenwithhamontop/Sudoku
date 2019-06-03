import javax.swing.*;
public class SudokuGame{

    public JFormattedTextField[][] textfields = new JFormattedTextField[9][9];
    public SudokuGame(JFormattedTextField[][] currenttextfields){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                String x = currenttextfields[i][j].getText();
                textfields[i][j] = new JFormattedTextField(x);
            }
        }
    }

    public boolean checkRowColumn(JFormattedTextField[] line){
   
        try{
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                
                    if(line[i].getText().equals((line[j].getText())) && i != j){
                        return false;
                    }
                    if(line[i].getText().equals("")){
                        return false;
                    }
                    if(line[i].getText().equals(0)){
                    return false;
                    }
            }
        }
    }catch(NullPointerException e ){}
        return true;
    }

    public JFormattedTextField[] createCol(int index){
        JFormattedTextField[] col = new JFormattedTextField[9];
        for(int i = 0; i < 9; i++){
            col[i] = textfields[index][i];

        }
        return col;
    }

    public JFormattedTextField[] createBox(int one, int two){
        JFormattedTextField[] box = new JFormattedTextField[9];
        int count = 0;
        for(int i = one; i < one + 3; i++){
            for(int j = two; j < two + 3; j++){
                box[count] = textfields[one][two];
            }
        }
        return box;
    }

    public boolean isWinner(){
        for(int i = 0; i < 9; i++){
            if(checkRowColumn(textfields[i]) == false){
                return false;
            }
            if(checkRowColumn(createCol(i))== false){
                return false;
            }
        }
        for(int one = 0; one < 8; one = one + 3){
            for(int two = 0; two < 8; two = two + 3){
                if(checkRowColumn(createBox(one, two)) == false){
                    return false;
                }
            }
        }
        return true;
    }
}