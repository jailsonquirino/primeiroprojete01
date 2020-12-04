public class App {
    public static void main(String[] args) throws Exception {
        int y1 = 8, y2 = 9, y3 = 7;
        double y = (y1 + y2 + y3 ) /3;
        
        int x1 = 4, x2 = 5, x3 = 6;
        double x = (x1 + x2 + x3) /3;

        double sm = y + x; // soma dos dois números
        double mm = (y + x) /2;  // médis das médias 

        System.out.println("A média aritmética de 7, 8 e 9 é " + y);
        System.out.println("A média númerode 4, 5 e 6 é " + x);
        System.out.println("A soma das duas médias é " + sm);
        System.out.println("A média das medias é " + mm);
    }
}
