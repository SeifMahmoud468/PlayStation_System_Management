package Classes;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Printer {

    double bHeight = 0.0;
    String line;
    ArrayList<DrinksAndFood> itemList = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("0.00");
    double cash;


    public Printer(ArrayList<DrinksAndFood> itemList, double cash) {
        this.itemList.addAll(itemList);
        this.cash = cash;
    }

    public void print() {
        bHeight = itemList.size();
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new BillPrintable(), getPageFormat(pj));
        try {
            pj.print();

        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }

    public PageFormat getPageFormat(PrinterJob pj) {
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();
        double bodyHeight = bHeight;
        double headerHeight = 5.0;
        double footerHeight = 5.0;
        double width = cm_to_pp(9);
        double height = cm_to_pp(headerHeight + bodyHeight + footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height - cm_to_pp(1));
        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);
        
        return pf;
    }

    protected static double cm_to_pp(double cm) {
        return toPPI(cm * 0.393600787);
    }

    protected static double toPPI(double inch) {
        return inch * 72d;
    }

    public class BillPrintable implements Printable {

        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
                throws PrinterException {

            int r = itemList.size();
            ImageIcon icon = new ImageIcon("D:\\My Projects\\BolaPS\\Kick off.png");
            
            int result = NO_SUCH_PAGE;
            if (pageIndex == 0) {

                Graphics2D g2d = (Graphics2D) graphics;

                try {
                    int y = 20;
                    int yShift = 10;
                    int headerRectHeight = 20;
                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 10));
                    g2d.drawImage(icon.getImage(), 70, 10, 120, 50, null);y+=yShift+30;
                    g2d.drawString("--------------------------------------------", 12, y);
                    g2d.setFont(new Font("Arial", Font.BOLD, 12));
                    y += headerRectHeight;
                    g2d.drawString("            Kick Of Play Station and Cafe   \n\n", 12, y);
                    y += yShift;
                    g2d.setFont(new Font("Monospaced", Font.BOLD, 11));
                    line = "كشف حساب               ";                    
                    g2d.drawString(line, 12, y);
                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 10));
                    y += headerRectHeight;
                    g2d.drawString("------------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString("منتجات                            السعر ", 10, y);
                    y += yShift;
                    g2d.drawString("------------------------------------------", 10, y);
                    y += headerRectHeight;
                    for (int s = r - 1; s >= 0; s--) {
                        DrinksAndFood ex = itemList.get(s);
                        line = ex.getName() + "                   ";
                        if (ex.getName().length() < 15) {
                            int x = 15 - ex.getName().length();
                            switch (x) {
                                case 1:
                                    line = line + " ";
                                    break;
                                case 2:
                                    line = line + "  ";
                                    break;
                                case 3:
                                    line = line + "   ";
                                    break;
                                case 4:
                                    line = line + "    ";
                                    break;
                                case 5:
                                    line = line + "     ";
                                    break;
                                case 6:
                                    line = line + "      ";
                                    break;
                                case 7:
                                    line = line + "       ";
                                    break;
                                case 8:
                                    line = line + "        ";
                                    break;
                                case 9:
                                    line = line + "         ";
                                    break;
                                case 10:
                                    line = line + "          ";
                                    break;
                                case 11:
                                    line = line + "           ";
                                    break;
                                case 12:
                                    line = line + "            ";
                                    break;
                            }
                        }
                        line = line + df.format(ex.getValue())+" ";
                        g2d.drawString(line, 10, y);
                        y += yShift;
                    }
                    g2d.drawString("------------------------------------------", 10, y);
                    y += yShift;
                    line = "الاجمالي                           ";
                    line = line + df.format(cash)+" ";
                    g2d.drawString(line, 10, y);
                    y += yShift;
                    g2d.drawString("******************************************", 10, y);
                    y += yShift;
                    line ="شكرا لتعاملكم معنا           ";
                    g2d.drawString(line, 10, y);
                    y += yShift;
                    g2d.drawString("********************************************", 10, y);
                    y += yShift;
                    g2d.drawString("        SOFTWARE BY: Seif Mahmoud          ", 10, y);
                    y += yShift;
                    g2d.drawString("          CONTACT: 01286029500       ", 10, y);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                result = PAGE_EXISTS;
            }
            return result;
        }
    }
}
