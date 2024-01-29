package View;

import javax.swing.*;
import java.awt.*;

public class MenuAdminGui extends  Frame {
    private JLabel menu, tambah, view, search, viewmerk, lookmerk;
    private JButton tambahdata, lihatsepatu, carisepatu, carimerk, lihatmerk;
    JDesktopPane line;

    public MenuAdminGui() {
        super("Menu admin", 400, 700);
        setLayout(null);
        setVisible(true);
//        createPhoto();
    }

    @Override
    protected void component() {
        menu = new JLabel("MENU");
        menu.setBounds(150, 82, 195, 89);
        menu.setFont(new Font("button 1", Font.BOLD, 36));
        menu.setForeground(Color.DARK_GRAY);
        tambahdata = new JButton("Lihat Data");
        tambahdata.setBounds(119, 260, 160, 50);
        tambahdata.setFont(new Font("button 2", Font.BOLD, 20));
        tambahdata.setForeground(Color.DARK_GRAY);
        tambahdata.setBackground(Color.WHITE);
        lihatsepatu = new JButton("Tambah data");
        lihatsepatu.setBounds(119, 214, 158, 38);
        lihatsepatu.setFont(new Font("button 3", Font.BOLD, 20));
        lihatsepatu.setForeground(Color.DARK_GRAY);
        lihatsepatu.setBackground( Color.WHITE);
        carisepatu = new JButton("CARI DATA SEPATU");
        carisepatu.setBounds(90, 323, 230, 51);
        carisepatu.setFont(new Font("button 4", Font.BOLD, 20));
        carisepatu.setForeground(Color.DARK_GRAY);
        carisepatu.setBackground(Color.WHITE);
        carimerk = new JButton("Keluar");
        carimerk.setBounds(103, 396, 211, 37);
        carimerk.setFont(new Font("Button 5", Font.BOLD, 20));
        carimerk.setForeground(Color.DARK_GRAY);
        carimerk.setBackground(Color.WHITE);
        add(menu);
        add(tambahdata);
        add(lihatsepatu);
        add(carisepatu);
        add(carimerk);
    }
//    private void createPhoto(){
//        JLabel labelpoto = new JLabel();
//        ImageIcon photoprofil = new ImageIcon("C:\\Users\\DELL\\Downloads\\PLATOS.jpg");
//        labelpoto.setIcon(new ImageIcon(photoprofil.getImage().getScaledInstance(405, 704, Image.SCALE_SMOOTH)));
//        labelpoto.setHorizontalAlignment(SwingConstants.CENTER);
//        labelpoto.setBounds(0, 300, 405, 500);
//        add(labelpoto, photoprofil);
//    }

    @Override
    protected void event() {
        tambahdata.addActionListener((e) -> {
            dispose();
            new AdminDatabaseGui().setVisible(true);
        });

        lihatsepatu.addActionListener((e) -> {
            dispose();
            new Login().setVisible(true);
        });

        carisepatu.addActionListener((e) -> {
            dispose();
            new Login().setVisible(true);
        });
        carimerk.addActionListener((e) -> {
            dispose();
            new Login().setVisible(true);
        });
    }

    public static void main(String[] args) {
        MenuAdminGui menuAdminGui = new MenuAdminGui();
    }

}
