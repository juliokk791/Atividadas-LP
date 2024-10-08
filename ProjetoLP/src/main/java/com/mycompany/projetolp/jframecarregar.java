/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetolp;

import javax.swing.SwingWorker;

/**
 *
 * @author Julio
 */
public class jframecarregar extends javax.swing.JFrame {

    /**
     * Creates new form jframecarregar
     */
    public jframecarregar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroudPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        loading = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroudPanel.setBackground(new java.awt.Color(0, 102, 255));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Julio\\OneDrive\\Área de Trabalho\\governo.jpeg")); // NOI18N
        Logo.setText("logo");

        heading.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        heading.setText("REPUBLICA MATRIZ");

        javax.swing.GroupLayout backgroudPanelLayout = new javax.swing.GroupLayout(backgroudPanel);
        backgroudPanel.setLayout(backgroudPanelLayout);
        backgroudPanelLayout.setHorizontalGroup(
            backgroudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroudPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
            .addGroup(backgroudPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(backgroudPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroudPanelLayout.setVerticalGroup(
            backgroudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroudPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Logo)
                .addGap(18, 18, 18)
                .addComponent(heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroudPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroudPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            jframecarregar wel = new jframecarregar();
            wel.setVisible(true);
            new LoadingTask(wel).execute(); // Inicia a tarefa de carregamento
        });
    }

    // Tarefa de carregamento com SwingWorker
    private static class LoadingTask extends SwingWorker<Void, Integer> {
        private final jframecarregar frame;

        public LoadingTask(jframecarregar frame) {
            this.frame = frame;
        }

        @Override
        protected Void doInBackground() throws Exception {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(60);
                publish(i); // Publica o progresso
            }
            return null;
        }

        @Override
        protected void process(java.util.List<Integer> chunks) {
            for (Integer value : chunks) {
                frame.loading.setValue(value);
            }
        }

        protected void done() {
            frame.setVisible(false);
            new Login().setVisible(true);
            frame.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel backgroudPanel;
    private javax.swing.JLabel heading;
    private javax.swing.JProgressBar loading;
    // End of variables declaration//GEN-END:variables
}
