package OOP.advanced.collection.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        for (Integer i : list1)
            System.out.println(i);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        list1.set(1,100);
        System.out.println(list1.get(1));

        list1.remove(1);
//        System.out.println(list1.get(1));
        System.out.println(list1.size());

        Integer[][] idata = {{1,2,3,4,5},{6,7,8,9,10}};
        List<Integer[][]> list2 = new ArrayList<>();


        /*list2.add(idata);
        for (Integer[][] i : list2){
            System.out.println(Arrays.deepToString(i));
        }*/
        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };
        Integer count = 0;
        System.out.println(dataset.length);

        for (Integer item = 0; item <dataset.length; item++) {
            if (dataset[item].indexOf("i") >= 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
