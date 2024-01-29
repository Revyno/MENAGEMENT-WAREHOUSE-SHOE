package View;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class AdminDatabaseGui extends  Frame{

    private JButton save,exit,back;
    private JTextField merksepatu,bahansepatu
            ,tipesepatu,ukuransepatu,hargasepatu;
    private JLabel kode,merk,bahan,tipe,ukuran,harga;
    public AdminDatabaseGui(){
        super("DATABASE ADMIN SEPATU",800,600);
        setLayout(null);
        setVisible(true);
    }

    @Override
    protected void component() {
        merksepatu = new JTextField();
        merksepatu.setBounds(77,113,207,38);
        bahansepatu = new JTextField();
        bahansepatu.setBounds(77,183,207,38);
        tipesepatu = new JTextField();
        tipesepatu.setBounds(77,252,207,38);
        ukuransepatu = new JTextField();
        ukuransepatu.setBounds(77,331,207,38);
        save = new JButton("Save");
        save.setBounds(54,421,111,56);
        exit = new JButton("Exit");
        exit.setBounds(197,421,111,56);
        back = new JButton("Back");
        back.setBounds(650,511,111,56);
        add(merksepatu);
        add(bahansepatu);
        add(tipesepatu);
        add(ukuransepatu);
        add(save);
        add(exit);
        add(back);
        merk = new JLabel("MASUKAN KODE SEPATU BARU");
        merk.setFont(new FontUIResource("poppinsBOLD", Font.BOLD,12));
        merk.setForeground(new ColorUIResource(0xFAFAFA));
        bahan = new JLabel("MASUKAN MEREK SEPATU");
        bahan.setFont(new FontUIResource("poppinsBOLD", Font.BOLD,12));
        bahan.setForeground(new ColorUIResource(0xFAFAFA));
        tipe = new JLabel("TIPE SEPATU");
        tipe.setFont(new FontUIResource("poppinsBOLD", Font.BOLD,12));
        tipe.setForeground(new ColorUIResource(0xFFFFFF));
        ukuran = new JLabel("UKURAN SEPATU");
        ukuran.setFont(new FontUIResource("poppinsBOLD", Font.BOLD,12));

    }

    @Override
    protected void event() {

    }

    public static void main(String[] args) {
        AdminDatabaseGui adminDatabaseGui =new AdminDatabaseGui();
    }
}
