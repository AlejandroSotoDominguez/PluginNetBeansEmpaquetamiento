/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.pluginnetbeansempaquetamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.myorg.pluginnetbeansempaquetamiento.PluginNetBeansEmpaquetamiento"
)
@ActionRegistration(
        iconBase = "org/myorg/pluginnetbeansempaquetamiento/icon24.png",
        displayName = "#CTL_PluginNetBeansEmpaquetamiento"
)
@ActionReference(path = "Toolbars/File", position = 0)
@Messages("CTL_PluginNetBeansEmpaquetamiento=PluginNetBeansEmpaquetamiento")
public final class PluginNetBeansEmpaquetamiento implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            
            // Le pasamos los parámetros al comando javapackager
            String cmd = "javapackager -deploy -native deb -Bcategory=Education "
                + "-Bicon="+JOptionPane.showInputDialog("ruta del icono") 
                + " -BlicenseType=Propietary "
                + " -outdir "+JOptionPane.showInputDialog("ruta de salida")
                + " -outfile "+JOptionPane.showInputDialog("nombre de la aplicacion")
                + " -srcdir "+JOptionPane.showInputDialog("ruta para el paquete")
                + " -srcfiles "+JOptionPane.showInputDialog("nombre de la aplicacion")+".jar"
                + " -appclass "+JOptionPane.showInputDialog("clase main")
                + " -name "+JOptionPane.showInputDialog("nombre")
                + " -title "+JOptionPane.showInputDialog("título");
            

            // Ejecutamos el comando javapackager
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(cmd);

            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

            String line=null;
            
            while((line=input.readLine()) != null) {
                System.out.println(line);
            }
 
            int exitVal = pr.waitFor();
            System.out.println("Exited with error code "+exitVal);
            
        }catch(IOException ex){
            Exceptions.printStackTrace(ex);
        }catch(InterruptedException ex){
            Exceptions.printStackTrace(ex);
        }
    }
}
