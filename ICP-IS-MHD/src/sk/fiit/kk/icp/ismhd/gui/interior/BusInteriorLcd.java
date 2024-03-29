package sk.fiit.kk.icp.ismhd.gui.interior;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class BusInteriorLcd extends JFrame {

    private JPanel contentPane;
    private JLabel lbZochova;
    private JLabel label;
    private JLabel lbNewLabel;
    private JLabel label_1;
    private JLabel lblChatamSfer;
    private JLabel lblZochova;
    private JLabel lblParkKultry;
    private JLabel lblParkKultry_1;
    private JLabel lbAprl;
    private JLabel lbNewLabel_1;
    private JPanel panel_1;
    private JLabel lbNewLabel_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BusInteriorLcd frame = new BusInteriorLcd();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public BusInteriorLcd() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbZochova = new JLabel("<html>\r\n<center>\r\nCintor\u00EDn Sl\u00E1vi\u010Die<br>\r\n\u00FAdolie\r\n</center>\r\n</html>");
        lbZochova.setOpaque(true);
        lbZochova.setHorizontalAlignment(SwingConstants.CENTER);
        lbZochova.setHorizontalTextPosition(SwingConstants.CENTER);
        lbZochova.setForeground(new Color(0, 0, 128));
        lbZochova.setFont(new Font("Arial", Font.BOLD, 40));
        lbZochova.setBorder(new LineBorder(new Color(0, 0, 128), 2));
        lbZochova.setBackground(Color.WHITE);
        lbZochova.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbZochova.setBounds(119, 0, 373, 84);
        contentPane.add(lbZochova);
        
        label = new JLabel("13:42");
        label.setForeground(new Color(255, 255, 255));
        label.setBackground(new Color(0, 0, 128));
        label.setOpaque(true);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBorder(new LineBorder(new Color(0, 0, 128), 2));
        label.setFont(new Font("Arial", Font.PLAIN, 56));
        label.setBounds(489, 0, 145, 84);
        contentPane.add(label);
        
        lbNewLabel = new JLabel("31");
        lbNewLabel.setForeground(new Color(255, 255, 255));
        lbNewLabel.setBackground(new Color(0, 0, 128));
        lbNewLabel.setOpaque(true);
        lbNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lbNewLabel.setBorder(new LineBorder(new Color(0, 0, 128), 2));
        lbNewLabel.setFont(new Font("Arial", Font.PLAIN, 90));
        lbNewLabel.setBounds(0, 0, 121, 84);
        contentPane.add(lbNewLabel);
        
        lblChatamSfer = new JLabel("Chatam S\u00F3fer   3 min");
        lblChatamSfer.setBackground(Color.WHITE);
        lblChatamSfer.setHorizontalAlignment(SwingConstants.CENTER);
        lblChatamSfer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
        lblChatamSfer.setForeground(new Color(0, 153, 0));
        lblChatamSfer.setOpaque(true);
        lblChatamSfer.setFont(new Font("Dialog", Font.BOLD, 50));
        lblChatamSfer.setBounds(12, 243, 545, 64);
        contentPane.add(lblChatamSfer);
        
        lblZochova = new JLabel("Zochova   -1 min");
        lblZochova.setForeground(new Color(255, 0, 0));
        lblZochova.setHorizontalAlignment(SwingConstants.CENTER);
        lblZochova.setFont(new Font("Dialog", Font.BOLD, 30));
        lblZochova.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblZochova.setOpaque(true);
        lblZochova.setBounds(88, 356, 269, 34);
        contentPane.add(lblZochova);
        
        lblParkKultry = new JLabel("Park kult\u00FAry   4 min");
        lblParkKultry.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblParkKultry.setOpaque(true);
        lblParkKultry.setHorizontalAlignment(SwingConstants.CENTER);
        lblParkKultry.setFont(new Font("Dialog", Font.BOLD, 30));
        lblParkKultry.setBounds(99, 161, 312, 34);
        contentPane.add(lblParkKultry);
        
        lblParkKultry_1 = new JLabel("Lafranconi   7 min");
        lblParkKultry_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblParkKultry_1.setOpaque(true);
        lblParkKultry_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblParkKultry_1.setFont(new Font("Dialog", Font.BOLD, 20));
        lblParkKultry_1.setBounds(250, 111, 207, 27);
        contentPane.add(lblParkKultry_1);
        
        panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 0, 128));
        panel_1.setBorder(new LineBorder(new Color(0, 0, 128), 2));
        panel_1.setBounds(0, 420, 633, 33);
        contentPane.add(panel_1);
        panel_1.setLayout(new GridLayout(0, 3, 0, 0));
        
        lbAprl = new JLabel("25. apr\u00EDl 2015");
        lbAprl.setHorizontalAlignment(SwingConstants.CENTER);
        lbAprl.setForeground(Color.WHITE);
        panel_1.add(lbAprl);
        lbAprl.setFont(new Font("SansSerif", Font.PLAIN, 22));
        
        lbNewLabel_1 = new JLabel("Pondelok");
        lbNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lbNewLabel_1.setForeground(Color.WHITE);
        panel_1.add(lbNewLabel_1);
        lbNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 22));
        
        lbNewLabel_2 = new JLabel("22 \u00B0C");
        panel_1.add(lbNewLabel_2);
        lbNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lbNewLabel_2.setForeground(Color.WHITE);
        lbNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        
        label_1 = new JLabel("");
        label_1.setFont(new Font("Dialog", Font.BOLD, 50));
        label_1.setIcon(new ImageIcon(BusInteriorLcd.class.getResource("/sk/fiit/kk/icp/ismhd/arrow.png")));
        label_1.setBounds(92, 80, 628, 481);
        contentPane.add(label_1);
        
     // vycentrovanie okna na stred obrazovky
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension window = this.getSize();
        int x = (screen.width - window.width) / 2;
        int y = (screen.height - window.height) / 2;
        this.setLocation(x, y);
        
        Timer timer = new Timer(1000, new ActionListener() {
            private final String[] timeStrings = {
                "13:42", "13 42"
            };
            private int i;

            @Override
            public void actionPerformed(ActionEvent e) {
                i = (i + 1) % timeStrings.length;
                label.setText(timeStrings[i]);
                
            }
        });
        timer.setInitialDelay(1000);
        timer.start();
    }
}
