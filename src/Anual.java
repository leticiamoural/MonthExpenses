public enum Anual {
    JANUARY (1000F),
    FEBRUARY(2000F),
    MARCH(3000F),
    APRIL (4000F),
    MAY(5000F),
    JUNE(6000F),
    JULY (7000F),
    AUGUST(8000F),
    SEPTEMBER(9000F),
    OCTOBER (10000F),
    NOVEMBER(11000F),
    DECEMBER(12000F);

    private float valor;

    Anual(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return valor;
    }
    public static float getValorEspecifico(String month){
        Anual anual = Anual.valueOf(month);
        return anual.valor;
    }
}

