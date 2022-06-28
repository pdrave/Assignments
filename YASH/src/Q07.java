import java.util.ArrayList;
import java.util.List;

//model class
class Item1
{
    int itemid;
    String itemname;
    float itemprice;

    public Item1(int itemid, String itemname, float itemprice) {
        super();
        this.itemid = itemid;
        this.itemname = itemname;
        this.itemprice = itemprice;
    }


}

public class Q07
{
    public static void main(String[] args) {
        List<Item1> itemList = new ArrayList<>();
         itemList.add(new Item1(2,"DRONE",331257));
         itemList.add(new Item1(5,"GIMBAL",24798));
         itemList.add(new Item1( 4,"SONY CAMERA",17898));
         itemList.add(new Item1( 9,"IWATCH",2000));
         itemList.add(new Item1( 3,"IPHONE 13 PRO MAX",19999));


         List<String> evenPriceItems= itemList.stream().filter(i->i.itemprice%2==0).map(i->i.itemname).toList();

          System.out.println("Items With Even Price:"+ evenPriceItems );
    }

}

