package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Esta clase es para crear una agenda con contactos
 * @version 1.0
 * @author Jonathan Ronaldo
 * @since 05/03/24
 */
public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Contacto

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Metodo addContact para añadir un contacto a la agenda con su nombre y telefono, si ya existe se añadira el telefono
     * @param name Nombre del contacto
     * @param phone Numero de telefono del contacto
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Metodo removeContact para quitar un contacto de la agenda por su nombre
     * @param name Nombre del contacto a eliminar
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Metodo modifyPhoneNumber para modificar el numero de telefono de un contacto introduciendo su antiguo y nuevo numero
     * @param name Nombre del contacto a modificar
     * @param oldPhone Antiguo numero de telefono del contacto
     * @param newPhone Nuevo numero de telefono del contacto
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Metodo get para que devuelva la lista de contactos de la agenda
     * @return La agenda de contactos
     */
    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}