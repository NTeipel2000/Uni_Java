public class Dame {

    private int x;
    private int y;

    public Dame(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveRight(Field field){
        field.getdField()[x][y] = null;
        this.x++;
        field.getdField()[x][y] = this;
    }

    public boolean checkHorizontalMovement(Field field){
        if(!checkLeft(field)) return false;
        if(!checkRight(field)) return false;
        return true;
    }

    public boolean checkVerticalMovement(Field field){
        if(!checkUp(field)) return false;
        if(!checkDown(field)) return false;
        return true;
    }

    public boolean checkDiagonalMovement(Field field){
        if(!checkDiagonalLeftUp(field)) return false;
        if(!checkDiagonalLeftDown(field)) return false;
        if(!checkDiagonalRightUp(field)) return false;
        if(!checkDiagonalRightDown(field)) return false;
        return true;
    }

    private boolean checkLeft(Field field){
        for(int i = y-1; i > 0; i-- ){
            if(field.getdField()[x][i] != null){
                return false;
            }
        }
        return true;
    }

    private boolean checkRight(Field field){
        for(int i = y+1; i < field.getLENGTH(); i++){
            if(field.getdField()[x][i] != null){
                return false;
            }
        }
        return true;
    }

    private boolean checkUp(Field field){
        for(int i = x-1; i > 0; i--){
            if(field.getdField()[i][y] != null){
                return false;
            }
        }
        return true;
    }

    private boolean checkDown(Field field){
        for(int i = x+1; i < field.getLENGTH(); i++){
            if(field.getdField()[i][y] != null){
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonalLeftUp(Field field){
        for(int i = x-1, j = y-1; i > 0 && j > 0; i--, j--){
            if(field.getdField()[i][j] != null){
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonalLeftDown(Field field){
        for(int i = x+1, j = y-1; i < field.getLENGTH() && j > 0; i++, j--){
            if(field.getdField()[i][j] != null){
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonalRightUp(Field field){
        for(int i = x-1, j = y+1; i > 0 && j < field.getLENGTH(); i--, j++){
            if(field.getdField()[i][j] != null){
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonalRightDown(Field field){
        for(int i = x+1, j = y+1; i < field.getLENGTH() && j < field.getLENGTH(); i++, j++){
            if(field.getdField()[i][j] != null) {
                return false;
            }
        }
        return true;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
