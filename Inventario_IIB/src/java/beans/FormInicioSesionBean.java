/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author clau
 */
@Named(value = "InicioSesion")
@SessionScoped
public class FormInicioSesionBean implements Serializable {

    private String inputText;
    private String inputSecret;

    public FormInicioSesionBean() {
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String getInputSecret() {
        return inputSecret;
    }

    public void setInputSecret(String inputSecret) {
        this.inputSecret = inputSecret;
    }

    public String enviar() {
        return "Enviado";
    }
    public String ingresar(){
        return "Ingresar";
    }
    
    public String actualizar(){
        return "Actualizar";
    }
}
