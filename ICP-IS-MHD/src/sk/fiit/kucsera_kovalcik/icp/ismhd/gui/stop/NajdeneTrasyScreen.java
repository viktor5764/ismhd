package sk.fiit.kucsera_kovalcik.icp.ismhd.gui.stop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class NajdeneTrasyScreen extends JFrame {

    private JPanel contentPane;
    private JLabel lbZochova;
    private JLabel label;
    private JLabel lbNewLabel;
    private JButton bPodrobnosti;
    private JButton bSpat;
    private JTable table;
    private JLabel lbLinka;
    private JLabel lbSmer;
    private JLabel lbas;
    private JLabel lbPrchod;
    private JLabel lbPoetPrestupov;
    private JLabel lbZochovast;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NajdeneTrasyScreen frame = new NajdeneTrasyScreen();
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
    public NajdeneTrasyScreen() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbZochova = new JLabel("N\u00E1jden\u00E9 trasy");
        lbZochova.setOpaque(true);
        lbZochova.setHorizontalAlignment(SwingConstants.CENTER);
        lbZochova.setHorizontalTextPosition(SwingConstants.CENTER);
        lbZochova.setForeground(Color.BLUE);
        lbZochova.setFont(new Font("Arial", Font.PLAIN, 38));
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
        lbNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lbNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
        lbNewLabel.setBounds(463, 0, 171, 65);
        lbNewLabel.setBackground(new Color(255, 204, 153));
        contentPane.add(lbNewLabel);
        
        bPodrobnosti = new JButton("Podrobnosti");
        bPodrobnosti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NajdeneTrasyScreen.this.dispose();
                NajdeneTrasyScreen.this.setVisible(false);
                PodrobnostiTrasyScreen scr = new PodrobnostiTrasyScreen();
                scr.setVisible(true);
            }
        });
        bPodrobnosti.setEnabled(false);
        bPodrobnosti.setHorizontalTextPosition(SwingConstants.CENTER);
        bPodrobnosti.setFont(new Font("Arial", Font.BOLD, 17));
        bPodrobnosti.setAlignmentX(0.5f);
        bPodrobnosti.setBounds(483, 399, 133, 49);
        contentPane.add(bPodrobnosti);
        
        bSpat = new JButton("<html><center>Sp\u00E4\u0165<br></center></html>");
        bSpat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NajdeneTrasyScreen.this.dispose();
                NajdeneTrasyScreen.this.setVisible(false);
                VyhladanieTrasyScreen scr = new VyhladanieTrasyScreen();
                scr.setVisible(true);
            }
        });
        bSpat.setHorizontalTextPosition(SwingConstants.CENTER);
        bSpat.setFont(new Font("Arial", Font.BOLD, 17));
        bSpat.setAlignmentX(0.5f);
        bSpat.setBounds(9, 399, 114, 49);
        contentPane.add(bSpat);
        
        table = new JTable(){
            private TableCellRenderer renderer = new CenteredTableCellRenderer();
            

            public TableCellRenderer getCellRenderer(int row, int column) {
                return renderer;
            }
            
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
                    c.setBackground(Color.BLUE);
                    c.setForeground(Color.WHITE);
                    //c.setBackground(UIManager.getColor("Table.selectionBackground"));
                    //c.setForeground(UIManager.getColor("Table.selectionForeground"));
                }
                return c;
            }
        };
        table.setShowVerticalLines(false);
        table.setRowMargin(2);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setFocusable(false);
        table.setRequestFocusEnabled(false);
        table.setRowHeight(40);
        table.setBackground(new Color(255, 204, 153));
        table.setBorder(new LineBorder(Color.BLUE, 2, true));
        table.setFont(new Font("Tahoma", Font.PLAIN, 17));
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e){
                bPodrobnosti.setEnabled(true);
            }
        });
        table.setModel(new DefaultTableModel(
            new Object[][] {
                {"13:46", "14:02", "16 min\u00FAt", "0", "31"},
                {"13:46", "14:03", "17 min\u00FAt", "1", "31, 39"},
                {"13:48", "14:09", "21 min\u00FAt", "2", "32, 50, 83"},
                {"13:52", "14:08", "16 min\u00FAt", "0", "31"},
                {"13:52", "14:09", "17 min\u00FAt", "1", "31, 39"},
                {"14:00", "14:21", "21 min\u00FAt", "2", "32, 50, 83"},
            },
            new String[] {
                "Odchod", "Pr\u00EDchod", "D\u013A\u017Eka cesty", "Prestupy", "Pou\u017Eit\u00E9 linky"
            }
        ) {
            Class[] columnTypes = new Class[] {
                String.class, String.class, String.class, String.class, String.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        table.getColumnModel().getColumn(0).setPreferredWidth(45);
        table.getColumnModel().getColumn(1).setPreferredWidth(57);
        table.getColumnModel().getColumn(2).setPreferredWidth(77);
        table.getColumnModel().getColumn(3).setPreferredWidth(20);
        table.getColumnModel().getColumn(4).setPreferredWidth(133);
        table.setBounds(6, 147, 621, 240);
        contentPane.add(table);
        
        lbLinka = new JLabel("Odchod");
        lbLinka.setHorizontalAlignment(SwingConstants.CENTER);
        lbLinka.setFont(new Font("Arial", Font.PLAIN, 22));
        lbLinka.setBounds(10, 121, 89, 24);
        contentPane.add(lbLinka);
        
        lbSmer = new JLabel("D\u013A\u017Eka cesty");
        lbSmer.setHorizontalAlignment(SwingConstants.CENTER);
        lbSmer.setFont(new Font("Arial", Font.PLAIN, 22));
        lbSmer.setBounds(225, 121, 122, 24);
        contentPane.add(lbSmer);
        
        lbas = new JLabel("Pou\u017Eit\u00E9 linky");
        lbas.setHorizontalAlignment(SwingConstants.CENTER);
        lbas.setFont(new Font("Arial", Font.PLAIN, 22));
        lbas.setBounds(455, 121, 144, 24);
        contentPane.add(lbas);
        
        lbPrchod = new JLabel("Pr\u00EDchod");
        lbPrchod.setHorizontalAlignment(SwingConstants.CENTER);
        lbPrchod.setFont(new Font("Arial", Font.PLAIN, 22));
        lbPrchod.setBounds(118, 121, 89, 24);
        contentPane.add(lbPrchod);
        
        lbPoetPrestupov = new JLabel("Prestupy");
        lbPoetPrestupov.setHorizontalAlignment(SwingConstants.CENTER);
        lbPoetPrestupov.setFont(new Font("Arial", Font.PLAIN, 22));
        lbPoetPrestupov.setBounds(351, 121, 93, 24);
        contentPane.add(lbPoetPrestupov);
        
        lbZochovast = new JLabel("Zochova \u2192 \u017DST Nov\u00E9 Mesto");
        lbZochovast.setForeground(Color.BLUE);
        lbZochovast.setFont(new Font("Arial", Font.BOLD, 27));
        lbZochovast.setHorizontalTextPosition(SwingConstants.CENTER);
        lbZochovast.setHorizontalAlignment(SwingConstants.CENTER);
        lbZochovast.setBounds(9, 78, 597, 31);
        contentPane.add(lbZochovast);
    }
    
    private class CenteredTableCellRenderer extends DefaultTableCellRenderer {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel renderedLabel = (JLabel) super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
                renderedLabel.setHorizontalAlignment(SwingConstants.CENTER);
                return renderedLabel;
        }
    };
}