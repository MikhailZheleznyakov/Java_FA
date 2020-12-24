package com.company;

public enum Sizes {
    public enum Sizes {
        XXS(32) {
            @Override
            public String getDescription() {
                return "детский размер";
            }
        },
        XS(34),
        S(36),
        M(38),
        L(40);

        public String getDescription() {
            return "взрослый размер";
        }
        Sizes(int euroSize) {
            EuroSize = euroSize;
        }

        @Override
        public String toString() {
            return name() + ' ' + EuroSize + ' ' + getDescription();
        }

        private int EuroSize;
    }
}
