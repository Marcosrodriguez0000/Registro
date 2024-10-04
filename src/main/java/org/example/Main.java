package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
    private JPanel panel = new JPanel();
    private JTextField nombre = new JTextField();
    private JTextField apellido = new JTextField();
    private JTextField edad = new JTextField();
    private JButton añadir = new JButton("Añadir");
    private JTable tabla1 = new JTable();
    private JTable tabla2  = new JTable();
    private DefaultTableModel modelo1;
    private DefaultTableModel modelo2;

    public Main() {
        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JScrollPane(tabla1), BorderLayout.WEST);
        panel.add(new JScrollPane(tabla2), BorderLayout.EAST);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.setSize(800, 600);
        this.setVisible(true);

        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.add(new JLabel("Nombre:"));
        formPanel.add(nombre);
        formPanel.add(new JLabel("Apellido:"));
        formPanel.add(apellido);
        formPanel.add(new JLabel("Edad:"));
        formPanel.add(edad);
        formPanel.add(añadir);
        panel.add(formPanel, BorderLayout.NORTH);

        modelo1 = new DefaultTableModel();
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Apellido");
        modelo1.addColumn("Edad");
        tabla1.setModel(modelo1);

        modelo1.addRow(new Object[]{"Juan", "Pérez", "30"});
        modelo1.addRow(new Object[]{"Ana", "García", "25"});
        modelo1.addRow(new Object[]{"Luis", "Martínez", "40"});


        modelo2 = new DefaultTableModel();
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Apellido");
        modelo2.addColumn("Edad");
        tabla2.setModel(modelo2);

        añadir.addActionListener(e -> {
            String[] fila = new String[3];
            fila[0] = nombre.getText();
            fila[1] = apellido.getText();
            fila[2] = edad.getText();
            modelo2.addRow(fila);
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}




