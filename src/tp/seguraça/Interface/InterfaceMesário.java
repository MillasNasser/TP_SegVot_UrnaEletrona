
package tp.seguraça.Interface;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import tp.seguraça.TerminalMesario.TerminalMesario;
import tp.seguraça.Urna.Urna;


public class InterfaceMesário extends javax.swing.JFrame {
	InterfaceUrna urnaAssociada = null;
	String titulo = "";

    public InterfaceMesário() {
    }
	
	public void setUrnaAssociada(InterfaceUrna urna){
		this.urnaAssociada = urna;
		initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(new java.awt.Color(235,235,235)); 
        situacaoEleitor.setVisible(false);
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
        if(TerminalMesario.verificaExiste(titulo)){
            Resultado = "O título do eleitor é válido";
        } else {
            Resultado = "O título do eleitor é inválido!";
            return Resultado;
        }
        if(TerminalMesario.verificaVotou(titulo)){
            Resultado += " porém o eleitor já votou!";
        }
        return Resultado;
    }
    
    void verificaEleitor(String titulo){
        String Resultado = situacaoEleitor(titulo);
        labelSituacao.setText(Resultado);
        if(TerminalMesario.verificarEleitor(titulo)){
            labelResultadoFinal.setText(
				"O eleitor "+TerminalMesario.getNomeEleitor(titulo)+" está apto a votar!");
			this.titulo = titulo;
            labelResultadoFinal.setForeground(Color.blue);
			buttonVaiVotar.setVisible(true);
			situacaoEleitor.setVisible(false);
        } else {
            labelResultadoFinal.setText("O eleitor não está apto a votar!");
            labelResultadoFinal.setForeground(Color.red);
			numeroTituloEleitor.setText("");
			situacaoEleitor.setVisible(true);
			situacaoEleitor.setText(
					"Situação Eleitor:" + 
					situacaoEleitor(titulo)
			);
        }
        //labelSituacao.setVisible(true);
        labelResultadoFinal.setVisible(true);
    }
    
    void vaiVotar(){
        situacaoEleitor.setVisible(false);
        labelSituacao.setVisible(false);
        labelResultadoFinal.setVisible(false);
        labelEleitor.setVisible(false);
        numeroTituloEleitor.setVisible(false);
        buttonBuscar.setVisible(false);
		TerminalMesario.votar(this.titulo);
		buttonVaiVotar.setVisible(false);
        labelTitulo.setText("Aguardando o eleitor votar...");
    }
    
	public void setNewConsulta(boolean value){
		novaConsulta();
		urnaAssociada.telaBase("Ø");
	}
	
    public void novaConsulta(){
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
        situacaoEleitor = new javax.swing.JLabel();
        labelSituacao = new javax.swing.JLabel();
        labelResultadoFinal = new javax.swing.JLabel();
        buttonVaiVotar = new javax.swing.JButton();
        numeroTituloEleitor = new javax.swing.JTextField();
        finalizar = new javax.swing.JButton();

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

        situacaoEleitor.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        situacaoEleitor.setText("Situação Eleitor:");

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

        finalizar.setText("finalizar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(situacaoEleitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSituacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelResultadoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonVaiVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEleitor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroTituloEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(finalizar))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelTitulo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar)
                    .addComponent(numeroTituloEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(situacaoEleitor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSituacao)
                .addGap(22, 22, 22)
                .addComponent(labelResultadoFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonVaiVotar)
                .addGap(8, 8, 8)
                .addComponent(finalizar))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
		int pergunta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja finalizar a votação?");
		if(pergunta == 0){
			Urna.finalizar();
			numeroTituloEleitor.setVisible(false);
			labelEleitor.setVisible(false);
			buttonBuscar.setVisible(false);
			urnaAssociada.telaBase("FINALIZADO");
		}
    }//GEN-LAST:event_finalizarActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        verificaEleitor(numeroTituloEleitor.getText());
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonVaiVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVaiVotarActionPerformed
        if("Prosseguir eleitor para votação".equals(buttonVaiVotar.getText())){
            urnaAssociada.inicio();
            vaiVotar();
        } else if ("Clique aqui se o eleitor já votou!".equals(buttonVaiVotar.getText())){
            novaConsulta();
        }
    }//GEN-LAST:event_buttonVaiVotarActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMesário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		//</editor-fold>
		
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
            public void run() {
                new InterfaceMesário().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonVaiVotar;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel labelEleitor;
    private javax.swing.JLabel labelResultadoFinal;
    private javax.swing.JLabel labelSituacao;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField numeroTituloEleitor;
    private javax.swing.JLabel situacaoEleitor;
    // End of variables declaration//GEN-END:variables
}
