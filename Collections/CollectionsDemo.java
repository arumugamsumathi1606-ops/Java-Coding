package Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        // Collections are data structures that store and manage groups of objects.
        // They provide various methods for adding, removing, and manipulating elements.
        // Common types of collections include List, Set, and Map.

        // Example of a List collection
        java.util.List<String> list = new java.util.ArrayList<>();
        System.out.println(" === WatchList: All Stocks ==="); // Empty list
        list.add("AAPL");
        list.add("GOOG");
        list.add("MSFT");
        System.out.println("List: " + list);

        // Example of a Set collection
        java.util.Set<String> set = new java.util.HashSet<>();
        System.out.println("=== HASH SET ==="); // Empty set
        set.add("AAPL");
        set.add("CSCO");
        set.add("GOOG");
        set.add("MSFT");
        set.add("TSLA");
        set.add("AAPL"); // Duplicate element will not be added
        set.remove("TSLA"); // Remove an element
        System.out.println("After Remove : " + set);

        // Example of a Map collection
        java.util.Map<String, Double> map = new java.util.HashMap<>();
        System.out.println("=== HASH MAP ==="); // Empty map
        map.put("AAPL", 499.89);
        map.put("GOOG", 275.00);
        map.put("MSFT", 300.00);
        System.out.println("Stock Prices: " + map);
    }
    
}
