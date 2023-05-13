
public class Dinner implements State{
    private static Invoker invoker = new Invoker(new Aggregator());

    public void doAction(Context context){
        context.setState(this);
        Menu menu = invoker.getMenu();
        MenuIterator itr = menu.getMealIterator(3);

        System.out.println("------ Dinner Menu -------");

        String[] str = new String[100];
        int x = 0;
        while(itr.hasNext()){
            MenuItem i = itr.getItem();
            str[x] = String.format("%2d - %-31s $%.2f", i.getNumber() , i.getName(), i.getPrice());
            x++;
        }

        int y = 0;
        while(str[y] != null){
            System.out.println(str[y]);
            y++;
        }
    }
}
