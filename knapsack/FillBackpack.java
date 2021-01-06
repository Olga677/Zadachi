public static void fillBackpack(Bag bag, List<Item> items) {
   for (Item item : items) {
       if(bag.getMaxWeight() > bag.getCurrentWeight() + item.getWeight()) {
            bag.addItem(item);
       }
   }
}
