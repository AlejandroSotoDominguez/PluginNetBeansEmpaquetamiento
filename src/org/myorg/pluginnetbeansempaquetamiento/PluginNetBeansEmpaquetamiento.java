/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.pluginnetbeansempaquetamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
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
        // TODO implement action body
    }
}
