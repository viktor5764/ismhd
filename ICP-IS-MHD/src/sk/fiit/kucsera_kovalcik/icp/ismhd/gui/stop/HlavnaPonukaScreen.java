package sk.fiit.kucsera_kovalcik.icp.ismhd.gui.stop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class HlavnaPonukaScreen extends JFrame {

    private static final long serialVersionUID = -2332388519311531223L;
    private JPanel contentPane;
    private JLabel lbZochova;
    private JLabel label;
    private JLabel lbNewLabel;
    private JButton bCestovnePoriadky;
    private JButton bVyhladatSpojenie;
    private JButton bMapa;
    private JButton bPomoc;
    private JButton bSk;
    private JButton bEn;
    private JButton bDe;
    private JButton bEs;
    private JButton bFr;
    private JTable table;
    private JLabel lbLinka;
    private JLabel lbSmer;
    private JLabel lbas;

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
            @Override
            public void run() {
                try {
                    HlavnaPonukaScreen frame = new HlavnaPonukaScreen();
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
    public HlavnaPonukaScreen() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbZochova = new JLabel("Zochova");
        lbZochova.setOpaque(true);
        lbZochova.setHorizontalAlignment(SwingConstants.CENTER);
        lbZochova.setHorizontalTextPosition(SwingConstants.CENTER);
        lbZochova.setForeground(Color.BLUE);
        lbZochova.setFont(new Font("Arial", Font.BOLD, 46));
        lbZochova.setBorder(new LineBorder(Color.BLUE, 2));
        lbZochova.setBackground(Color.WHITE);
        lbZochova.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbZochova.setBounds(204, 0, 256, 65);
        contentPane.add(lbZochova);
        
        label = new JLabel("13:42:05");
        label.setOpaque(true);
        label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        label.setFont(new Font("Arial", Font.PLAIN, 46));
        label.setBounds(0, 0, 201, 65);
        label.setBackground(new Color(255, 204, 153));
        contentPane.add(label);
        
        lbNewLabel = new JLabel("<html><center>22. apr\u00EDl 2015<br>\r\nPondelok<br>\r\n22\u00B0C</center></html>");
        lbNewLabel.setOpaque(true);
        lbNewLabel.setBackground(new Color(255, 204, 153));
        lbNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lbNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
        lbNewLabel.setBounds(463, 0, 171, 65);
        contentPane.add(lbNewLabel);
        
        bCestovnePoriadky = new JButton("<html><center>Cestovn\u00E9<br>poriadky</center></html>");
        bCestovnePoriadky.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HlavnaPonukaScreen.this.dispose();
                HlavnaPonukaScreen.this.setVisible(false);
                VyhladanieCpScreen scr = new VyhladanieCpScreen();
                scr.setVisible(true);                
            }
        });
        bCestovnePoriadky.setHorizontalTextPosition(SwingConstants.CENTER);
        bCestovnePoriadky.setAlignmentX(Component.CENTER_ALIGNMENT);
        bCestovnePoriadky.setFont(new Font("Arial", Font.BOLD, 17));
        bCestovnePoriadky.setBounds(9, 105, 123, 65);
        contentPane.add(bCestovnePoriadky);
        
        bVyhladatSpojenie = new JButton("<html><center>Vyh\u013Eada\u0165<br>spojenie</center></html>");
        bVyhladatSpojenie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VyhladanieTrasyScreen frame = new VyhladanieTrasyScreen();
                frame.setVisible(true);
                HlavnaPonukaScreen.this.dispose();
                HlavnaPonukaScreen.this.setVisible(false);
            }
        });
        bVyhladatSpojenie.setHorizontalTextPosition(SwingConstants.CENTER);
        bVyhladatSpojenie.setFont(new Font("Arial", Font.BOLD, 17));
        bVyhladatSpojenie.setAlignmentX(0.5f);
        bVyhladatSpojenie.setBounds(9, 181, 123, 65);
        contentPane.add(bVyhladatSpojenie);
        
        bMapa = new JButton("<html><center>Mapa<br></center></html>");
        bMapa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HlavnaPonukaScreen.this.dispose();
                HlavnaPonukaScreen.this.setVisible(false);
                MapaScreen scr = new MapaScreen();
                scr.setVisible(true);
            }
        });
        bMapa.setHorizontalTextPosition(SwingConstants.CENTER);
        bMapa.setFont(new Font("Arial", Font.BOLD, 17));
        bMapa.setAlignmentX(0.5f);
        bMapa.setBounds(9, 257, 123, 65);
        contentPane.add(bMapa);
        
        bPomoc = new JButton("<html><center>Pomoc<br></center></html>");
        bPomoc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HlavnaPonukaScreen.this.dispose();
                HlavnaPonukaScreen.this.setVisible(false);
                PomocScreen scr = new PomocScreen();
                scr.setVisible(true);
            }
        });
        bPomoc.setHorizontalTextPosition(SwingConstants.CENTER);
        bPomoc.setFont(new Font("Arial", Font.BOLD, 17));
        bPomoc.setAlignmentX(0.5f);
        bPomoc.setBounds(9, 333, 123, 65);
        contentPane.add(bPomoc);
        
        bSk = new JButton("");
        bSk.setIcon(new ImageIcon(HlavnaPonukaScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/flag_sk.GIF")));
        bSk.setBounds(135, 399, 97, 42);
        contentPane.add(bSk);
        
        bEn = new JButton("");
        bEn.setIcon(new ImageIcon(HlavnaPonukaScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/flag_en.GIF")));
        bEn.setBounds(231, 399, 97, 42);
        contentPane.add(bEn);
        
        bDe = new JButton("");
        bDe.setIcon(new ImageIcon(HlavnaPonukaScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/flag_de.GIF")));
        bDe.setBounds(328, 399, 97, 42);
        contentPane.add(bDe);
        
        bEs = new JButton("");
        bEs.setIcon(new ImageIcon(HlavnaPonukaScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/flag_es.GIF")));
        bEs.setBounds(425, 399, 97, 42);
        contentPane.add(bEs);
        
        bFr = new JButton("");
        bFr.setIcon(new ImageIcon(HlavnaPonukaScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/flag_fr.GIF")));
        bFr.setBounds(522, 399, 97, 42);
        contentPane.add(bFr);
        
        table = new JTable(){
            public void paint(Graphics g) {
                super.paint(g);
                paintEmptyRows(g);
            }

            /**
             * Paints the backgrounds of the implied empty rows when the
             * table model is insufficient to fill all the visible area
             * available to us. We don't involve cell renderers, because
             * we have no data.
             */
            protected void paintEmptyRows(Graphics g) {
                final int rowCount = getRowCount();
                final Rectangle clip = g.getClipBounds();
                if (rowCount * rowHeight < clip.height) {
                    for (int i = rowCount; i <= clip.height/rowHeight; ++i) {
                        g.setColor(colorForRow(i));
                        g.fillRect(clip.x, i * rowHeight, clip.width, rowHeight);
                    }
                }
            }

            /**
             * Changes the behavior of a table in a JScrollPane to be more like
             * the behavior of JList, which expands to fill the available space.
             * JTable normally restricts its size to just what's needed by its
             * model.
             */
            public boolean getScrollableTracksViewportHeight() {
                if (getParent() instanceof JViewport) {
                    JViewport parent = (JViewport) getParent();
                    return (parent.getHeight() > getPreferredSize().height);
                }
                return false;
            }

            /**
             * Returns the appropriate background color for the given row.
             */
            protected Color colorForRow(int row) {
                return (row % 2 == 0) ? Color.WHITE : getBackground();
            }

            /**
             * Shades alternate rows in different colors.
             */
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                if (isCellSelected(row, column) == false) {
                    c.setBackground(colorForRow(row));
                    c.setForeground(UIManager.getColor("Table.foreground"));
                } else {
                    c.setBackground(UIManager.getColor("Table.selectionBackground"));
                    c.setForeground(UIManager.getColor("Table.selectionForeground"));
                }
                return c;
            }
        };
        table.setFocusable(false);
        table.setRequestFocusEnabled(false);
        table.setShowGrid(false);
        table.setRowHeight(26);
        table.setBackground(new Color(255, 204, 153));
        table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        table.setFont(new Font("Tahoma", Font.PLAIN, 17));
        table.setModel(new DefaultTableModel(
            new Object[][] {
                {new Integer(84), null, "Ovsi\u0161te", null, "13:43"},
                {new Integer(31), null, "Cintor\u00EDn Sl\u00E1v. \u00FAdolie", null, "13:43"},
                {new Integer(93), null, "Petr\u017Ealka", null, "13:43"},
                {new Integer(94), null, "Petr\u017Ealka", null, "13:44"},
                {new Integer(93), null, "Petr\u017Ealka", null, "13:44"},
                {new Integer(83), null, "Kop\u010Dany", null, "13:45"},
                {new Integer(94), null, "Petr\u017Ealka", null, "13:45"},
                {new Integer(80), null, "Aupark", null, "13:46"},
                {new Integer(39), null, "Cintor\u00EDn Sl\u00E1v. \u00FAdolie", null, "13:47"},
                {new Integer(93), null, "Petr\u017Ealka", null, "13:48"},
                {null, null, null, null, null},
                {null, null, null, null, null},
            },
            new String[] {
                "Linka", "", "Smer", "", "\u010Cas"
            }
        ) {
            Class[] columnTypes = new Class[] {
                Integer.class, Object.class, String.class, Object.class, String.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        table.getColumnModel().getColumn(0).setPreferredWidth(46);
        table.getColumnModel().getColumn(1).setPreferredWidth(46);
        table.getColumnModel().getColumn(2).setPreferredWidth(133);
        table.getColumnModel().getColumn(3).setPreferredWidth(32);
        table.setRowSelectionAllowed(false);
        table.setBounds(153, 132, 460, 262);
        contentPane.add(table);
        
        lbLinka = new JLabel("Linka");
        lbLinka.setHorizontalAlignment(SwingConstants.CENTER);
        lbLinka.setFont(new Font("Arial", Font.PLAIN, 22));
        lbLinka.setBounds(171, 96, 89, 24);
        contentPane.add(lbLinka);
        
        lbSmer = new JLabel("Smer");
        lbSmer.setHorizontalAlignment(SwingConstants.CENTER);
        lbSmer.setFont(new Font("Arial", Font.PLAIN, 22));
        lbSmer.setBounds(304, 96, 89, 24);
        contentPane.add(lbSmer);
        
        lbas = new JLabel("\u010Cas");
        lbas.setHorizontalAlignment(SwingConstants.CENTER);
        lbas.setFont(new Font("Arial", Font.PLAIN, 22));
        lbas.setBounds(489, 96, 89, 24);
        contentPane.add(lbas);
    }
}
