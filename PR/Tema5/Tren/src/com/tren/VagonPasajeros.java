package com.tren;

import java.util.*;

public class VagonPasajeros extends VagonPesoLimitado {
    private List<Persona> personas;

    public VagonPasajeros(int pm) {
        super(pm);
        this.personas = new ArrayList<>();
    }

    public void subir(Persona p) {
        if (p.getMaleta() != null) {
            if (this.getVagonSiguiente() != null) {
                boolean noAñadida = true;
                Vagon ultimoVagon = this;

                while (ultimoVagon.getVagonSiguiente() != null) {
                    ultimoVagon = ultimoVagon.getVagonSiguiente();
                }

                while (noAñadida) {
                    if (ultimoVagon instanceof VagonEquipaje v) {
                        v.añadir(p.getMaleta());
                        // No queda claro si en las instrucciones hay que quitarle la maleta al
                        // pasajero.
                        // p.setMaleta(null);
                        noAñadida = false;
                    } else {
                        ultimoVagon = ultimoVagon.getVagonAnterior();
                    }
                    if (ultimoVagon.getVagonAnterior() == null) {
                        throw new IllegalArgumentException("No se puede guardar la maleta del pasajero");
                    }
                }
                this.personas.add(p);
                this.comprobarPesoMaximoExcedido();
            } else {
                throw new IllegalArgumentException("No se puede guardar la maleta del pasajero");
            }
        } else {
            this.personas.add(p);
            this.comprobarPesoMaximoExcedido();
        }
    }

    public void bajar(Persona p) {

        boolean existe = false;
        for (Persona i : this.personas) {
            if (i.equals(p)) {
                existe = true;
            } else {
                // Si no existe no hacemos nada?
            }
        }

        if (existe) {
            this.personas.remove(p);
        }
        if (p.getMaleta() != null) {
            if (this.getVagonSiguiente() != null) {

                boolean noEliminada = true;
                Vagon ultimoVagon = this;
                while (ultimoVagon.getVagonSiguiente() != null) {
                    ultimoVagon = ultimoVagon.getVagonSiguiente();
                }

                while (noEliminada) {
                    if (ultimoVagon instanceof VagonEquipaje v) {
                        v.retirar(p.getMaleta());
                        noEliminada = false;
                    } else {
                        ultimoVagon = ultimoVagon.getVagonAnterior();
                        // Aquí no hacen falta protecciones, si ha subido con maleta tiene que haber en
                        // algún punto un vagón de equipajes
                    }
                }
            }
        }
    }

    @Override
    public int getPeso() {
        int peso = 0;
        for (Persona p : this.personas) {
            peso += p.getPeso();
        }
        return peso;
    }
}
