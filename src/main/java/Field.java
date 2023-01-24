import java.util.ArrayList;
import java.util.List;

public class Field {

    private final int LENGTH;
    private Dame[][] dField;
    private List<Dame> damen;

    public Field(int LENGTH) {
        this.LENGTH = LENGTH;
        dField = new Dame[LENGTH][LENGTH];
        damen = new ArrayList<>();
    }

    public void fillField(){
        for(int i = 0; i < LENGTH; i++){
            addDame(new Dame(i, 0));
        }
    }

    public void addDame(Dame d){
        dField[d.getX()][d.getY()] = d;
        damen.add(d);
    }

    public void solve(int n){
        for(int i = n-1; i >= 0; i--){
            //Solve
        }
    }

    public boolean isSolved(){
        for(Dame d : damen){
            if(!d.checkHorizontalMovement(this)) return false;
            if(!d.checkVerticalMovement(this)) return false;
            if(!d.checkDiagonalMovement(this)) return false;
        }
        return true;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < LENGTH; i++){
            for(int j = 0; j < LENGTH; j++){
                if(dField[i][j] != null) builder.append(" # ");
                else builder.append(" - ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public int getLENGTH() {
        return LENGTH;
    }

    public Dame[][] getdField() {
        return dField;
    }
}
