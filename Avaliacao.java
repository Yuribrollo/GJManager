/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author Aluno
 */
public class Avaliacao {
    
    private int notaAval;
    private String comentAval;
    private Usuario avaliador;

    public int getNotaAval() {
        return notaAval;
    }

    public void setNotaAval(int notaAval) {
        this.notaAval = notaAval;
    }

    public String getComentAval() {
        return comentAval;
    }

    public void setComentAval(String comentAval) {
        this.comentAval = comentAval;
    }

    public Usuario getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Usuario avaliador) {
        this.avaliador = avaliador;
    }
    
    @Override
    public String toString() {
        return this.comentAval;
    }   
    
    
}
