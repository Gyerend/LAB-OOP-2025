package TugasPraktikum02;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){
        return height * width * length;
    }
}
public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        
        cuboid.height = 15;
        cuboid.width = 10;
        cuboid.length = 30;

        System.out.printf("Volume = %.2f\n", cuboid.getVolume());
    }
}
