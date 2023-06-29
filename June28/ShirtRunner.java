class Shirt {
    String name;

    Shirt(String name) {
        System.out.println("running shirt constructor " + name);
    }
}

class ShirtRunner {
    public static void main(String[] args) {
        System.out.println("running main ");
        Shirt shirt0 = new Shirt("fabric");
        Shirt shirt1 = new Shirt("regularfit");
        Shirt shirt2 = new Shirt("collartype");
        Shirt shirt3 = new Shirt("pattern");
        Shirt shirt4 = new Shirt("color");
        Shirt shirt5 = new Shirt("suitablefor");
        Shirt shirt6 = new Shirt("size");
        Shirt shirt7 = new Shirt("photographic");
        Shirt shirt8 = new Shirt("otherfeatures");
        Shirt shirt9 = new Shirt("reversible");
    }
}

class Dragon {
    String name;

    Dragon(String name) {
        System.out.println("running dragon constructor " + name);
    }
}

class DragonRunner {
    public static void main(String[] args) {
        System.out.println("running main ");
        Dragon dragon0 = new Dragon("draco");
        Dragon dragon1 = new Dragon("rhaegal");
        Dragon dragon2 = new Dragon("ladon");
        Dragon dragon3 = new Dragon("smaug");
        Dragon dragon4 = new Dragon("flakor");
        Dragon dragon5 = new Dragon("toothless");
        Dragon dragon6 = new Dragon("glaurung");
        Dragon dragon7 = new Dragon("cadmus");
        Dragon dragon8 = new Dragon("kaida");
        Dragon dragon9 = new Dragon("shenron");
    }
}