/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author sony
 */
public class DenominadorCeroException extends Exception {
 public DenominadorCeroException(){
 super("No se permite denominador en cero");
 }      
}
