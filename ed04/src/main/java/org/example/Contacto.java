package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es para crear un contacto Introduciendo su nombre y numero de telefono
 * @version 1.0
 * @author Jonathan Ronaldo
 * @since 05/03/24
 */
public class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Con este metodo se crea un contacto introduciendo su nombre y numero de telefono
     * @param name El nombre del contacto
     * @param phone El numero de telefono del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Metodo get para devolvernos los nombres de los contactos
     * @return Nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Metodo get para devolvernos los numeros de los contactos
     * @return Numero de telefono de los contactos
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}