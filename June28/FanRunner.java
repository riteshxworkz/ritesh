class Fan {
    String name;

    Fan(String name) {
        System.out.println("running fan constructor " + name);
    }
}

class FanRunner {
    public static void main(String[] args) {
        System.out.println("running main ");
        Fan fan0 = new Fan("modelname");
        Fan fan1 = new Fan("brandcolor");
        Fan fan2 = new Fan("numberofblades");
        Fan fan3 = new Fan("powerrequirment");
        Fan fan4 = new Fan("powerconsumption");
        Fan fan5 = new Fan("bladematerial");
        Fan fan6 = new Fan("finish");
        Fan fan7 = new Fan("airflow");
        Fan fan8 = new Fan("otherfeatures");
        Fan fan9 = new Fan("salespackage");
    }
}

class Insects {
    String name;

    Insects(String name) {
        System.out.println("running insects constructor " + name);
    }
}

class InsectsRunner {
    public static void main(String[] args) {
        System.out.println("running main ");
        Insects insects0 = new Insects("beetle");
        Insects insects1 = new Insects("fly");
        Insects insects2 = new Insects("ants");
        Insects insects3 = new Insects("butterfly");
        Insects insects4 = new Insects("termite");
        Insects insects5 = new Insects("flea");
        Insects insects6 = new Insects("ladybug");
        Insects insects7 = new Insects("bee");
        Insects insects8 = new Insects("cockroach");
        Insects insects9 = new Insects("dragonfly");
    }
}