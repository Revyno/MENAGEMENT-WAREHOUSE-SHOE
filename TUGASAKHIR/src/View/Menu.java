package View;

import Entity.*;
import Model.Model;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);
    private Orang loggedInUser;

    private boolean menuAdmin(){
        System.out.println("====== Login Menu =======");
        System.out.print("Masukan Username: ");
        String username = input.nextLine();
        System.out.print("Masukan Password: ");
        String password = input.nextLine();

        Model.dataAdmin();

        loggedInUser = Model.loginAdmin(username,password);

        if (loggedInUser != null) {
            System.out.println("Login Berhasil. Selamat Datang Bos, " +  "!");
            return true;
        }else
            System.out.println("Login Gagaal. Username / password salah coba lagi.");
        return menuAdmin();
    }

    private void menu() {
        System.out.print("""
                PILIH MENU:
                1. Lihat Data
                2. Tambah Data
                3. Edit Data
                4. Hapus Data
                5. Cari Merk
                0. Keluar
                Masukan Pilihan:  """);
    }

    public void run() {
        boolean cek = menuAdmin();
        if (cek != false) {
                int inputMenu = -1;

                x:
                while (true) {
                    menu();

                    inputMenu = input.nextInt();
                    input.nextLine();

                    switch (inputMenu) {
                        case 1:
                            lihatData();
                            break;
                        case 2:
                            tambahData();
                            break;
                        case 3:
                            updateData();
                            break;
                        case 4:
                            deleteData();
                            break;
                        case 5:
                            carisepatu();
                            break;
                        case 0:
                            break x;

                        default:
                            System.out.println("Menu tidak valid.");
                            break;
                    }
                    System.out.println();
                }
            }
        }

    private void lihatData() {
        ArrayList<Sepatu> sepatuList = Model.getSepatuList();

        System.out.println("\n============ LIHAT DATA ============");

        if (sepatuList.size() > 0) {
            for (Sepatu sepatu : sepatuList) {
                sepatu.info();
            }
        } else {
            System.out.println("Tidak ada data.");
        }
    }

    private void tambahData() {
        String kodeProduk, merekSepatu, bahanSepatu, tipeSepatu, warnaSepatu;
        int ukuranSepatu, hargaProduk,stokSepatu;

        System.out.println("\n============ TAMBAH DATA ============");

        System.out.print("Masukan Kode Produk Baru: ");
        kodeProduk = input.nextLine();

        if (Model.cariByKodeProduk(kodeProduk) == null) {
            System.out.println("-------- Masukan Data Produk --------");

            System.out.print("Merek Sepatu  : ");
            merekSepatu = input.nextLine();

            System.out.print("Bahan Sepatu  : ");
            bahanSepatu = input.nextLine();

            System.out.print("Tipe Sepatu   : ");
            tipeSepatu = input.nextLine();

            System.out.print("Warna Sepatu  : ");
            warnaSepatu = input.nextLine();

            System.out.print("Ukuran Sepatu : ");
            ukuranSepatu = input.nextInt();
            input.nextLine();

            System.out.println("Stok Sepatu:");
            stokSepatu = input.nextInt();
            input.nextLine();

            System.out.print("Harga         : ");
            hargaProduk = input.nextInt();
            input.nextLine();

            Sepatu sepatu = new Sepatu(kodeProduk, hargaProduk, merekSepatu,
                    bahanSepatu, tipeSepatu, warnaSepatu,
                    ukuranSepatu);

            Model.tambahData(sepatu);

            System.out.println("Berhasil menambahkan data.");

        } else {
            System.out.println("Kode Produk sudah pernah ditambahkan.");
        }
    }

    private void updateData() {
        System.out.println("\n============ UPDATE DATA ============");

        System.out.print("Masukan Kode Produk yang akan diupdate: ");
        String kodeProduk = input.nextLine();

        Sepatu sepatu = Model.cariByKodeProduk(kodeProduk);

        if (sepatu != null) {
            System.out.print("""
                    UPDATE:
                    1. Merek Sepatu
                    2. Bahan Sepatu
                    3. Tipe Sepatu
                    4. Warna Sepatu
                    5. Ukuran Sepatu
                    6. Stok
                    Pilih: """);
            int pilihEdit = input.nextInt();
            input.nextLine();

            switch (pilihEdit) {
                case 1 -> {
                    System.out.println("Merek Sepatu : " + sepatu.getMerekSepatu());
                    System.out.print("Merek Baru     : ");
                    String merekSepatu = input.nextLine();

                    sepatu.setMerekSepatu(merekSepatu);

                    System.out.println("Berhasil mengupdate Merek");
                }
                case 2 -> {
                    System.out.println("Bahan Sepatu : " + sepatu.getBahanSepatu());
                    System.out.print("Bahan Baru     : ");
                    String bahanSepatu = input.nextLine();

                    sepatu.setBahanSepatu(bahanSepatu);

                    System.out.println("Berhasil mengupdate Bahan");
                }
                case 3 -> {
                    System.out.println("Tipe Sepatu : " + sepatu.getTipeSepatu());
                    System.out.print("Tipe Baru     : ");
                    String tipeSepatu = input.nextLine();

                    sepatu.setTipeSepatu(tipeSepatu);

                    System.out.println("Berhasil mengupdate Tipe");
                }
                case 4 -> {
                    System.out.println("Warna Sepatu : " + sepatu.getWarnaSepatu());
                    System.out.print("Warna Baru     : ");
                    String warnaSepatu = input.nextLine();

                    sepatu.setWarnaSepatu(warnaSepatu);

                    System.out.println("Berhasil mengupdate Warna");
                }
                case 5 -> {
                    System.out.println("Ukuran Sepatu : " + sepatu.getUkuranSepatu());
                    System.out.print("Ukuran Baru     : ");
                    int ukuranSepatu = input.nextInt();
                    input.nextLine();

                    sepatu.setUkuranSepatu(ukuranSepatu);

                    System.out.println("Berhasil mengupdate Ukuran");
                }
                case 6 -> {
                    System.out.println("Stok Produk : " + sepatu.getStok());
                    System.out.print("Stok Baru     : ");
                    int stokSepatu = input.nextInt();
                    input.nextLine();

                    sepatu.setStok(stokSepatu);

                    System.out.println("Berhasil mengupdate Stok");
                }
                default -> {
                    System.out.println("Pilihan tidak valid.");
                }
            }

        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }
    private void carisepatu(){
        System.out.println("\n ==============Seacrh Merk==============");
        System.out.println("Merk sepatu yang di cari ");
        String mrk= input.nextLine();
        Sepatu sepatu = Model.cariMerkSepatu(mrk);
        if(sepatu != null){
            System.out.println("\n Merek sepatu yang anda cari adalah: "+sepatu.getMerekSepatu());
        }
        else if(sepatu == null){
            System.out.println("\n Not found 404");
        }
        Model.cariMerkSepatu(mrk);

    }

    private void deleteData() {
        System.out.println("\n============ DELETE DATA ============");

        System.out.print("Masukan Kode Produk yang akan dihapus: ");
        String kodeProduk = input.nextLine();

        Sepatu sepatu = Model.cariByKodeProduk(kodeProduk);

        if (sepatu != null) {
            System.out.println("Apakah ingin menghapus produk dengan kode: " + sepatu.getKodeProduk() + " ? (y/n)");
            char konfirm = input.nextLine().charAt(0);

            if (konfirm == 'y') {
                Model.deleteData(sepatu);
            }
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }
    private void tambahadmin() {
        int id ;
        String Username,Password;
        System.out.println("\n============ TAMBAH ADMIN ============");
        System.out.println("Masukan id:");
        input.nextLine();
        System.out.println("Masukan Username:");
        Username = input.nextLine();
        System.out.println("Masukan Password:");
        Password = input.nextLine();
    }
}
