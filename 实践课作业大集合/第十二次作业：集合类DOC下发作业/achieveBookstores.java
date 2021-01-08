import java.util.ArrayList;
import java.util.List;

public class achieveBookstores {
    public static void main(String[] args) {
        List<Bookstores> bookstoresList=new ArrayList<Bookstores>();

        Bookstores book1=new Bookstores();
        book1.setCode("7-301-04815-7");
        book1.setName("Jane Eyre");
        book1.setPrice(42.3);
        book1.setPublisher("译林出版社");

        Bookstores book2=new Bookstores();
        book2.setCode("7-301-04815-8");
        book2.setName("The Adventures of Pinocchio");
        book2.setPrice(32.3);
        book2.setPublisher("译林出版社");

        Bookstores book3=new Bookstores();
        book3.setCode("7-301-04815-9");
        book3.setName("The Water Babies");
        book3.setPrice(23.3);
        book3.setPublisher("译林出版社");

        Bookstores book4=new Bookstores();
        book4.setCode("7-301-04816-7");
        book4.setName("The Little Prince");
        book4.setPrice(12.3);
        book4.setPublisher("译林出版社");

        Bookstores book5=new Bookstores();
        book5.setCode("7-301-04817-7");
        book5.setName("Reynard the Fox");
        book5.setPrice(22.3);
        book5.setPublisher("译林出版社");

        Bookstores book6=new Bookstores();
        book6.setCode("7-301-04818-7");
        book6.setName("Wind in the Willows");
        book6.setPrice(52.3);
        book6.setPublisher("译林出版社");

        Bookstores book7=new Bookstores();
        book7.setCode("7-301-04819-7");
        book7.setName("Three Days to See");
        book7.setPrice(32.3);
        book7.setPublisher("译林出·版社");

        Bookstores book8=new Bookstores();
        book8.setCode("7-301-04820-7");
        book8.setName("The Child of Captain Grant");
        book8.setPrice(57.8);
        book8.setPublisher("译林出版社");

        bookstoresList.add(book1);
        bookstoresList.add(book2);
        bookstoresList.add(book3);
        bookstoresList.add(book4);
        bookstoresList.add(book5);
        bookstoresList.add(book6);
        bookstoresList.add(book7);
        bookstoresList.add(book8);

        int i=0;
        for(Bookstores bookstores:bookstoresList){
            System.out.println("book"+Integer.toString(i++)+": ");
            System.out.println("bookCode: "+bookstores.getCode());
            System.out.println("bookName: "+bookstores.getName());
            System.out.println("bookPrice: ￥"+bookstores.getPrice());
            System.out.println("bookPublisher: "+bookstores.getPublisher());
            System.out.println();
        }
    }
}
