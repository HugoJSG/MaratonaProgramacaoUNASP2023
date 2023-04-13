/*
DATA: 12 Abril 2023

Nome: Levy Meireles Rodrigues dos Santos
RA: 057772
Turma: 5 SI

Nome: Hugo Joel Sosa Geisse
RA: 029230
Turma: 5 SI

Nome: João Vitor Teles Bonardi
RA: 194341
Turma: 1 EC

Nome: Victor Augusto Malaquias Hoffman
RA: 198462
Turma: 1 EC

Nome: Gabryel Meireles Rodrigues dos Santos
RA: 059202
Turma: 5 SI

Nome: Gustavo Santos de araujo
RA: 194578
Turma: 1 EC

Nome: Bruno de Oliveira
RA: 183152
Turma: 3 SI

Nome: Lucas Cardoso Rios
RA: 185793
Turma: 3 SI

Nome: Leonardo Ezequiel Sosa Geisse 
RA: 158467
Turma: 5 SI

Nome: Kayan Guerra 
RA: 056942
Turma: 7 SI
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mascara.util.LimitaCaracteres;

public class Cesar extends javax.swing.JPanel {

    public Cesar() {
        initComponents();
        Decriptar.setEnabled(false);
        TextoInicial.setDocument(new LimitaCaracteres(200, LimitaCaracteres.TipoEntrada.NUMEROSELETRAS));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Chave = new javax.swing.JTextField();
        Encriptar = new javax.swing.JButton();
        TextoInicial = new javax.swing.JTextField();
        TextoEncriptado = new javax.swing.JTextField();
        TextoDecriptado = new javax.swing.JTextField();
        Decriptar = new javax.swing.JButton();
        ErroTexto1 = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(390, 260));
        setPreferredSize(new java.awt.Dimension(390, 260));

        background.setBackground(new java.awt.Color(204, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(400, 290));

        jLabel2.setText("texto inicial (MAIUSCULAS e NUMEROS)");

        jLabel3.setText("chave (NUMERO)");

        jLabel4.setText("texto encriptado");

        jLabel5.setText("texto decriptado");

        Chave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ChaveKeyPressed(evt);
            }
        });

        Encriptar.setText("Encriptar");
        Encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncriptarActionPerformed(evt);
            }
        });

        TextoInicial.setToolTipText("");

        TextoEncriptado.setEditable(false);

        TextoDecriptado.setEditable(false);

        Decriptar.setText("Decriptar");
        Decriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecriptarActionPerformed(evt);
            }
        });

        ErroTexto1.setEditable(false);
        ErroTexto1.setBackground(new java.awt.Color(204, 255, 255));
        ErroTexto1.setForeground(new java.awt.Color(255, 51, 51));
        ErroTexto1.setBorder(null);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoEncriptado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextoInicial, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextoDecriptado)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Chave, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Encriptar)
                            .addComponent(Decriptar))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ErroTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErroTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoEncriptado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Encriptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoDecriptado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Decriptar))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public static String encriptar(String letras, String texto, int chave){
        String textoencriptado = "";
               
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            
            int pos = letras.indexOf(caracter);
         
            if(pos == -1){
                textoencriptado += caracter;
            }else{
                if(pos + chave < 0){
                    textoencriptado += letras.charAt( (pos + chave) + letras.length() );
                }else{
                    textoencriptado += letras.charAt( (pos + chave) % letras.length() );
                }  
            }    
        }
        
        return textoencriptado;
    }
    private void EncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncriptarActionPerformed
        ErroTexto1.setText("");
        
            if(Chave.getText()==null || Chave.getText().trim().equals("")){
                ErroTexto1.setText("falta chave");
            }else{
                String textoinicial = TextoInicial.getText();
                int chave = Integer.parseInt(Chave.getText());
                String Abcedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                String textofinal = encriptar(Abcedario,textoinicial,chave);
                TextoEncriptado.setText(textofinal);
                Decriptar.setEnabled(true);
            }  
    }//GEN-LAST:event_EncriptarActionPerformed

    private void DecriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecriptarActionPerformed
        String textoencriptado = TextoEncriptado.getText();
        int chave = Integer.parseInt(Chave.getText());
        String Abcedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String textofinal = encriptar(Abcedario,textoencriptado,chave*-1);
        TextoDecriptado.setText(textofinal);
    }//GEN-LAST:event_DecriptarActionPerformed

    private void ChaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChaveKeyPressed
        int caracteres = Chave.getText().length();
        if(caracteres < 1 || Character.isISOControl(evt.getKeyChar())){
            if(evt.getKeyChar()>= 49 && evt.getKeyChar()<= 57 || Character.isISOControl(evt.getKeyChar())){
                Chave.setEditable(true);
            }else{
                Chave.setEditable(false);
            }
        }else if(caracteres == 1 && Integer.parseInt(Chave.getText()) == 1 && evt.getKeyChar()>= 48 && evt.getKeyChar()<= 57 || Character.isISOControl(evt.getKeyChar())){
            Chave.setEditable(true);
        }else if(caracteres == 1 && Integer.parseInt(Chave.getText()) == 2 && evt.getKeyChar()>= 48 && evt.getKeyChar()<= 53 || Character.isISOControl(evt.getKeyChar())){
            Chave.setEditable(true);
        }else{
            Chave.setEditable(false);
        }
    }//GEN-LAST:event_ChaveKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Chave;
    private javax.swing.JButton Decriptar;
    private javax.swing.JButton Encriptar;
    private javax.swing.JTextField ErroTexto1;
    private javax.swing.JTextField TextoDecriptado;
    private javax.swing.JTextField TextoEncriptado;
    private javax.swing.JTextField TextoInicial;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
