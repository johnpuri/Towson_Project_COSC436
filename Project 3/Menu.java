public class Menu {
    public static MenuItem[] items = new MenuItem[100];

    public Menu(){
        items[0] = new MenuItem(1,"Big Mac", 4.99, 2);
        items[1] = new MenuItem(2,"Quarter Pounder with Cheese", 5.99, 2);
        items[2] = new MenuItem(3,"McChicken", 3.99, 1);
        items[3] = new MenuItem(4,"Filet-O-Fish", 4.29, 2);
        items[4] = new MenuItem(5,"Chicken McNuggets", 6.99, 1);
        items[5] = new MenuItem(6,"McRib", 4.99, 3);
        items[6] = new MenuItem(7,"Double Cheeseburger", 3.99, 2);
        items[7] = new MenuItem(8,"Big Breakfast", 6.49, 1);
        items[8] = new MenuItem(9,"Egg McMuffin", 3.79, 1);
        items[9] = new MenuItem(10,"Hash Browns", 1.99, 1);
        items[10] = new MenuItem(11,"Famous Bowl", 5.99, 3);
        items[11] = new MenuItem(12,"Original Recipe Chicken", 5.49, 1);
        items[12] = new MenuItem(13,"Popcorn Chicken", 3.99, 1);
        items[13] = new MenuItem(14,"Zinger Burger", 4.99, 2);
        items[14] = new MenuItem(15,"Twister Wrap", 6.99, 2);
        items[15] = new MenuItem(16,"Crispy Chicken Salad", 5.99, 2);
        items[16] = new MenuItem(17,"Mashed Potatoes with Gravy", 2.99, 3);
        items[17] = new MenuItem(18,"Fries", 1.99, 1);
        items[18] = new MenuItem(19,"Apple Pie", 1.49, 1);
        items[19] = new MenuItem(20,"Soft Serve Cone", 0.99, 1);
    }

    public MenuIterator getMenuIterator(){
        return new AllitemsIterator();
    }

    public MenuIterator getMealIterator(int m){
        return new MealIterator(m);
    }
}