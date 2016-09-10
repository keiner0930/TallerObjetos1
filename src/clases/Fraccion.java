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
public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) throws DenominadorCeroException {
        this.numerador = numerador;
        this.denominador = denominador;
        if (denominador == 0) {
            throw new DenominadorCeroException();
        }

    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion f2) throws DenominadorCeroException {
        Fraccion f;
        int num, den;

        num = this.numerador * f2.denominador + this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccion(num, den);
        return f;
    }

    public Fraccion restar(Fraccion f2) throws DenominadorCeroException {
        Fraccion f;
        int num, den;

        num = this.numerador * f2.denominador - this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccion(num, den);
        return f;
    }

    public Fraccion multiplicar(Fraccion f2) throws DenominadorCeroException {
        Fraccion f;
        int num, den;

        num = this.numerador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccion(num, den);
        return f;
    }

    public Fraccion dividir(Fraccion f2) throws DenominadorCeroException {
        Fraccion f;
        int num, den;

        num = this.numerador * f2.denominador;
        den = this.denominador * f2.numerador;
        f = new Fraccion(num, den);
        return f;
    }
}
