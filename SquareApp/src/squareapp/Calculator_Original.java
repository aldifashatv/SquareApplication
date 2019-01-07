/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Calculator_Original.java
 *
 * Created on May 11, 2012, 12:45:07 PM
 */
package squareapp;

/**
 *
 * @author win7
 */
public class Calculator_Original extends javax.swing.JFrame {
    
    //Variables
    double plusminus;
    double firstDouble;
    double secondDouble;
    double totalDouble;
    //To check for Button Clicks
    int plusClick;
    int minusClick;
    int multiplyClick;
    int divideClick;
    int decimalClick;
    

    /** Creates new form Calculator_Original */
    public Calculator_Original() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        display = new javax.swing.JTextField();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        negative = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        square = new javax.swing.JButton();
        root = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Roundof = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        panel1.setBackground(new java.awt.Color(143, 142, 29));

        panel2.setBackground(new java.awt.Color(223, 224, 129));

        display.setBackground(new java.awt.Color(228, 249, 186));
        display.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        display.setForeground(new java.awt.Color(80, 69, 9));
        display.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        one.setBackground(new java.awt.Color(176, 164, 55));
        one.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(176, 164, 55));
        two.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(176, 164, 55));
        three.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(176, 164, 55));
        four.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(176, 164, 55));
        five.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(176, 164, 55));
        six.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(176, 164, 55));
        seven.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(176, 164, 55));
        eight.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(176, 164, 55));
        nine.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        negative.setBackground(new java.awt.Color(176, 164, 55));
        negative.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        negative.setText("-");
        negative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativeActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(176, 164, 55));
        zero.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        decimal.setBackground(new java.awt.Color(176, 164, 55));
        decimal.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(102, 102, 0));
        plus.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        plus.setText("Add");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(102, 102, 0));
        minus.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        minus.setText("Subtract");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(102, 102, 0));
        multiply.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        multiply.setText("Multiply");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(102, 102, 0));
        divide.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        divide.setText("Divide");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(20, 66, 40));
        equals.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        equals.setText("Equals");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        square.setBackground(new java.awt.Color(102, 102, 0));
        square.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        square.setText("Square");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        root.setBackground(new java.awt.Color(102, 102, 0));
        root.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        root.setText("Root");
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(65, 129, 51));
        clear.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        clear.setText("Reset");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(65, 129, 51));
        exit.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        Roundof.setBackground(new java.awt.Color(109, 154, 94));
        Roundof.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        Roundof.setText("~");
        Roundof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoundofActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                .addComponent(negative, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(equals, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(square, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(divide, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Roundof, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Roundof, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(negative, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
    secondDouble=(Double.parseDouble(String.valueOf(display.getText())));
    if(plusClick>0){
    totalDouble=firstDouble+secondDouble;
    display.setText(String.valueOf(totalDouble));
    firstDouble=0;
    secondDouble=0;
    plusClick=0;
    }
    if(minusClick>0){
    totalDouble=firstDouble-secondDouble;
    display.setText(String.valueOf(totalDouble));
    firstDouble=0;
    secondDouble=0;
    minusClick=0;
    }
    if(multiplyClick>0){
    totalDouble=firstDouble*secondDouble;
    display.setText(String.valueOf(totalDouble));
    firstDouble=0;
    secondDouble=0;
    multiplyClick=0;
    }
    if(divideClick>0){
    totalDouble=firstDouble/secondDouble;
    display.setText(String.valueOf(totalDouble));
    firstDouble=0;
    secondDouble=0;
    divideClick=0;
    }
    }//GEN-LAST:event_equalsActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
    display.setText("");
    decimalClick=0;
    }//GEN-LAST:event_clearActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
    display.setText(display.getText()+one.getText());
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
    display.setText(display.getText()+two.getText());
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
    display.setText(display.getText()+three.getText());
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
    display.setText(display.getText()+four.getText());
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
    display.setText(display.getText()+five.getText());
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
    display.setText(display.getText()+six.getText());
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
    display.setText(display.getText()+seven.getText());
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
    display.setText(display.getText()+eight.getText());
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
    display.setText(display.getText()+nine.getText());
    }//GEN-LAST:event_nineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
    display.setText(display.getText()+zero.getText());
    }//GEN-LAST:event_zeroActionPerformed

    private void negativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeActionPerformed
    plusminus=(Double.parseDouble(String.valueOf(display.getText())));
    plusminus=plusminus*(-1);
    display.setText(String.valueOf(plusminus));
    
    }//GEN-LAST:event_negativeActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
    if(decimalClick==0){
    display.setText(display.getText()+decimal.getText());
    decimalClick=1;
    }
    }//GEN-LAST:event_decimalActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
    firstDouble=(Double.parseDouble(String.valueOf(display.getText())));
    display.setText("");
    plusClick=1;
    decimalClick=0;
    
            
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
    firstDouble=(Double.parseDouble(String.valueOf(display.getText())));
    display.setText("");
    minusClick=1;
    decimalClick=0;
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
    firstDouble=(Double.parseDouble(String.valueOf(display.getText())));
    display.setText("");
    multiplyClick=1;
    decimalClick=0;
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
    firstDouble=(Double.parseDouble(String.valueOf(display.getText())));
    display.setText("");
    divideClick=1;
    decimalClick=0;
    }//GEN-LAST:event_divideActionPerformed

    private void RoundofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoundofActionPerformed
    double roundof,round;
    round=Double.parseDouble(display.getText());
    roundof=Math.round(round);
    display.setText(""+roundof);
    
    
    }//GEN-LAST:event_RoundofActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
    double num,square;
    num=Double.parseDouble(display.getText());
    square=num*num;
    display.setText(""+square);
    
    }//GEN-LAST:event_squareActionPerformed

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed
    double num,root;
    num=Double.parseDouble(display.getText());
    root=Math.sqrt(num);
    display.setText(""+root);
    }//GEN-LAST:event_rootActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
     System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator_Original.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator_Original.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator_Original.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator_Original.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Calculator_Original().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Roundof;
    private javax.swing.JButton clear;
    private javax.swing.JButton decimal;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton exit;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton negative;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JButton plus;
    private javax.swing.JButton root;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton square;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
