class Bag {
    String name;

    Bag(String name) {
        System.out.println("running bag constructor " + name);
    }
}

class BagRunner {
    public static void main(String[] args) {
        System.out.println("running main ");
        Bag bag0 = new Bag("price");
        Bag bag1 = new Bag("adidas");
        Bag bag2 = new Bag("minecraft");
        Bag bag3 = new Bag("color");
        Bag bag4 = new Bag("size");
        Bag bag5 = new Bag("american");
        Bag bag6 = new Bag("tourister");
        Bag bag7 = new Bag("capacity");
        Bag bag8 = new Bag("waterproof");
        Bag bag9 = new Bag("material");
    }
}

class Birds {
    String name;

    Birds(String name) {
        System.out.println("running birds constructor " + name);
    }
}

class BirdsRunner {
    public static void main(String[] args) {
        System.out.println("running main ");
        Birds birds0 = new Birds("parrot");
        Birds birds1 = new Birds("peacock");
        Birds birds2 = new Birds("sparrow");
        Birds birds3 = new Birds("crow");
        Birds birds4 = new Birds("kingfisher");
        Birds birds5 = new Birds("owl");
        Birds birds6 = new Birds("swan");
        Birds birds7 = new Birds("eagle");
        Birds birds8 = new Birds("duck");
        Birds birds9 = new Birds("crane");
    }
}