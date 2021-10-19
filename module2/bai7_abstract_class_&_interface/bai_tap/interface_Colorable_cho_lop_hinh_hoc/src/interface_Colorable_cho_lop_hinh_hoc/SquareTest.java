package interface_Colorable_cho_lop_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square squares = new Square();
        System.out.println(squares);

        squares = new Square(4.5);
        System.out.println(squares);

        squares = new Square(5.5,"orange", true);
        System.out.println(squares);
    }
}

