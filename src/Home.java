public class Home implements NewHome{

    @Override
    public String getHomeFeature() {
        return "get a house in draft form ";
    }

    @Override
    public int getPrice(){
        return 1000;
    }
}
