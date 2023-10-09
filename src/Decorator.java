abstract class Decorator implements NewHome{
    final NewHome newHome;
    protected Decorator(NewHome newHome){
        this.newHome = newHome;
    }
}
