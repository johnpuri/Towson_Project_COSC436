
public class CMDGetMenu implements CMDInterface {
    private Aggregator agg;

    public CMDGetMenu(Aggregator agg){
        this.agg = agg;
    }

    public Object execute(){
        return agg.getMenu();
    }
}
