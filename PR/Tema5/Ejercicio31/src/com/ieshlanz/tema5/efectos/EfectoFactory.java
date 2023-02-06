package com.ieshlanz.tema5.efectos;

public class EfectoFactory {
    public static EfectoEspecial getEfecto(TipoEfecto tipo) {
        return tipo == TipoEfecto.INVERSO ? new EfectoInverso()
                : tipo == TipoEfecto.CORCHETES ? new EfectoCorchetes()
                        : tipo == TipoEfecto.GUIONES ? new EfectoGuiones()
                                : tipo == TipoEfecto.MAYUSCULAS ? new EfectoMayusculas() : null;
    }
}
