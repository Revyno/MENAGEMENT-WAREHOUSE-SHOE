package Model;

import Entity.*;
import Entity.Sepatu;

import java.io.*;
import java.util.ArrayList;

public class Model implements  Model_interface {
    private  static ArrayList<Orang> orangList= new ArrayList<>();
    private static ArrayList<Sepatu> sepatuList = new ArrayList<>();
    private static final String filegudang = "gudang.txt";
    public static Orang loginAdmin(String username, String password) {
        orangList.add(new Orang(1, "revel", "123", "1"));

        for (Orang orang : orangList) {
            if (orang.getUsername().equals(username) && orang.getPassword().equals(password)) {
                return orang;
            }
        }
        return null;
    }

    @Override
    public void create(Sepatu Sepatu) {
    sepatuList.add(Sepatu);
    }

    @Override
    public void read() {

    }

    @Override
    public void delete() {

    }

    public static void loadfilegudang(){
        File file = new File(filegudang);
        if(file.exists()){
            try(ObjectInputStream inputStream = new java.io.ObjectInputStream(new FileInputStream(filegudang))){
                sepatuList = (ArrayList<Sepatu>) inputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    public static void dataAdmin(){
        orangList.add(new Orang(1, "revel", "123", "1"));
    }
    public  static ArrayList<Orang> allarraylisAdmin(){
        return orangList;
    }

    public static ArrayList<Sepatu> getSepatuList() {
        return sepatuList;
    }

    public static void tambahData(Produk produk) {
        sepatuList.add((Sepatu) produk);
    }

    public static void deleteData(Sepatu sepatu) {
        sepatuList.remove(sepatu);
    }

    public static Sepatu cariByKodeProduk(String kodeProduk) {
        for (Sepatu sepatu : sepatuList) {
            if (sepatu.getKodeProduk().equals(kodeProduk)) {
                return sepatu;
            }
        }

        return null;
    }
    public static Sepatu cariMerkSepatu(String mrk){
        for (Sepatu sepatu : sepatuList) {
            if (sepatu.getMerekSepatu().equals(mrk)) {
                return sepatu;
            }
        }

        return null;

    }


}
