/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jxareas.konnect;

import com.jxareas.konnect.ui.FormLogin;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jon Areas, @jxareas
 */
public class App {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame loginForm = new FormLogin();
            loginForm.setVisible(true);
            loginForm.setLocationRelativeTo(null);
        });
    }
    
}
