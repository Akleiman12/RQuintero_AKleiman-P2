/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import rquintero_akleiman.p2.*;

/**
 *
 * @author Asher y Reynaldo
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    
    String recursos[];
    int maxRecursos[];
    int maxRecPros[];
    int solicitudes[];
    
    int IDpros;
    
    Prediccion prediccion;
    Deteccion deteccion;
    
    public InterfazPrincipal(String[] vector) {
        initComponents();
        try {
            Image i = ImageIO.read(getClass().getResource("/img/llave-con-sistema-de-regulacion-para-diferentes-tamanos-de-tuercas_318-62181.jpg"));
            setIconImage(i);
        } catch (IOException ex) {
            Logger.getLogger(IntroRec.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        recursos = vector;
        int aux=0;
        while(recursos[aux]!=null){
            comboRecPros.addItem(recursos[aux]);
            comboRec.addItem(recursos[aux]);
            aux=aux+2;
        }
        
        maxRecursos = new int[150];
        aux=1;
        int aux2=0;
        while(recursos[aux]!=null){
            maxRecursos[aux2]=Integer.parseInt(recursos[aux]);
            aux=aux+2;
            aux2++;
        }
        
        maxRecPros = new int[150];
        for (int i = 0; i < 150; i++) {
            maxRecPros[i]=0;
        }
        
        solicitudes = new int[150];
        for (int i = 0; i < 150; i++) {
            solicitudes[i]=0;
        }
        
        IDpros=0;
        
        
        prediccion = new Prediccion(maxRecursos, maxRecursos);
        deteccion = new Deteccion(maxRecursos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idPros = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboRecPros = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cantrecpros = new javax.swing.JTextField();
        agregarRecPros = new javax.swing.JButton();
        finalizarPros = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        recProsTotal = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        comboPros = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboRec = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cantRec = new javax.swing.JTextField();
        solicitud = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoPre = new javax.swing.JTextArea();
        pTotal = new javax.swing.JLabel();
        pBloqTot = new javax.swing.JLabel();
        pBloq = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pTotalC = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pTiempo = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pFin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dTotal = new javax.swing.JLabel();
        dBloqTot = new javax.swing.JLabel();
        dBloq = new javax.swing.JLabel();
        dTotalC = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        infoDet = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dElim = new javax.swing.JLabel();
        dTiempo = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        dFin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulacion S.O.");
        setPreferredSize(new java.awt.Dimension(900, 704));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Creacion de Procesos"));

        jLabel1.setText("ID del Proceso:");

        comboRecPros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recursos" }));

        jLabel2.setText("Cantidad:");

        agregarRecPros.setText("Agregar");
        agregarRecPros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                agregarRecProsMouseReleased(evt);
            }
        });

        finalizarPros.setText("Finalizar");
        finalizarPros.setToolTipText("");
        finalizarPros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                finalizarProsMouseReleased(evt);
            }
        });
        finalizarPros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarProsActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione un Recurso:");

        recProsTotal.setEditable(false);
        recProsTotal.setColumns(20);
        recProsTotal.setRows(5);
        jScrollPane4.setViewportView(recProsTotal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboRecPros, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantrecpros, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(agregarRecPros))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(finalizarPros, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idPros, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(comboRecPros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(cantrecpros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agregarRecPros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalizarPros, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(jScrollPane4))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitud de Recursos"));

        jLabel4.setText("Seleccione un Proceso:");

        comboPros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procesos" }));

        jLabel5.setText("Seleccione un Recurso:");

        comboRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recursos" }));

        jLabel6.setText("Cantidad:");

        cantRec.setText("0");

        solicitud.setText("Hacer Solicitud");
        solicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                solicitudMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboPros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboRec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantRec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(solicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboPros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cantRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(solicitud)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Prediccion"));

        jLabel7.setText("Numero de Procesos en el Sistema:");

        jLabel8.setText("Procesos Bloqueados:");

        jLabel9.setText("Procesos Finalizados:");

        infoPre.setEditable(false);
        infoPre.setColumns(20);
        infoPre.setRows(5);
        jScrollPane2.setViewportView(infoPre);

        pTotal.setText("0");

        pBloqTot.setText("0");

        pBloq.setText("0");

        jLabel10.setText("Procesos Totales Creados:");

        pTotalC.setText("0");

        jLabel12.setText("Tiempo del Algoritmo:");

        pTiempo.setText("0");

        jLabel18.setText("Procesos Bloqueados Totales:");

        pFin.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel18)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pBloqTot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pBloq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)))
                            .addComponent(pFin))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pTotalC)
                            .addComponent(pTiempo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pTotal)
                    .addComponent(jLabel10)
                    .addComponent(pTotalC))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pBloqTot)
                    .addComponent(jLabel12)
                    .addComponent(pTiempo)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pBloq)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pFin)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Deteccion"));

        jLabel13.setText("Numero de Procesos en el Sistema:");

        jLabel14.setText("Procesos Bloqueados:");

        jLabel15.setText("Procesos Finalizados:");

        jLabel16.setText("Procesos Eliminados:");

        dTotal.setText("0");

        dBloqTot.setText("0");

        dBloq.setText("0");

        dTotalC.setText("0");

        infoDet.setEditable(false);
        infoDet.setColumns(20);
        infoDet.setRows(5);
        jScrollPane3.setViewportView(infoDet);

        jLabel20.setText("Procesos Totales Creados:");

        jLabel21.setText("Tiempo del Algoritmo");

        dElim.setText("0");

        dTiempo.setText("0");

        jLabel24.setText("Procesos Bloqueados Totales:");

        dFin.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(dTotal)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel24))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(dBloq)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(dBloqTot)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16))
                                    .addComponent(dFin))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dElim)
                            .addComponent(dTotalC)
                            .addComponent(dTiempo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(dTotal)
                    .addComponent(jLabel20)
                    .addComponent(dTotalC))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dBloqTot)
                    .addComponent(jLabel16)
                    .addComponent(dElim)
                    .addComponent(jLabel24))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(dTiempo)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(dBloq))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dFin))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalizarProsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarProsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalizarProsActionPerformed

    private void agregarRecProsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarRecProsMouseReleased
        try {
            if(Integer.parseInt(cantrecpros.getText())<1||comboRecPros.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null, "Porfavor seleccione un recurso e indique una cantidad correcta.", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                if(Integer.parseInt(cantrecpros.getText())<= maxRecursos[comboRecPros.getSelectedIndex()-1]){
                    if(maxRecPros[comboRecPros.getSelectedIndex()-1]==0){
                        recProsTotal.append(comboRecPros.getSelectedItem()+" "+Integer.parseInt(cantrecpros.getText())+"\n");
                        maxRecPros[comboRecPros.getSelectedIndex()-1]=Integer.parseInt(cantrecpros.getText());
                        comboRecPros.setSelectedIndex(0);
                        cantrecpros.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya se tiene el total necesario para el recurso. Utilice el boton Limpiar para empezar denuevo si lo desea.", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No hay suficientes recursos en el sistema para cumplir los requisitos de este proceso", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.toString()+"\n\nPorfavor introduzca un valor valido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarRecProsMouseReleased

    private void finalizarProsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarProsMouseReleased
        if(!idPros.getText().equals("")){
            if(!recProsTotal.getText().equals("")){
                
                comboPros.addItem(idPros.getText());
                prediccion.insertarProceso(maxRecPros, IDpros);
                deteccion.insertarProceso(IDpros, maxRecPros);
                
                comboRecPros.setSelectedIndex(0);
                idPros.setText("");
                cantrecpros.setText("");
                recProsTotal.setText("");
                
                for (int i = 0; i < 150; i++) {
                    maxRecPros[i]=0;
                }
                
                
                IDpros++;
            }else{    
                JOptionPane.showMessageDialog(null, "El proceso creado no necesita recursos.", "Proceso "+idPros.getText()+" finalizado", JOptionPane.INFORMATION_MESSAGE);
                idPros.setText("");
            }
            pTotalC.setText(Integer.toString(Integer.parseInt(pTotalC.getText())+1));
            dTotalC.setText(Integer.toString(Integer.parseInt(dTotalC.getText())+1));
            
        }else{
            JOptionPane.showMessageDialog(null, "El proceso no puede ser creado sin un ID.", "Proceso no pudo ser creado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_finalizarProsMouseReleased

    private void solicitudMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitudMouseReleased
        try {
            
            if(Integer.parseInt(cantRec.getText())<1 || comboPros.getSelectedItem().equals("Procesos") || comboRec.getSelectedItem().equals("Recursos")){
                JOptionPane.showMessageDialog(null, "Porfavor seleccione un proceso, un recurso e indique una cantidad correcta.", "Error", JOptionPane.ERROR_MESSAGE);
            
            
            }else{
                solicitudes[comboRec.getSelectedIndex()-1]=Integer.parseInt(cantRec.getText());
                int pAllocated[][] = prediccion.getAllocation();
                int pMax[][] = prediccion.getMaximo();
                int dAllocated[][] = deteccion.getAllocation();
                int dMax[][]= deteccion.getMaximo();
                
                if(pAllocated[comboPros.getSelectedIndex()-1][comboRec.getSelectedIndex()-1]+solicitudes[comboRec.getSelectedIndex()-1]<pMax[comboPros.getSelectedIndex()-1][comboRec.getSelectedIndex()-1]){
                    prediccion.correr(comboPros.getSelectedIndex()-1, solicitudes);
                    pBloqTot.setText(Integer.toString(prediccion.getBloqueadosTotal()));
                    pBloq.setText(Integer.toString(prediccion.getBloqueadosActual()));
                    pFin.setText(Integer.toString(prediccion.getProcesosFinalizados()));
                    pTiempo.setText(Long.toString(prediccion.getTiempo()));
                }else{
                    JOptionPane.showMessageDialog(null, "No se puede asignar esta cantidad de recursos al proceso.\n  Maximo: "+pMax[comboPros.getSelectedIndex()-1][comboRec.getSelectedIndex()-1]+"\n  Asignados: "+pAllocated[comboPros.getSelectedIndex()-1][comboRec.getSelectedIndex()-1], "Error Prediccion", JOptionPane.ERROR_MESSAGE);
                }
                
                if(dAllocated[comboPros.getSelectedIndex()-1][comboRec.getSelectedIndex()-1]+solicitudes[comboRec.getSelectedIndex()-1]<dMax[comboPros.getSelectedIndex()-1][comboRec.getSelectedIndex()-1]){
                    deteccion.correr(comboPros.getSelectedIndex()-1, solicitudes);
                    dBloqTot.setText(Integer.toString(deteccion.getBloqueadosTotal()));
                    dBloq.setText(Integer.toString(deteccion.getBloqueadosActual()));
                    dFin.setText(Integer.toString(deteccion.getProcesosFinalizados()));
                    dElim.setText(Integer.toString(deteccion.getEliminados()));
                    dTiempo.setText(Long.toString(deteccion.getTiempo()));
                }else{
                    JOptionPane.showMessageDialog(null, "No se puede asignar esta cantidad de recursos al proceso.\n  Maximo: "+dMax[comboPros.getSelectedIndex()-1][comboRec.getSelectedIndex()-1]+"\n  Asignados: "+dAllocated[comboPros.getSelectedIndex()-1][comboRec.getSelectedIndex()-1], "Error Deteccion", JOptionPane.ERROR_MESSAGE);
                }

                

                
                cantRec.setText("0");
                comboPros.setSelectedIndex(0);
                comboRec.setSelectedIndex(0);
                
                for (int i = 0; i < 150; i++) {
                    solicitudes[i]=0;
                }
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.toString()+"\n\nPorfavor introduzca un valor valido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_solicitudMouseReleased

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            IntroRec ventana = new IntroRec();
            ventana.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarRecPros;
    private javax.swing.JTextField cantRec;
    private javax.swing.JTextField cantrecpros;
    private javax.swing.JComboBox<String> comboPros;
    private javax.swing.JComboBox<String> comboRec;
    private javax.swing.JComboBox<String> comboRecPros;
    private javax.swing.JLabel dBloq;
    private javax.swing.JLabel dBloqTot;
    private javax.swing.JLabel dElim;
    private javax.swing.JLabel dFin;
    private javax.swing.JLabel dTiempo;
    private javax.swing.JLabel dTotal;
    private javax.swing.JLabel dTotalC;
    private javax.swing.JButton finalizarPros;
    private javax.swing.JTextField idPros;
    private javax.swing.JTextArea infoDet;
    private javax.swing.JTextArea infoPre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel pBloq;
    private javax.swing.JLabel pBloqTot;
    private javax.swing.JLabel pFin;
    private javax.swing.JLabel pTiempo;
    private javax.swing.JLabel pTotal;
    private javax.swing.JLabel pTotalC;
    private javax.swing.JTextArea recProsTotal;
    private javax.swing.JButton solicitud;
    // End of variables declaration//GEN-END:variables
}
