public class Biscuit {
    String name="Good day";
    double quantity = 200;
    String shape= "Round";
    String color;
    Biscuit(){
        System.out.println("Biscuit const is running");
    }
    public static void main(String[] args) {
        Biscuit biscuit = new Biscuit();
        System.out.println(biscuit.name);
        System.out.println(biscuit.quantity + " gm");
        System.out.println(biscuit.shape);
        System.out.println(biscuit.color);
    }
    
}