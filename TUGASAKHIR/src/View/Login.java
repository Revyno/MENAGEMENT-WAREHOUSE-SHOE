package View;
import Controller.*;
import Entity.Orang;
import Model.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Login extends Frame {

    private JLabel label1, label2, label3, label4;
    private JTextField text1;
    private JPasswordField pass1;
    JDesktopPane line;
    JCheckBox lockCheckBox;
    private JButton button1, button2, adminlogo;
    int checkMemberAdmin;
    SepatuController sepatuController;


    public Login() {
        super("Login akun", 600, 400);
        setLayout(null);
        setVisible(true);
        sepatuController=new SepatuController();
        createBG();
        createPhoto();
    }


    @Override
    protected void component() {
        label1 = new JLabel("Username");
        label1.setBounds(318, 97, 165, 19);
        label1.setFont(new FontUIResource("poppinsBOLD", Font.BOLD, 12));
        label1.setForeground(new ColorUIResource(0xFFFFFF));
        label1.setBackground(Color.white);
        label2 = new JLabel("Password");
        label2.setFont(new FontUIResource("poppinsBOLD", Font.BOLD, 12));
        label2.setForeground(new ColorUIResource(0xFFFFFF));
        label2.setBounds(318, 191, 165, 19);
        label4 = new JLabel("LOGIN");
        label4.setFont(new FontUIResource("poppinsBOLD", Font.BOLD, 20));
        label4.setForeground(new ColorUIResource(0xFFFFFF));
        label4.setBounds(318, 35, 238, 39);
        add(label1);
        add(label2);
        add(label4);
        text1 = new JTextField();
        text1.setBounds(318, 116, 228, 37);
        pass1 = new JPasswordField();
        pass1.setBounds(318, 212, 228, 37);
        add(text1);
        add(pass1);
        button1 = new JButton("Login");
        button1.setBounds(336, 287, 133, 22);
        button1.setForeground(new ColorUIResource(0x1F1D1D));
        button1.setBackground(new ColorUIResource(0xBFCFE7));
        add(button1);
        ImageIcon iconLock = new ImageIcon("./src/resourceImage/lock.png");
        Image imglock;
        imglock = iconLock.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        iconLock = new ImageIcon(imglock);
        lockCheckBox = new JCheckBox();
        lockCheckBox.setBackground(Color.white);
        lockCheckBox.setIcon(iconLock);
        lockCheckBox.setForeground(Color.black);
        lockCheckBox.setBorder(new LineBorder(Color.white));
        lockCheckBox.setBounds(1070, 270, 20, 20);
        lockCheckBox.setFocusPainted(false);
        add(lockCheckBox);

        line = new JDesktopPane();
        line.setBackground(new ColorUIResource(0x19527F));
        line.setBounds(800, 235, 300, 3);
        add(line);
    }

    private void createBG() {
        ImageIcon BGG = new ImageIcon("C:\\Users\\DELL\\Downloads\\download (2).jpeg");
        label3 = new JLabel(new ImageIcon(BGG.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT)));
        label3.setBounds(0, 0, 600, 400);
        add(label3);
    }

    private void createPhoto() {
        JLabel labelpoto = new JLabel();
        ImageIcon photoprofil = new ImageIcon("C://Users//DELL//Downloads//nike-logo-39977.png");
        labelpoto.setIcon(new ImageIcon(photoprofil.getImage().getScaledInstance(200, 72, Image.SCALE_SMOOTH)));
        labelpoto.setHorizontalAlignment(SwingConstants.CENTER);
        labelpoto.setBounds(72, 153, 200, 72);
        add(labelpoto, photoprofil);

    }

    protected void event() {
        Model objekGudang = new Model();

        button1.addActionListener((e) -> {
            try {
                String username = String.valueOf(text1.getText());
                String password = String.valueOf(pass1.getPassword());
                Orang status = sepatuController.loginAdmin(username,password);
                if (status!=null) {
                    JOptionPane.showMessageDialog(null, "Selamat Datang", "Login Sukses",
                            JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new MenuAdminGui().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Valid", "Login Sukses",
                            JOptionPane.ERROR_MESSAGE);
                    dispose();
                    new Login().setVisible(true);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Masukkan Inputan Yang benar", "Login Sukses",
                        JOptionPane.ERROR_MESSAGE);
                dispose();
                new Login().setVisible(true);
            }

        });
    }

    public static void main(String[] args) {
        Login login = new Login();
    }
}
