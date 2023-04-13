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

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
import mascara.util.LimitaCaracteres;
import java.util.*;

public class Trilho extends javax.swing.JPanel {

    public Trilho() {
        initComponents();
        Decriptar.setEnabled(false);
        TextoInicial.setDocument(new LimitaCaracteres(200, LimitaCaracteres.TipoEntrada.NUMEROSELETRAS));
        Chave.setDocument(new LimitaCaracteres(7, LimitaCaracteres.TipoEntrada.NUMEROS2));
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

        background.setBackground(new java.awt.Color(204, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(400, 290));

        jLabel2.setText("texto inicial (MAIUSCULAS e NUMEROS)");

        jLabel3.setText("chave (NUMEROS 0-6 NAO REPETIDOS)");

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
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(TextoEncriptado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextoInicial, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(TextoDecriptado)
                    .addComponent(Chave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
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
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public static String codificarTexto(String textoInicial, int numColunas, int numFilas, char[] chave) {
        char[][] matrizAux = new char[numColunas][numFilas];
        String textoFinal = "";

        // Dividir texto em colunas ordenadas pela chave
        for(int j = 0; j < numFilas; j++) {
            for(int k = 0; k < numColunas; k++) {
                int posicaoAtual = (j*numColunas) + k;
                matrizAux[chave[k]-'0'][j] = getCharAt(textoInicial, posicaoAtual);
            }
        }

        // Juntar tudo em uma string
        for(int j = 0; j < numFilas; j++) {
            for(int k = 0; k < numColunas; k++) {
                // System.out.print(matrizAux[j][k]);
                textoFinal += matrizAux[k][j];
            }
            // System.out.println();
        }

        return textoFinal;
    }
    public static char getCharAt(String texto, int pos) {
        try {
            return texto.charAt(pos);
        }
        catch(Exception e) {
            return ' ';
        }
    }
    public static String decodificarTexto(String textoInicial, int numColunas, int numFilas, char[] chave) {
        String textoFinal = "";

        for(int j = 0; j < numFilas; j++) {
            for(int k = 0; k < numColunas; k++) {
                int posicaoBuscada = (chave[k]-'0');
                int test = (j*numColunas) + posicaoBuscada;
                textoFinal += textoInicial.charAt(test);
            }
        }

        return textoFinal;
    }
    private void EncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncriptarActionPerformed
        ErroTexto1.setText("");
        String textoEncriptado;
        
        final int NUM_COLUNAS = 7;
        char[] chave = new char[NUM_COLUNAS];
        chave = Chave.getText().toCharArray();
        System.out.println(new String(chave));
        // Set para evitar numeros duplicados
        Set<Character> setAux = new HashSet<Character>();
        for(int i = 0; i < chave.length; i++) {
            setAux.add(chave[i]);
        }
        Iterator<Character> setIterator = setAux.iterator();
        String test = "";
        while(setIterator.hasNext()) {
            test += setIterator.next();
        }
        chave = test.toCharArray();
        System.out.println(new String(chave));
        Chave.setText(new String(chave));

        String textoBase = TextoInicial.getText();
        if(Chave.getText().length() == 7){
            final int NUM_FILAS = (int) Math.ceil((double) textoBase.length() / NUM_COLUNAS); // numero de caracteres por coluna

            textoEncriptado = codificarTexto(textoBase, NUM_COLUNAS, NUM_FILAS, chave);

            TextoEncriptado.setText(textoEncriptado);
            
            Decriptar.setEnabled(true);
        }else{
            ErroTexto1.setText("tamanho da chave");
        }  
    }//GEN-LAST:event_EncriptarActionPerformed

    private void DecriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecriptarActionPerformed
        final int NUM_COLUNAS = 7;
        char[] chave = new char[NUM_COLUNAS];
        chave = Chave.getText().toCharArray();
        String textoBase = TextoEncriptado.getText();
        int NUM_FILAS = (int) Math.ceil((double) textoBase.length() / NUM_COLUNAS);
        
        String textoDecriptado = decodificarTexto(textoBase, NUM_COLUNAS, NUM_FILAS, chave);
        TextoDecriptado.setText(textoDecriptado);
    }//GEN-LAST:event_DecriptarActionPerformed

    private void ChaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChaveKeyPressed
        Chave.setEditable(true);
        String pass = Chave.getText();
        int caracteres = pass.length();
        if(Character.isISOControl(evt.getKeyChar())){
                Chave.setEditable(true);
        }else{
            for(int i=0;i<caracteres;i++){
                if(pass.charAt(i)==evt.getKeyChar()){
                    Chave.setEditable(false);
                    break;
                }
            }    
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
