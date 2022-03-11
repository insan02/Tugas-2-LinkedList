import java.util.LinkedList;

public class soallinkedlist {
    public static void main(String[] args) {
        System.out.println("------Tugas 2 SDA------");
        System.out.println("Nama : NURUL INSAN");
        System.out.println("NIM : 2111522013");
        System.out.println("----------------\n");

        System.out.println("Membuat Linkedlist");

        LinkedList<String> saya = new LinkedList<String>();
        saya.add("N");
        saya.add("U");
        saya.add("R");
        saya.add("U");
        saya.add("L");
        saya.add("");
        saya.add("I");
        saya.add("N");
        saya.add("S");
        saya.add("A");
        saya.add("N");

        System.out.println(saya);
        System.out.println("size = "+saya.size());

        //Add LinkedList
        saya.addFirst("M");
        saya.addLast("S");
        System.out.println("\nOutput setelah ditambah (awal&akhir) = "+saya);
        System.out.println("Size = "+saya.size());

        saya.add("K");
        saya.add("O");
        saya.add("M");
        System.out.println("Output setelah ditambah = "+saya);
        System.out.println("Size = "+saya.size());

        //set linkedlist 
        saya.set(1,"Z" );
        saya.set(4,"I" );
        saya.set(7,"A" );

        System.out.println("\nOutput setelah disisip = "+saya);
        System.out.println("size = "+saya.size());

        //remove linkedlist
        saya.removeFirst();
        saya.removeLast();
        System.out.println("\nOutput setelah dihapus (awal&akhir) = "+saya);
        System.out.println("size = "+saya.size());

        saya.remove(0);
        saya.remove(7);
        saya.remove(9);

        System.out.println("Output setelah dihapus = "+saya);
        System.out.println("Size = "+saya.size());

        //pop and push
        saya.pop();
        System.out.println("\nOutput setelah di-POP = "+saya);
        System.out.println("Size = "+saya.size());

        saya.push("N");
        saya.push("A");
        System.out.println("\nOutput setelah di-PUSH = "+saya);
        System.out.println("Size = "+saya.size());
    }
}
