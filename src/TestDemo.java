/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-10
 * Time:21:56
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.display();
        System.out.println(myArrayList.contains(2));
        myArrayList.remove(9);
        myArrayList.display();
    }
}
