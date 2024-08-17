import java.util.*;
public class practise {
    public static void main(String[] args) {
        ArrayList<String> colours=new ArrayList<>();
        colours.add("white");
        colours.add("red");
        colours.add("blue");
        colours.add("orange");
        colours.add("green");
        System.out.println(colours.get());//1
        for(int i:colours){
            System.out.println(i);//2
        }
        System.out.println(colours.get(1));//3
        System.out.println(colours.get());//5
        System.out.println(colours.remove(3));//6
        System.out.println(colours.search("blue"));//7
        colours.sort();//8
        System.out.println(colours.reverse());//11
        
    }
    
}
