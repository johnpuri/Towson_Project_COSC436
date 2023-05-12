
public class Invoker {
    private Aggregator agg;

    public Invoker(Aggregator agg){
        this.agg = agg;
    }
    public double getTotal(){
        return (double)(new CMDGetTotal(agg).execute());
    }
    public Menu getMenu(){
        return (Menu)(new CMDGetMenu(agg)).execute();
    }
    public void submitOrders(int[] arr){
        (new CMDSubmitOrder(agg, arr)).execute();
    }
    public Orders getOrders(){
        return (Orders)(new CMDGetTab(agg)).execute();
    }
}