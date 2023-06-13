/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.edu.upeu.app.tresenraya;

import java.util.prefs.Preferences;
import pe.edu.upeu.app.tresenraya.gui.GUIMain;
import pe.edu.upeu.app.tresenraya.util.UtilsX;

/**
 *
 * @author josep
 */
public class TresEnRaya {

    static Preferences userPrefs = Preferences.userRoot();

    public static void main(String[] args) {
        userPrefs.put("IDIOMAX", new UtilsX().readLanguageFile());
        userPrefs.put("PERFIL", "Admin");
        /*new GUIMain().setVisible(true);*/
        System.out.println("Hello World!");
    }
}
