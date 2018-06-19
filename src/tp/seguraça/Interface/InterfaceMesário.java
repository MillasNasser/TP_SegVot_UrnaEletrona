
package Interface;

import java.awt.Color;
import java.awt.Toolkit;
import tp.seguraça.TerminalMesario.TerminalMesario;



public class InterfaceMesário extends javax.swing.JFrame {


    public InterfaceMesário() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(new java.awt.Color(235,235,235)); 
        labelTitulo2.setVisible(false);
        labelSituacao.setVisible(false);
        labelResultadoFinal.setVisible(false);
        buttonVaiVotar.setVisible(false);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		int xsize = tk.getScreenSize().width;
		int ysize = tk.getScreenSize().height;
		
		this.setSize(xsize, ysize);
		this.setLocation(0, 0);
    }
    
    // Verificar se o título está no bd
    boolean tituloValido(String titulo){
        return true;
    }
    
    // Verificar pelo titulo e seção atual 
    boolean secaoCerta(String titulo, String Secao){
        return true;
    }
    
    // Verificar se o eleitor já votou 
    boolean naoVotou(String titulo){
        return true;
    }
    
    String situacaoEleitor(String titulo){
        String Resultado;
        if(tituloValido(titulo)){
            Resultado = "O título do eleitor é válido";
        } else {
            Resultado = "O título do eleitor é inválido!";
            return Resultado;
        }
        if(secaoCerta(titulo,"secao")){
            Resultado += ", o eleitor está na seção certa";
        } else {
            Resultado += " porém está em seção errada!";
            return Resultado;
        }
        if(naoVotou(titulo)){
            Resultado += " e ainda não votou!";
        } else {
            Resultado += " porém o eleitor já votou!";
        }
        return Resultado;
    }
    
    void verificaEleitor(String titulo){
        String Resultado = situacaoEleitor(titulo);
        labelSituacao.setText(Resultado);
		System.out.println(titulo);
        if(TerminalMesario.verificarEleitor(titulo)){
            labelResultadoFinal.setText("O eleitor está apto a votar!");
            labelResultadoFinal.setForeground(Color.blue);
			buttonVaiVotar.setVisible(true);
        } else {
            labelResultadoFinal.setText("O eleitor não está apto a votar!");
            labelResultadoFinal.setForeground(Color.red);
			numeroTituloEleitor.setText("");
        }
        labelTitulo2.setVisible(true);
        //labelSituacao.setVisible(true);
        labelResultadoFinal.setVisible(true);
    }
    
    void vaiVotar(){
        labelTitulo2.setVisible(false);
        labelSituacao.setVisible(false);
        labelResultadoFinal.setVisible(false);
        labelEleitor.setVisible(false);
        numeroTituloEleitor.setVisible(false);
        buttonBuscar.setVisible(false);
        buttonVaiVotar.setText("Clique aqui se o eleitor já votou!");
        labelTitulo.setText("Aguardando o eleitor votar...");
    }
    
    void novaConsulta(){
        labelEleitor.setVisible(true);
        numeroTituloEleitor.setVisible(true);
        buttonBuscar.setVisible(true);
        buttonVaiVotar.setVisible(false);
        buttonVaiVotar.setText("Prosseguir eleitor para votação");
        labelTitulo.setText("Terminal Mesário - Consulta eleitoral");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelEleitor = new javax.swing.JLabel();
        buttonBuscar = new javax.swing.JButton();
        labelTitulo2 = new javax.swing.JLabel();
        labelSituacao = new javax.swing.JLabel();
        labelResultadoFinal = new javax.swing.JLabel();
        buttonVaiVotar = new javax.swing.JButton();
        numeroTituloEleitor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Terminal Mesário");
        setBackground(new java.awt.Color(183, 166, 166));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(676, 289));
        setUndecorated(true);
        setResizable(false);

        labelTitulo.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Terminal Mesário - Consulta eleitoral");

        labelEleitor.setFont(new java.awt.Font("TakaoPGothic", 1, 14)); // NOI18N
        labelEleitor.setText("Digite número do título de eleitor");

        buttonBuscar.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        buttonBuscar.setText("Verificar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        labelTitulo2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        labelTitulo2.setText("Situação Eleitor:");

        labelSituacao.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        labelSituacao.setText("Situação Eleitor");
        labelSituacao.setToolTipText("");

        labelResultadoFinal.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        labelResultadoFinal.setForeground(new java.awt.Color(50, 183, 157));
        labelResultadoFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResultadoFinal.setText("Resutado Final");

        buttonVaiVotar.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        buttonVaiVotar.setText("Prosseguir eleitor para votação");
        buttonVaiVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVaiVotarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addComponent(labelResultadoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSituacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelTitulo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelEleitor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numeroTituloEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonVaiVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar)
                    .addComponent(numeroTituloEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSituacao)
                .addGap(22, 22, 22)
                .addComponent(labelResultadoFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonVaiVotar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        verificaEleitor(numeroTituloEleitor.getText());
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonVaiVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVaiVotarActionPerformed
        if("Prosseguir eleitor para votação".equals(buttonVaiVotar.getText())){
            vaiVotar();
        } else if ("Clique aqui se o eleitor já votou!".equals(buttonVaiVotar.getText())){
            novaConsulta();
        }
    }//GEN-LAST:event_buttonVaiVotarActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceMesário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMesário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMesário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMesário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceMesário().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonVaiVotar;
    private javax.swing.JLabel labelEleitor;
    private javax.swing.JLabel labelResultadoFinal;
    private javax.swing.JLabel labelSituacao;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JTextField numeroTituloEleitor;
    // End of variables declaration//GEN-END:variables
}
