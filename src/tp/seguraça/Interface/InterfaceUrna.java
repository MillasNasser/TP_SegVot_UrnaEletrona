
package tp.seguraça.Interface;

import java.awt.Font;
import java.awt.Toolkit;

/**
 *
 * @author rafael
 */

public class InterfaceUrna extends javax.swing.JFrame {

    public InterfaceUrna() {
        initComponents();
        
        // Mudando a cor de fundo e maximizando
        this.getContentPane().setBackground(new java.awt.Color(235,235,235));
        this.setExtendedState(InterfaceUrna.MAXIMIZED_BOTH);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		int xsize = tk.getScreenSize().width,
			ysize = tk.getScreenSize().height;
		
		this.setSize(xsize, ysize);
        
        // Inicianco votação
        iniciaVotacao();
    }
    
    // Iniciar Votação
    public void iniciaVotacao(){
         // Setando labels
        paneCargo.setVisible(true);
        panelTeclado.setVisible(true);
        labelCargo.setText("Cargo");
        labelCandidato.setText("Candidato");
        labelPartido.setText("Partido");
        labelTitulo.setText("Digite o número para o cargo de DEPUTADO ESTADUAL");
    }
    
    
    // Mostra os labels
    public void mostraLabelCandidato(){
        labelCargo.setVisible(true);
        labelCandidato.setVisible(true);
        labelPartido.setVisible(true);
    }
    
    // Verifica se o eleitor já digitou todo o número
    public void verificaFim(){
        if("Digite o número para o cargo de DEPUTADO ESTADUAL".equals(labelTitulo.getText()) && !"".equals(labelNCandidato0.getText())){
            // BUSCAR CANDITADO BANCO DE DADOS
            mostraLabelCandidato();
            labelCargo.setText("DEPUTADO ESTADUAL");
            labelCandidato.setText("JOÃO DO MAR");
            labelPartido.setText("ADT");
        } else if("Digite o número para o cargo de DEPUTADO FEDERAL".equals(labelTitulo.getText()) && !"".equals(labelNCandidato1.getText())){
            // BUSCAR CANDITADO BANCO DE DADOS
            mostraLabelCandidato();
            labelCargo.setText("DEPUTADO FERDERAL");
            labelCandidato.setText("JOÃO DA TERRA");
            labelPartido.setText("ADF");
        } else if("Digite o número para o cargo de SENADOR".equals(labelTitulo.getText()) && !"".equals(labelNCandidato2.getText())){
            // BUSCAR CANDITADO BANCO DE DADOS
            mostraLabelCandidato();
            labelCargo.setText("SENADOR");
            labelCandidato.setText("JOÃO DO CEU");
            labelPartido.setText("AVT");
        } else if("Digite o número para o cargo de GOVERNADOR".equals(labelTitulo.getText()) && !"".equals(labelNCandidato3.getText())){
            // BUSCAR CANDITADO BANCO DE DADOS
            mostraLabelCandidato();
            labelCargo.setText("GOVERNADOR");
            labelCandidato.setText("JOÃO DO NORTE");
            labelPartido.setText("ACE");
        } else if("Digite o número para o cargo de PRESIDENTE".equals(labelTitulo.getText()) && !"".equals(labelNCandidato3.getText())){
            // BUSCAR CANDITADO BANCO DE DADOS
            mostraLabelCandidato();
            labelCargo.setText("PRESIDENTE");
            labelCandidato.setText("JOÃO DO SUL");
            labelPartido.setText("ANU");
        }
    }
    
    // Adiciona o número na tela
    public void adicionaNumero(String numero){
        if("".equals(labelNCandidato4.getText()) && labelNCandidato4.isVisible()){
            labelNCandidato4.setText(numero);
        }else if("".equals(labelNCandidato3.getText()) && labelNCandidato3.isVisible()){
            labelNCandidato3.setText(numero);
        }else if("".equals(labelNCandidato2.getText()) && labelNCandidato2.isVisible()){
            labelNCandidato2.setText(numero);
        }else if("".equals(labelNCandidato1.getText()) && labelNCandidato1.isVisible()){
            labelNCandidato1.setText(numero);
        }else if("".equals(labelNCandidato0.getText()) && labelNCandidato0.isVisible()){
            labelNCandidato0.setText(numero);
        }
        verificaFim();
    }
    
