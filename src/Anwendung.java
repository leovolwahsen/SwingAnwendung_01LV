import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anwendung extends JFrame{
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnClick;

    public Anwendung() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick , "Hallo, " + txtName.getText());
            }
        });
    }

    public static void main(String[] args) {
        Anwendung h=new Anwendung();
        h.setContentPane(h.panelMain);
        h.setTitle("Hallo");
        h.setBounds(650,100,600,150);
        // h.setSize(300,400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
