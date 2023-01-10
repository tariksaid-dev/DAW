public record DepositoAguaInmutable(int capacidadAcutal, int capacidadMaxima) {
    public DepositoAguaInmutable {
        if (capacidadAcutal < 0 || capacidadMaxima < 0 && capacidadAcutal > capacidadMaxima) {
            throw new IllegalArgumentException("Error");
        }
    }

    public DepositoAguaInmutable(int capacidadMaxima) {
        this(0, capacidadMaxima);
    }

    public DepositoAguaInmutable añadirLitro() {
        return new DepositoAguaInmutable(capacidadAcutal + 1, capacidadMaxima);
    }

    public DepositoAguaInmutable retirarLitro() {
        return new DepositoAguaInmutable(capacidadAcutal - 1, capacidadMaxima);
    }

    public DepositoAguaInmutable getPorcentaje() {
        return new DepositoAguaInmutable(capacidadAcutal * 100 / capacidadMaxima, capacidadMaxima);
    }
}