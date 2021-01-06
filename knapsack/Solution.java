public class Solution {

   public static void main(String[] args) {
       List<Item> items = new ArrayList<>();
       items.add(new Item("гитара",7, 800));
       items.add(new Item("утюг",6, 500));
       items.add(new Item("чайник",3, 300));
       items.add(new Item("лампа",4, 500));
       items.add(new Item("телевизор",15, 2000));
       items.add(new Item("ваза",2, 450));
       items.add(new Item("миксер",1, 400));
       items.add(new Item("блендер",3, 200));

       Collections.sort(items);

       Bag firstBag = new Bag(30);

       fillBackpack(firstBag, items);

       System.out.println("Вес рюкзака состовляет - " + firstBag.getCurrentWeight() +
               ", общая стоимость вещей в рюкзаке - " + firstBag.getCurrentCost());
}
}
