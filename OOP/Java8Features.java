package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {
    public static void main(String[] args) {
        List<String> stocks = new ArrayList<>();
        stocks.add("AAPL");
        stocks.add("GOOGL");
        stocks.add("AMZN");
        stocks.add("MSFT");
        stocks.add("NVDA");
//ForEach
        System.out.println("All Stocks :");
        stocks.forEach(s-> System.out.println(s));
//Filtered
      //  stocks.stream().filter(s->s.startsWith("A")).forEach(s-> System.out.println("Filtered Stocks: "+s));
        List<String> filteredList = stocks.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
        System.out.println("filtered list : "+filteredList);
        //map
       // stocks.stream().map(s->s.toLowerCase()).forEach(s-> System.out.println("Mapped Stocks: "+s));
        List<String> MappedStocks = stocks.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
        System.out.println("Mapped Stocks : "+MappedStocks);
        //count
        Long count = stocks.stream().filter(s->s.length() == 4).count();
        System.out.println("Count of stocks : "+count);
    }
    
}
