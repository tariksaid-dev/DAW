cambiar método pantalla a 

private void pantalla() {
    this.ejeX = new ArrayList<Integer>();
    this.ejeY = new ArrayList<Integer>();
    for (int i = 1; i < 4; i++) {
        ejeX.add((this.width / 3) * i - ((this.width / 3) / 2));
        ejeY.add((this.height / 3) * i - ((this.height / 3) / 2));
    }
}