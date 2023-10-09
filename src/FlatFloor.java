public class FlatFloor extends Decorator{

    protected FlatFloor(NewHome newHome) {
        super(newHome);
    }

    @Override
    public String getHomeFeature() {
        return this.newHome.getHomeFeature() + "+ flat floor ";
    }

    @Override
    public int getPrice() {
        return this.newHome.getPrice()+200;
    }
}