    // Vai para o próximo candidato
    public void proximoCandidato(){
         if("Digite o número para o cargo de DEPUTADO ESTADUAL".equals(labelTitulo.getText()) && !"".equals(labelNCandidato0.getText())){
             labelTitulo.setText("Digite o número para o cargo de DEPUTADO FEDERAL");
             labelNCandidato0.setVisible(false);
             limpa();
         } else if ("Digite o número para o cargo de DEPUTADO FEDERAL".equals(labelTitulo.getText()) && !"".equals(labelNCandidato1.getText())){
             labelTitulo.setText("Digite o número para o cargo de SENADOR");
             labelNCandidato1.setVisible(false);
             limpa();
         } else if ("Digite o número para o cargo de SENADOR".equals(labelTitulo.getText()) && !"".equals(labelNCandidato2.getText())){
             labelTitulo.setText("Digite o número para o cargo de GOVERNADOR");
             labelNCandidato2.setVisible(false);
             limpa();
         } else if ("Digite o número para o cargo de GOVERNADOR".equals(labelTitulo.getText()) && !"".equals(labelNCandidato3.getText())){
             labelTitulo.setText("Digite o número para o cargo de PRESIDENTE");
             limpa();
         } else if ("Digite o número para o cargo de PRESIDENTE".equals(labelTitulo.getText()) && !"".equals(labelNCandidato3.getText())){
             limpa();
             paneCargo.setVisible(false);
             panelTeclado.setVisible(false);
             labelTitulo.setText("FIM");
             labelTitulo.setFont(new Font("Dialog", Font.PLAIN, 200));
         }
    }
    
    // Ação confirma
    public void confirma(){
        // SALVAR VOTO URNA
        proximoCandidato();
    }
    
    // Limpa campos tela
    public void limpa(){
        labelNCandidato0.setText("");
        labelNCandidato1.setText("");
        labelNCandidato2.setText("");
        labelNCandidato3.setText("");
        labelNCandidato4.setText("");
        labelCargo.setText("Cargo");
        labelCandidato.setText("Candidato");
        labelPartido.setText("Partido");
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        paneCargo = new javax.swing.JLayeredPane();
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
        panelNumeroCandidato = new javax.swing.JPanel();
        labelNCandidato4 = new javax.swing.JLabel();
        labelNCandidato1 = new javax.swing.JLabel();
        labelNCandidato0 = new javax.swing.JLabel();
        labelNCandidato2 = new javax.swing.JLabel();
        labelNCandidato3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(70, 70));
        setUndecorated(true);
        setResizable(false);

