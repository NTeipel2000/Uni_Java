public class Main {

    public static void main(String[] args) {
        Field field = new Field(4);
        field.fillField();
        field.solve(4);

        System.out.println(field.toString());
        System.out.println(field.isSolved());
    }

}
