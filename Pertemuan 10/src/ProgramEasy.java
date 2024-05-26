/*
 * Nama     : Fendi Ardianto
 * NIM      : 24060122130077
 * Lab      : PBO D1
 */


import java.util.ArrayList;
import java.util.List;

public class ProgramEasy {
    public static void main(String[] args) {
        List<IFlyer> koleksiBisaTerbang;
        koleksiBisaTerbang = new ArrayList<>();

        IFlyer superman = new Superman("superman");
        IFlyer superboy = new Superman("superboy");
        IFlyer supergirl = new Superman("supergirl");
        IFlyer merpati = new Bird();
        IFlyer eagle = new Bird();

        koleksiBisaTerbang.add(merpati);
        koleksiBisaTerbang.add(eagle);
        koleksiBisaTerbang.add(superman);
        koleksiBisaTerbang.add(supergirl);
        koleksiBisaTerbang.add(superboy);

        for (IFlyer bisaTerbang : koleksiBisaTerbang){
            if(bisaTerbang instanceof Superman){
                System.out.println("I'm " + ((Superman)bisaTerbang).getName());
                System.out.println("Bangsa :" + bisaTerbang.getClass().getSuperclass().getSimpleName());
                System.out.print("Makan: ");
                ((Superman) bisaTerbang).eat();
                System.out.println("");
            }
            else{
                System.out.println("I'm " + bisaTerbang.getClass().getSimpleName());
                System.out.println("Bisa Terbang");
                System.out.print("Makan: ");
                ((Animal) bisaTerbang).eat();
                System.out.println("");
            }
        }


    }
}