        labelTitulo.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 153, 51));
        labelTitulo.setText("Digite o número do seu candidato!");

        paneCargo.setBackground(new java.awt.Color(255, 255, 255));

        labelCargo.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        labelCargo.setForeground(new java.awt.Color(0, 204, 51));
        labelCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCargo.setText("Cargo");

        labelCandidato.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        labelCandidato.setForeground(new java.awt.Color(0, 204, 51));
        labelCandidato.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCandidato.setText("Candidato");

        labelPartido.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        labelPartido.setForeground(new java.awt.Color(0, 204, 51));
        labelPartido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPartido.setText("Partido");

        paneCargo.setLayer(labelCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paneCargo.setLayer(labelCandidato, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paneCargo.setLayer(labelPartido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout paneCargoLayout = new javax.swing.GroupLayout(paneCargo);
        paneCargo.setLayout(paneCargoLayout);
        paneCargoLayout.setHorizontalGroup(
            paneCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelPartido)
                    .addComponent(labelCargo)
                    .addComponent(labelCandidato))
                .addContainerGap())
        );
        paneCargoLayout.setVerticalGroup(
            paneCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(labelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
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

        panelNumeroCandidato.setBackground(new java.awt.Color(235, 235, 235));

        labelNCandidato4.setBackground(new java.awt.Color(255, 255, 255));
        labelNCandidato4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNCandidato4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNCandidato4.setToolTipText("");
        labelNCandidato4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 3, true));

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

        labelNCandidato2.setBackground(new java.awt.Color(255, 255, 255));
        labelNCandidato2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNCandidato2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNCandidato2.setToolTipText("");
        labelNCandidato2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 3, true));

        labelNCandidato3.setBackground(new java.awt.Color(255, 255, 255));
        labelNCandidato3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNCandidato3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNCandidato3.setToolTipText("");
        labelNCandidato3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 3, true));

        javax.swing.GroupLayout panelNumeroCandidatoLayout = new javax.swing.GroupLayout(panelNumeroCandidato);
        panelNumeroCandidato.setLayout(panelNumeroCandidatoLayout);
        panelNumeroCandidatoLayout.setHorizontalGroup(
            panelNumeroCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumeroCandidatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNCandidato4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNCandidato3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNCandidato2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNCandidato1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNCandidato0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNumeroCandidatoLayout.setVerticalGroup(
            panelNumeroCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumeroCandidatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNumeroCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNCandidato4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNCandidato0, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNCandidato3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNCandidato2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNCandidato1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelTecladoLayout = new javax.swing.GroupLayout(panelTeclado);
        panelTeclado.setLayout(panelTecladoLayout);
        panelTecladoLayout.setHorizontalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTecladoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(panelNumeroCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonN0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonN8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonN5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonN2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTecladoLayout.createSequentialGroup()
                        .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(buttonN7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTecladoLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(buttonN9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonN6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonN3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelTecladoLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(buttonCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(buttonConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        panelTecladoLayout.setVerticalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTecladoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNumeroCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buttonN3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonN2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonN1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buttonN6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonN5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonN4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buttonN9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonN8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonN7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonN0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(paneCargo)
                .addGap(10, 10, 10)
                .addComponent(panelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneCargo)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmaActionPerformed
        confirma();
    }//GEN-LAST:event_buttonConfirmaActionPerformed

    private void buttonCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCorrigeActionPerformed
        limpa();
    }//GEN-LAST:event_buttonCorrigeActionPerformed

    private void buttonN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN9ActionPerformed
        adicionaNumero("9");
    }//GEN-LAST:event_buttonN9ActionPerformed

    private void buttonN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN8ActionPerformed
        adicionaNumero("8");
    }//GEN-LAST:event_buttonN8ActionPerformed

    private void buttonN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN7ActionPerformed
        adicionaNumero("7");
    }//GEN-LAST:event_buttonN7ActionPerformed

    private void buttonN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN6ActionPerformed
        adicionaNumero("6");
    }//GEN-LAST:event_buttonN6ActionPerformed

    private void buttonN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN5ActionPerformed
        adicionaNumero("5");
    }//GEN-LAST:event_buttonN5ActionPerformed

    private void buttonN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN4ActionPerformed
        adicionaNumero("4");
    }//GEN-LAST:event_buttonN4ActionPerformed

    private void buttonN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN3ActionPerformed
        adicionaNumero("3");
    }//GEN-LAST:event_buttonN3ActionPerformed

    private void buttonN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN2ActionPerformed
        adicionaNumero("2");
    }//GEN-LAST:event_buttonN2ActionPerformed

    private void buttonN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN1ActionPerformed
        adicionaNumero("1");
    }//GEN-LAST:event_buttonN1ActionPerformed

    private void buttonN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonN0ActionPerformed
        adicionaNumero("0");
    }//GEN-LAST:event_buttonN0ActionPerformed

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
    private javax.swing.JLabel labelCandidato;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelNCandidato0;
    private javax.swing.JLabel labelNCandidato1;
    private javax.swing.JLabel labelNCandidato2;
    private javax.swing.JLabel labelNCandidato3;
    private javax.swing.JLabel labelNCandidato4;
    private javax.swing.JLabel labelPartido;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLayeredPane paneCargo;
    private javax.swing.JPanel panelNumeroCandidato;
    private javax.swing.JPanel panelTeclado;
    // End of variables declaration//GEN-END:variables
}
