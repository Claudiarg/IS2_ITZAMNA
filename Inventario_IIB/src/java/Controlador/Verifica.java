/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

/**
 *
 * @author beth
 */
public class Verifica {
    
    public static boolean verificaFormatoCorreo(String correo) {
        int n = 0;
        if (correo.length() != 0) {
            for (int i = 0; i < correo.length(); i++) {
                if (correo.getBytes()[i] == 64) {
                    n++;
                }
            }
            if (n == 1) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    
}
