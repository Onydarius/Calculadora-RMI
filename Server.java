package com.ony.practicas;

import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Server {
    public static void main(String[] args) {
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.bind("Calculadora", new CalculatorServer());
            JOptionPane.showMessageDialog(null, "Servidor conectado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error servidor no conectado! \n" + e);
        }
    }
}
