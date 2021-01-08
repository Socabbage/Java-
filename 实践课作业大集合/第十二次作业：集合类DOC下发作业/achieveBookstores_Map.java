import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class achieveBookstores_Map {
    public static void main(String[] args) {
        Map<String, Bookstores_Map> books=new HashMap<String,Bookstores_Map>();

        books.put("7-301-04815-9",new Bookstores_Map("7-301-04815-9","The Water Babies",23.3,"译林出版社"));
        books.put("7-301-04817-7",new Bookstores_Map("7-301-04817-7","Reynard the Fox",22.3,"译林出版社"));
        books.put("7-301-04820-7",new Bookstores_Map("7-301-04820-7","The Child of Captain Grant",57.8,"译林出版社"));
        books.put("7-301-04815-8",new Bookstores_Map("7-301-04815-8","The Adventures of Pinocchio",32.3,"译林出版社"));
        books.put("7-301-04815-7",new Bookstores_Map("7-301-04815-7","Jane Eyre",42.3,"译林出版社"));
        books.put("7-301-04819-7",new Bookstores_Map("7-301-04819-7","Three Days to See",32.3,"译林出版社"));
        books.put("7-301-04816-7",new Bookstores_Map("7-301-04816-7","The Little Prince",12.3,"译林出版社"));
        books.put("7-301-04818-7",new Bookstores_Map("7-301-04818-7","Wind in the Willows",52.3,"译林出版社"));

        int i=0;
        Iterator iter=books.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry=(Map.Entry)iter.next();
            System.out.println("book"+Integer.toString(i++)+": "+entry.getKey()
                    +" - "+((Bookstores_Map)entry.getValue()).getName()
                    +" - ￥"+((Bookstores_Map)entry.getValue()).getPrice()
                    +" - "+((Bookstores_Map)entry.getValue()).getPublisher());
        }
    }
}
