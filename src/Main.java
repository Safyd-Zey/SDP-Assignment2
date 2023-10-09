public class Main {
    public static void main(String[] args) {
        NewHome newHome = new PaintWalls(new Wiring(new FlatFloor(new Home())));

        System.out.println("you need have "+newHome.getPrice() + "$ to " +newHome.getHomeFeature());
    }
}