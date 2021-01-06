public static void effectiveFillBackpack(Bag bag, List<Item> items) {
   Map<Double, Item> sortByRatio = new TreeMap(Collections.reverseOrder());
   for (Item item : items) {
       sortByRatio.put((double)item.getCost() / item.getWeight(), item);
   }

   for (Map.Entry<Double, Item> entry : sortByRatio.entrySet()) {
       if(bag.getMaxWeight() > bag.getCurrentWeight() + entry.getValue().getWeight()) {
           bag.addItem(entry.getValue());
       }
   }
}
