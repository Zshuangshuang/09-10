/**
 * Created With IntelliJ IDEA.
 * Description:顺序表,一种数据结构，底层由数组构成
 * User:ZouSS
 * Date:2020-09-10
 * Time:19:53
 **/

public class MyArrayList {

    private int[] elem;
    private int usedSize;
    public MyArrayList(){
        this.elem = new int[20];
        this.usedSize = 0;
    }
   public void add(int pos,int data){
        if (pos < 0 || pos > this.usedSize){
            throw new ArrayIndexOutOfBoundsException("当前位置不合法");
        }
       for (int i = this.usedSize; i >= pos; i--) {
           this.elem[i+1] = this.elem[i];
       }
       this.elem[pos] = data;
        this.usedSize++;
   }
   public void display(){
       for (int i = 0; i < this.usedSize; i++) {
           System.out.print(this.elem[i]+"   ");
       }
       System.out.println();
   }
   public int size(){
        return this.usedSize;
   }
   public boolean contains(int key){
       for (int i = 0; i < this.usedSize; i++) {
           if (this.elem[i]  == key){
               return true;
           }
       }
       return false;
   }
   public int search(int key){
       for (int i = 0; i < this.usedSize; i++) {
           if (this.elem[i] == key){
               return i;
           }
       }
       return -1;
   }
   public void remove(int x){
        if (search(x) == -1){
            System.out.println("没有当前元素");
            return;
        }
       for (int i = search(x); i < this.usedSize ; i++) {
           this.elem[i] = this.elem[i+1];
       }
       this.usedSize --;
   }
   public void removeAllKey(int x){

   }
}
