package pl.sdacademy.design_patterns.duck;

public class DuckEgg {

    private final Double yolkWeigth;
    private final Double whiteWeigth;
    private final Double totalWeigth;

    private DuckEgg(Double yolkWeigth, Double whiteWeigth, Double totalWeigth) {
        this.yolkWeigth = yolkWeigth;
        this.whiteWeigth = whiteWeigth;
        this.totalWeigth = totalWeigth;
    }

    public Double getYolkWeigth() {
        return yolkWeigth;
    }

    public Double getWhiteWeigth() {
        return whiteWeigth;
    }

    public Double getTotalWeigth() {
        return totalWeigth;
    }

    @Override
    public String toString() {
        return "DuckEgg{" +
                "yolkWeigth=" + yolkWeigth +
                ", whiteWeigth=" + whiteWeigth +
                ", totalWeigth=" + totalWeigth +
                '}';
    }

    public static class Builder {
        private Double yolkWeigth;

        public void setYolkWeight(Double yolkWeigth) {
           this.yolkWeigth = yolkWeigth;
        }


        public DuckEgg build() {
            Double calculatefYolk = yolkWeigth != null ? yolkWeigth : 0D;

            Double calculatedWhiteWeith = Math.max(calculatefYolk * 1.2, 31D);

            Double calculatedMembraneWeigth = (calculatefYolk + calculatedWhiteWeith) * 0.005;

            Double calculatedShellWeigth = Math.max(calculatedWhiteWeith * 0.07, 3D);

            Double totalWeigth = calculatedMembraneWeigth + calculatedShellWeigth + calculatedWhiteWeith +calculatefYolk;

            return new DuckEgg(calculatefYolk,calculatedWhiteWeith,totalWeigth);

        }

    }

}
