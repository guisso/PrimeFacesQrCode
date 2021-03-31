package br.edu.ifnmg.enterprise.primefacesqrcode;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 */
@Named
@RequestScoped
public class QrCodeView {

    private String value;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getValue() {
        return value;
    }

    public void setValue(String value) 
            throws InterruptedException {
        Thread.sleep(2000);
        this.value = value;
    }
    //</editor-fold>
    
    public void processar() {
        FacesMessage facesMessage = new FacesMessage(
                FacesMessage.SEVERITY_INFO, 
                "Concluído", 
                "QR code do CPF gerado com sucesso."
        );
        
        FacesContext.getCurrentInstance()
                .addMessage("informacao", facesMessage);
    }

}
