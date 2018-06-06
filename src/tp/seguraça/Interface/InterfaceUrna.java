
package tp.seguraça.Interface;

/**
 *
 * @author rafael
 */

public class InterfaceUrna extends javax.swing.JFrame {

    public InterfaceUrna() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(235,235,235));
        this.setExtendedState(InterfaceUrna.MAXIMIZED_BOTH);
    }
    
    // Adiciona o número na tela
    public void adicionaNumero(String numero){
        if("".equals(labelNCandidato4.getText())){
            labelNCandidato4.setText(numero);
        }else if("".equals(labelNCandidato3.getText())){
            labelNCandidato3.setText(numero);
        }else if("".equals(labelNCandidato2.getText())){
            labelNCandidato2.setText(numero);
        }else if("".equals(labelNCandidato1.getText())){
            labelNCandidato1.setText(numero);
        }else if("".equals(labelNCandidato0.getText())){
            labelNCandidato0.setText(numero);
        }
    }
    
    // Função botão corrige
    public void corrige(){
        labelNCandidato0.setText("");
        labelNCandidato1.setText("");
        labelNCandidato2.setText("");
        labelNCandidato3.setText("");
        labelNCandidato4.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        labelCargo = new javax.swing.JLabel();
        labelCandidato = new javax.swing.JLabel();
        labelPartido = new javax.swing.JLabel();
        panelTeclado = new javax.swing.JPanel();
        buttonN0 = new javax.swing.JButton();
        buttonN1 = new javax.swing.JButton();
        buttonN2 = new javax.swing.JButton();
        buttonN3 = new javax.swing.JButton();
        buttonN4 = new javax.swing.JButton();
        buttonN5 = new javax.swing.JButton();
        buttonN6 = new javax.swing.JButton();
        buttonN7 = new javax.swing.JButton();
        buttonN8 = new javax.swing.JButton();
        buttonN9 = new javax.swing.JButton();
        buttonBranco = new javax.swing.JButton();
        buttonCorrige = new javax.swing.JButton();
        buttonConfirma = new javax.swing.JButton();
        labelNCandidato4 = new javax.swing.JLabel();
        labelNCandidato3 = new javax.swing.JLabel();
        labelNCandidato2 = new javax.swing.JLabel();
        labelNCandidato1 = new javax.swing.JLabel();
        labelNCandidato0 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(70, 70));
        setUndecorated(true);
        setResizable(false);

        labelTitulo.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 153, 51));
        labelTitulo.setText("Digite o número do seu candidato!");

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        labelCargo.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        labelCargo.setForeground(new java.awt.Color(0, 204, 51));
        labelCargo.setText("Cargo");

        labelCandidato.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        labelCandidato.setForeground(new java.awt.Color(0, 204, 51));
        labelCandidato.setText("Candidato");

        labelPartido.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        labelPartido.setForeground(new java.awt.Color(0, 204, 51));
        labelPartido.setText("Partido");

        jLayeredPane1.setLayer(labelCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labelCandidato, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labelPartido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(labelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        panelTeclado.setBackground(new java.awt.Color(235, 235, 235));

        buttonN0.setBackground(new java.awt.Color(204, 204, 204));
        buttonN0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonN0.setText("0");
        buttonN0.setMaximumSize(null);
        buttonN0.setMinimumSize(null);
        buttonN0.setPreferredSize(null);
        buttonN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonN0ActionPerformed(evt);
            }
        });

        buttonN1.setBackground(new java.awt.Color(204, 204, 204));
        buttonN1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonN1.setText("1");
        buttonN1.setMaximumSize(null);
        buttonN1.setMinimumSize(null);
        buttonN1.setPreferredSize(new java.awt.Dimension(50, 60));
        buttonN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonN1ActionPerformed(evt);
            }
        });

        buttonN2.setBackground(new java.awt.Color(204, 204, 204));
        buttonN2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonN2.setText("2");
        buttonN2.setMaximumSize(null);
        buttonN2.setMinimumSize(null);
        buttonN2.setPreferredSize(new java.awt.Dimension(50, 60));
        buttonN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonN2ActionPerformed(evt);
            }
        });

        buttonN3.setBackground(new java.awt.Color(204, 204, 204));
        buttonN3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonN3.setText("3");
        buttonN3.setMaximumSize(null);
        buttonN3.setMinimumSize(null);
        buttonN3.setPreferredSize(new java.awt.Dimension(50, 60));
        buttonN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonN3ActionPerformed(evt);
            }
        });

        buttonN4.setBackground(new java.awt.Color(204, 204, 204));
        buttonN4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonN4.setText("4");
        buttonN4.setMaximumSize(null);
        buttonN4.setMinimumSize(null);
        buttonN4.setPreferredSize(new java.awt.Dimension(50, 60));
        buttonN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonN4ActionPerformed(evt);
            }
        });

        buttonN5.setBackground(new java.awt.Color(204, 204, 204));
        buttonN5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonN5.setText("5");
        buttonN5.setMaximumSize(null);
        buttonN5.setMinimumSize(null);
        buttonN5.setPreferredSize(new java.awt.Dimension(50, 60));
        buttonN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonN5ActionPerformed(evt);
            }
        });

        buttonN6.setBackground(new java.awt.Color(204, 204, 204));
        buttonN6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonN6.setText("6");
        buttonN6.setMaximumSize(null);
        buttonN6.setMinimumSize(null);
        buttonN6.setPreferredSize(new java.awt.Dimension(50, 60));
        buttonN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonN6ActionPerformed(evt);
            }
        });

        buttonN7.setBackground(new java.awt.Color(204, 204, 204));
        buttonN7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonN7.setText("7");
        buttonN7.setMaximumSize(null);
        buttonN7.setMinimumSize(null);
        buttonN7.setPreferredSize(new java.awt.Dimension(50, 60));
        buttonN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonN7ActionPerformed(evt);
            }
        });

        buttonN8.setBackground(new java.awt.Color(204, 204, 204));
        buttonN8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonN8.setText("8");
        buttonN8.setMaximumSize(null);
        buttonN8.setMinimumSize(null);
        buttonN8.setPreferredSize(new java.awt.Dimension(50, 60));
        buttonN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonN8ActionPerformed(evt);
            }
        });

        buttonN9.setBackground(new java.awt.Color(204, 204, 204));
        buttonN9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonN9.setText("9");
        buttonN9.setMaximumSize(null);
        buttonN9.setMinimumSize(null);
        buttonN9.setPreferredSize(new java.awt.Dimension(50, 60));
        buttonN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonN9ActionPerformed(evt);
            }
        });

        buttonBranco.setBackground(new java.awt.Color(255, 255, 255));
        buttonBranco.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        buttonBranco.setText("Branco");

        buttonCorrige.setBackground(new java.awt.Color(255, 153, 51));
        buttonCorrige.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        buttonCorrige.setText("Corrige");
        buttonCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCorrigeActionPerformed(evt);
            }
        });

        buttonConfirma.setBackground(new java.awt.Color(0, 204, 51));
        buttonConfirma.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        buttonConfirma.setText("Confirma");
        buttonConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmaActionPerformed(evt);
            }
        });

        labelNCandidato4.setBackground(new java.awt.Color(255, 255, 255));
        labelNCandidato4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNCandidato4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNCandidato4.setToolTipText("");
        labelNCandidato4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 3, true));

        labelNCandidato3.setBackground(new java.awt.Color(255, 255, 255));
        labelNCandidato3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNCandidato3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNCandidato3.setToolTipText("");
        labelNCandidato3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 3, true));

        labelNCandidato2.setBackground(new java.awt.Color(255, 255, 255));
        labelNCandidato2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNCandidato2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNCandidato2.setToolTipText("");
        labelNCandidato2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 3, true));

        labelNCandidato1.setBackground(new java.awt.Color(255, 255, 255));
        labelNCandidato1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNCandidato1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNCandidato1.setToolTipText("");
        labelNCandidato1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 3, true));

        labelNCandidato0.setBackground(java.awt.Color.white);
        labelNCandidato0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNCandidato0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNCandidato0.setToolTipText("");
        labelNCandidato0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 3, true));
        labelNCandidato0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelNCandidato0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelTecladoLayout = new javax.swing.GroupLayout(panelTeclado);
        panelTeclado.setLayout(panelTecladoLayout);
        panelTecladoLayout.setHorizontalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTecladoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTecladoLayout.createSequentialGroup()
                        .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(buttonBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(buttonCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(buttonConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTecladoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labelNCandidato4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNCandidato3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNCandidato2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNCandidato1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNCandidato0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelTecladoLayout.setVerticalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTecladoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNCandidato4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNCandidato0, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNCandidato3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNCandidato2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNCandidato1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonN2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonN3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonN4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonN5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonN6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonN7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonN9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonN8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(buttonN0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLayeredPane1)
                .addGap(50, 50, 50)
                .addComponent(panelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN1ActionPerformed
       adicionaNumero("1");
    }//GEN-LAST:event_buttonN1ActionPerformed

    private void buttonN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN2ActionPerformed
       adicionaNumero("2");
    }//GEN-LAST:event_buttonN2ActionPerformed

    private void buttonN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN3ActionPerformed
       adicionaNumero("3");
    }//GEN-LAST:event_buttonN3ActionPerformed

    private void buttonN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN4ActionPerformed
       adicionaNumero("4");
    }//GEN-LAST:event_buttonN4ActionPerformed

    private void buttonN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN5ActionPerformed
       adicionaNumero("5");
    }//GEN-LAST:event_buttonN5ActionPerformed

    private void buttonN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN6ActionPerformed
       adicionaNumero("6");
    }//GEN-LAST:event_buttonN6ActionPerformed

    private void buttonN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN7ActionPerformed
       adicionaNumero("7");
    }//GEN-LAST:event_buttonN7ActionPerformed

    private void buttonN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN8ActionPerformed
       adicionaNumero("8");
    }//GEN-LAST:event_buttonN8ActionPerformed

    private void buttonN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN9ActionPerformed
       adicionaNumero("9");
    }//GEN-LAST:event_buttonN9ActionPerformed

    private void buttonN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN0ActionPerformed
       adicionaNumero("0");
    }//GEN-LAST:event_buttonN0ActionPerformed

    private void buttonCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCorrigeActionPerformed
      corrige();
    }//GEN-LAST:event_buttonCorrigeActionPerformed

    private void buttonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonConfirmaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceUrna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBranco;
    private javax.swing.JButton buttonConfirma;
    private javax.swing.JButton buttonCorrige;
    private javax.swing.JButton buttonN0;
    private javax.swing.JButton buttonN1;
    private javax.swing.JButton buttonN2;
    private javax.swing.JButton buttonN3;
    private javax.swing.JButton buttonN4;
    private javax.swing.JButton buttonN5;
    private javax.swing.JButton buttonN6;
    private javax.swing.JButton buttonN7;
    private javax.swing.JButton buttonN8;
    private javax.swing.JButton buttonN9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel labelCandidato;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelNCandidato0;
    private javax.swing.JLabel labelNCandidato1;
    private javax.swing.JLabel labelNCandidato2;
    private javax.swing.JLabel labelNCandidato3;
    private javax.swing.JLabel labelNCandidato4;
    private javax.swing.JLabel labelPartido;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelTeclado;
    // End of variables declaration//GEN-END:variables
}
