/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM :Program ini berisi program yang menampilkan perhitungan bit   
 */

public class IF0110118039Latihan14Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;
        c = a & b;
        // 12 = 0000 1100
        System.out.println("a & b = " + c);
        c = a | b;
        // 61 = 0011 1101
        System.out.println("a | b = " + c);
        c = a ^ b;
        // 49 = 0011 0001
        System.out.println("a ^ b = " + c);
        c = ~a;
        // -61 = 1100 0011
        System.out.println(" ~a = " + c);
        c = a << 2;
        // 240 = 1111 0000
        System.out.println("a << 2= " + c);
        c = a >> 2;
        // 15 = 0000 1111
        System.out.println("a >> 2 = " + c);
    }
}
