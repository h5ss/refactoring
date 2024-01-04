package OOP.advanced.collection.app;

public class SortingEx {
    public static void main(String[] args) {
        int x=10;
        int y = 10;
        System.out.println(Integer.compare(x,y));
    }
    public static int compare(int x, int y){
        return  x<y ?-1 :((x==y)? 0:1);
    }
}
