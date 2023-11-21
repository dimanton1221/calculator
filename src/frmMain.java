
import java.awt.Toolkit;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import source.BalancedParenthensies;
import source.ReInToPre;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




/*
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Calculator_icon.png")));
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        PrefixText = new javax.swing.JTextField();
        PostfixText = new javax.swing.JTextField();
        InfixText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnPI = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnPower = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnLn = new javax.swing.JButton();
        btnLP = new javax.swing.JButton();
        btnRP = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSquare = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnTimes = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        rdbRadian = new javax.swing.JRadioButton();
        rdbDegree = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        LBLResult = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jButton9.setText("jButton4");

        PrefixText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrefixText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrefixTextActionPerformed(evt);
            }
        });

        PostfixText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PostfixText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostfixTextActionPerformed(evt);
            }
        });

        InfixText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        InfixText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfixTextActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPI.setBackground(new java.awt.Color(76, 95, 101));
        btnPI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPI.setText("PI");
        btnPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIActionPerformed(evt);
            }
        });
        jPanel2.add(btnPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 36, 79, -1));

        btnSin.setBackground(new java.awt.Color(76, 95, 101));
        btnSin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });
        jPanel2.add(btnSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 36, 79, -1));

        btnCos.setBackground(new java.awt.Color(76, 95, 101));
        btnCos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });
        jPanel2.add(btnCos, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 36, 79, -1));

        btnTan.setBackground(new java.awt.Color(76, 95, 101));
        btnTan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });
        jPanel2.add(btnTan, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 36, 79, -1));

        btnPower.setBackground(new java.awt.Color(76, 95, 101));
        btnPower.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPower.setText("^");
        btnPower.setToolTipText("");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });
        jPanel2.add(btnPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 8, 79, -1));

        btnLog.setBackground(new java.awt.Color(76, 95, 101));
        btnLog.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLog.setText("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        jPanel2.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 64, 79, -1));

        btnLn.setBackground(new java.awt.Color(76, 95, 101));
        btnLn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLn.setText("ln");
        btnLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLnActionPerformed(evt);
            }
        });
        jPanel2.add(btnLn, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 64, 79, -1));

        btnLP.setBackground(new java.awt.Color(76, 95, 101));
        btnLP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLP.setText("(");
        btnLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLPActionPerformed(evt);
            }
        });
        jPanel2.add(btnLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 64, 79, -1));

        btnRP.setBackground(new java.awt.Color(76, 95, 101));
        btnRP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRP.setText(")");
        btnRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRPActionPerformed(evt);
            }
        });
        jPanel2.add(btnRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 64, 79, -1));

        btnAC.setBackground(new java.awt.Color(255, 0, 0));
        btnAC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAC.setText("AC");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });
        jPanel2.add(btnAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 92, 79, -1));

        btnDelete.setBackground(new java.awt.Color(51, 204, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 92, 79, -1));

        btnSquare.setBackground(new java.awt.Color(132, 154, 165));
        btnSquare.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSquare.setText("√");
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });
        jPanel2.add(btnSquare, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 92, 79, -1));

        btnDivision.setBackground(new java.awt.Color(132, 154, 165));
        btnDivision.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDivision.setText("÷");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 92, 79, -1));

        btn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 120, 79, -1));

        btn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn8.setText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 120, 79, -1));

        btn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 120, 79, -1));

        btnTimes.setBackground(new java.awt.Color(132, 154, 165));
        btnTimes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTimes.setText("×");
        btnTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimesActionPerformed(evt);
            }
        });
        jPanel2.add(btnTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 120, 79, -1));

        btn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 148, 79, -1));

        btn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 148, 79, -1));

        btn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 148, 79, -1));

        btnMinus.setBackground(new java.awt.Color(132, 154, 165));
        btnMinus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        jPanel2.add(btnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 148, 79, -1));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 176, 79, -1));

        btn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 176, 79, -1));

        btn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 176, 79, -1));

        btnPlus.setBackground(new java.awt.Color(132, 154, 165));
        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        jPanel2.add(btnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 176, 79, -1));

        btnE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnE.setText("e");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        jPanel2.add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 204, 79, -1));
        btnE.getAccessibleContext().setAccessibleDescription("");

        btn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 204, 79, -1));

        btnPoint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPoint.setText(".");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });
        btnPoint.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                btnPointVetoableChange(evt);
            }
        });
        jPanel2.add(btnPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 204, 79, -1));

        btnEqual.setBackground(new java.awt.Color(38, 234, 185));
        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        jPanel2.add(btnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 204, 79, -1));

        buttonGroup1.add(rdbRadian);
        rdbRadian.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbRadian.setText("rad");
        jPanel2.add(rdbRadian, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 8, 79, -1));

        buttonGroup1.add(rdbDegree);
        rdbDegree.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbDegree.setSelected(true);
        rdbDegree.setText("deg");
        rdbDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbDegreeActionPerformed(evt);
            }
        });
        jPanel2.add(rdbDegree, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 8, 79, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 350, 330));

        jPanel3.setLayout(null);

        LBLResult.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        LBLResult.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        LBLResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBLResultActionPerformed(evt);
            }
        });
        jPanel3.add(LBLResult);
        LBLResult.setBounds(10, 10, 330, 60);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 200));

        jMenu1.setText("View");

        jMenuItem1.setText("Plain");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Flat");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("3D Theme");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed

         // TODO add your handling code here:
    BalancedParenthensies b = new BalancedParenthensies();
    Calculate c = new Calculate();
    ReInToPre pre = new ReInToPre();
    String text = LBLResult.getText();
    final JFrame parent = new JFrame();

    if (!"".equals(text)) {
        if (b.balancedParenthensies(text)) {

            Scanner input = new Scanner(System.in);
            for (int i = 0; i < text.length(); i++) {

                String operator = "";
                int count = 0;
                while (i < text.length() && Character.isLetter(text.charAt(i))) {

                    operator += String.valueOf(text.charAt(i));

                    i++;
                    count++;
                }

                if (count == 1) {
                    i--;

                    char currentChar = text.charAt(i);

                    // Tambahkan kondisi untuk mengecek jika karakter adalah 'a'
                    if (currentChar != 'a') {
                        String d = JOptionPane.showInputDialog(parent, "Enter a number as " + String.valueOf(currentChar), null);
                        text = text.replaceAll(String.valueOf(currentChar), d);
                        System.out.println(text);
                        System.out.println(text.length());
                    }
                }
            }

            InfixText.setText("Infix = " + text);
            PostfixText.setText(c.InToPoText(text));
            PrefixText.setText(pre.InToPoText(text));
            LBLResult.setText(c.Evaluation(text, rdbDegree.isSelected()));
        } else {
            InfixText.setText("Incorrect parentheses.");
        }
    }
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnPointVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_btnPointVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPointVetoableChange

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+".");
    }//GEN-LAST:event_btnPointActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+ Math.E);
    }//GEN-LAST:event_btnEActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"+");
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"-");
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimesActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"×");
    }//GEN-LAST:event_btnTimesActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"÷");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"sqrt(");//√
    }//GEN-LAST:event_btnSquareActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String text = LBLResult.getText();
        
        if (!"".equals(text)){
            if (text.length() < 3){
                LBLResult.setText(text.substring(0,text.length()-1));
            }
            else if (text.length() == 3) {
                String textLn = text.substring(text.length()-3,text.length());
                if(textLn.equals("ln(")){
                    LBLResult.setText(text.substring(0,text.length()-3));
                }
                else {
                    LBLResult.setText(text.substring(0,text.length()-1));
                }
            }

            else if (text.length() == 4) {
                String textLn = text.substring(text.length()-3,text.length());
                String textSin = text.substring(text.length()-4,text.length());
                if(textLn.equals("ln(")){
                    LBLResult.setText(text.substring(0,text.length()-3));
                }
                else if(textSin.equals("sin(") || textSin.equals("cos(") || textSin.equals("tan(") || textSin.equals("log(")){
                    LBLResult.setText(text.substring(0,text.length()-4));
                }
                else {
                    LBLResult.setText(text.substring(0,text.length()-1));
                }
            }

            else if (text.length() > 4 && text.length() < 17) {
                String textLn = text.substring(text.length()-3,text.length());
                String textSin = text.substring(text.length()-4,text.length());
                String textSqrt = text.substring(text.length()-5,text.length());
                if(textSqrt.equals("sqrt(")){
                    LBLResult.setText(text.substring(0,text.length()-5));
                }
                else if(textLn.equals("ln(")){
                    LBLResult.setText(text.substring(0,text.length()-3));
                }
                else if(textSin.equals("sin(") || textSin.equals("cos(") || textSin.equals("tan(") || textSin.equals("log(")){
                    LBLResult.setText(text.substring(0,text.length()-4));
                }
                else {
                    LBLResult.setText(text.substring(0,text.length()-1));
                }
            }

            else {
                String textLn = text.substring(text.length()-3,text.length());
                String textSin = text.substring(text.length()-4,text.length());
                String textSqrt = text.substring(text.length()-5,text.length());
                String textPI = text.substring(text.length()-17,text.length());
                if(textSqrt.equals("sqrt(")){
                    LBLResult.setText(text.substring(0,text.length()-5));
                }
                else if(textLn.equals("ln(")){
                    LBLResult.setText(text.substring(0,text.length()-3));
                }
                else if(textSin.equals("sin(") || textSin.equals("cos(") || textSin.equals("tan(") || textSin.equals("log(")){
                    LBLResult.setText(text.substring(0,text.length()-4));
                }
                else if(textPI.equals("3.141592653589793") || textPI.equals("2.718281828459045")){
                    LBLResult.setText(text.substring(0,text.length()-17));
                }
                else {
                    LBLResult.setText(text.substring(0,text.length()-1));
                }
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        // TODO add your handling code here:
        LBLResult.setText("");
        InfixText.setText("");
        PostfixText.setText("");
        PrefixText.setText("");
    }//GEN-LAST:event_btnACActionPerformed

    private void btnRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRPActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+")");
    }//GEN-LAST:event_btnRPActionPerformed

    private void btnLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLPActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"(");
    }//GEN-LAST:event_btnLPActionPerformed

    private void btnLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLnActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"ln(");
    }//GEN-LAST:event_btnLnActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"log(");
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"^");
    }//GEN-LAST:event_btnPowerActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"tan(");
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"cos(");
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+"sin(");
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIActionPerformed
        // TODO add your handling code here:
        LBLResult.setText(LBLResult.getText()+Math.PI);//2.71828183
    }//GEN-LAST:event_btnPIActionPerformed

    private void LBLResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBLResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LBLResultActionPerformed

    private void rdbDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbDegreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbDegreeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                
                SwingUtilities.updateComponentTreeUI(this);
                pack();

            }
            catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        try {

            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
            pack();

            }
            catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try {

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
            pack();

            }
            catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void PrefixTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrefixTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrefixTextActionPerformed

    private void PostfixTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostfixTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PostfixTextActionPerformed

    private void InfixTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfixTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfixTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
//        try {
//            
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
       
        

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
            catch(Exception e){e.printStackTrace();}
        
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InfixText;
    private javax.swing.JTextField LBLResult;
    private javax.swing.JTextField PostfixText;
    private javax.swing.JTextField PrefixText;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnLP;
    private javax.swing.JButton btnLn;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnPI;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnPower;
    private javax.swing.JButton btnRP;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnTimes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rdbDegree;
    private javax.swing.JRadioButton rdbRadian;
    // End of variables declaration//GEN-END:variables
}
