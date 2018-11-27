package Example_arrays;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkList {

    public static void main(String[] args){

        LinkedList <String> placesToVisit= new LinkedList<>();
        addInOrder(placesToVisit,"sydney");
        addInOrder(placesToVisit,"bolivia");
        addInOrder(placesToVisit,"sucre");
        addInOrder(placesToVisit,"cbba");
        addInOrder(placesToVisit,"oruro");
//        placesToVisit.add("hawai");
//        placesToVisit.add("bolivia");
//        placesToVisit.add("sucre");
//        placesToVisit.add("oruro");
//        placesToVisit.add("cbba");

        printList(placesToVisit);

        placesToVisit.add("Salvador");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);


    }

    private static void printList(LinkedList<String> linkedList){
        Iterator <String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("now visiting "+ i.next());
        }
        System.out.println("-----------------");
    }

    public static boolean addInOrder(LinkedList<String> linkList, String newCity){
        ListIterator<String> stringListIterator= linkList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison==0){
                //equal do not add
                System.out.println(newCity +" is already included as  a destination");
                return false;

            }else if(comparison > 0){
                //new city should apprear before this one
                //brisbane -> adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison<0){
                //move to next city

            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
