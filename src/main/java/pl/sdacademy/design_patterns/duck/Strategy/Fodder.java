package pl.sdacademy.design_patterns.duck.Strategy;

public class Fodder {

    private Integer cornGrams;
    private Integer wheatGrams;
    private Integer oatGrams;
    private Integer triticaleGrams;
    private Boolean vitamins;
    private Boolean minerals;

    private Fodder (Builder builder) {
        cornGrams = builder.cornGrams;
        wheatGrams = builder.wheatGrams;
        oatGrams = builder.oatGrams;
        triticaleGrams = builder.triticaleGrams;
        vitamins = builder.vitamins;
        minerals = builder.minerals;
    }


    public Integer getCornGrams() {
        return cornGrams;
    }

    public Integer getWheatGrams() {
        return wheatGrams;
    }

    public Integer getOatGrams() {
        return oatGrams;
    }

    public Integer getTriticaleGrams() {
        return triticaleGrams;
    }

    public Boolean getVitamins() {
        return vitamins;
    }

    public Boolean getMinerals() {
        return minerals;
    }

    public static Builder builder (Integer cornGrams, Integer wheatGrams) {
        if (cornGrams == null || cornGrams <0) {
            throw new IllegalArgumentException("Corn must be provided");
        }
        if ((wheatGrams == null || wheatGrams <0)) {
            throw new IllegalArgumentException("Wheat must be provided");
        }
        return new Builder(cornGrams, wheatGrams);
    }

    @Override
    public String toString() {
        return "Fodder{" +
                "cornGrams=" + cornGrams +
                ", wheatGrams=" + wheatGrams +
                ", oatGrams=" + oatGrams +
                ", triticaleGrams=" + triticaleGrams +
                ", vitamins=" + vitamins +
                ", minerals=" + minerals +
                '}';
    }

    public static class Builder {

        private Integer cornGrams;
        private Integer wheatGrams;
        private Integer oatGrams;
        private Integer triticaleGrams;
        private Boolean vitamins;
        private Boolean minerals;

        public Builder(Integer cornGrams, Integer wheatGrams) {
            this.cornGrams = cornGrams;
            this.wheatGrams = wheatGrams;
        }


        public Fodder build () {
            return new Fodder(this);

        }

        public Builder CornGrams(Integer cornGrams) {
            this.cornGrams = cornGrams;
            return this;
        }

        public Builder WheatGrams(Integer wheatGrams) {
            this.wheatGrams = wheatGrams;
            return this;
        }

        public Builder OatGrams(Integer oatGrams) {
            this.oatGrams = oatGrams;
            return this;
        }

        public Builder TriticaleGrams(Integer triticaleGrams) {
            this.triticaleGrams = triticaleGrams;
            return this;
        }

        public Builder Vitamins(Boolean vitamins) {
            this.vitamins = vitamins;
            return this;
        }

        public Builder Minerals(Boolean minerals) {
            this.minerals = minerals;
            return this;
        }
    }


}
