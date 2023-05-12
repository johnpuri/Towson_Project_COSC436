public class Orders {
    public static MenuItem[] items;

    public Orders(){
        items  = new MenuItem[100];
    }

    public void addItem(MenuItem i){
        int x = 0;
        while(x < 99){
            if(items[x] != null) x++;
            else break;
        }
        items[x] = i;
    }

    public double getTotal(){
        int x = 0;
        double temp = 0;
        while(items[x] != null){
            temp += items[x].getPrice();
            x++;
        }
        if (x == 0) {
            System.out.println("No order selected.");
            return 0;
        }
        return temp;
    }

    public MenuIterator getOrdersIterator(){
        return new AllOrderIterator();
    }
}