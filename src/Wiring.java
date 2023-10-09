public class Wiring extends Decorator{
    protected Wiring(NewHome newHome) {
        super(newHome);
    }

    @Override
    public String getHomeFeature() {

        return this.newHome.getHomeFeature() + "+ wiring ";
    }

    @Override
    public int getPrice() {
        return this.newHome.getPrice() + 100;
    }
}
