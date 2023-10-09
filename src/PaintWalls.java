public class PaintWalls extends Decorator{
    protected PaintWalls(NewHome newHome) {
        super(newHome);
    }

    @Override
    public String getHomeFeature() {
        return this.newHome.getHomeFeature() +"+ painted walls ";
    }

    @Override
    public int getPrice() {
        return this.newHome.getPrice()+150;
    }
}
