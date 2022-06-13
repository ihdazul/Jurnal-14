
package com.company;

import java.util.HashMap;
import java.util.Map;

    public class Main {

        public static void main(String[] args) {
            HashMap<Mahasiswa, Integer> mapMahasiswa = new HashMap<>();

            Mahasiswa Goku = new Mahasiswa("12334", "Goku", "45-04");
            Mahasiswa Siu = new Mahasiswa("12356", "Siu", "45-03");
            Mahasiswa Pessi = new Mahasiswa("12378", "Pessi", "45-02");

            mapMahasiswa.put(Goku, 90);
            mapMahasiswa.put(Siu, 90);
            mapMahasiswa.put(Pessi, 90);
            print(mapMahasiswa);
            System.out.println("Nilai rata-rata Mahasiswa dengan jumlah mhs: " + mapMahasiswa.size() + " adalah " + mean(mapMahasiswa));

            mapMahasiswa.remove(Pessi);
            System.out.println();

            print(mapMahasiswa);
            System.out.println("Nilai rata-rata Mahasiswa dengan jumlah mhs: " + mapMahasiswa.size() + " adalah " + mean(mapMahasiswa));

        }

        //method
        public static int mean(HashMap<Mahasiswa,Integer> mhs) {
            int jumlahNilai = 0;
            for (Object obj: mhs.keySet()) {
                jumlahNilai += mhs.get(obj);
            }
            return(jumlahNilai/mhs.size());
        }

        public static void print(HashMap<Mahasiswa,Integer> mhs) {
            for (Object obj: mhs.keySet()) {
                System.out.println("key: " + obj + " memiliki nilai: " + mhs.get(obj));
            }
        }
    }

