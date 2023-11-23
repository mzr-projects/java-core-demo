package com.mt.designPatterns.creationals.builder;

import lombok.Getter;

@Getter
public class AirCraft {

    private final String engine;
    private final String wings;
    private final String bathRoom;
    private final String cockPit;

    private AirCraft(AirCraftBuilder airCraftBuilder) {
        this.engine = airCraftBuilder.engine;
        this.wings = airCraftBuilder.wings;
        this.bathRoom = airCraftBuilder.bathRoom;
        this.cockPit = airCraftBuilder.cockPit;
    }

    @Override
    public String toString() {
        return "AirCraftBuilder{" +
                "engine='" + engine + '\'' +
                ", wings='" + wings + '\'' +
                ", bathRoom='" + bathRoom + '\'' +
                ", cockPit='" + cockPit + '\'' +
                '}';
    }

    static class AirCraftBuilder {

        private String engine;
        private String wings;
        private String bathRoom;
        private String cockPit;

        public AirCraftBuilder(String engine, String wings, String cockPit) {
            this.engine = engine;
            this.wings = wings;
            this.cockPit = cockPit;
        }

        public AirCraftBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public AirCraftBuilder setWings(String wings) {
            this.wings = wings;
            return this;
        }

        public AirCraftBuilder setBathRoom(String bathRoom) {
            this.bathRoom = bathRoom;
            return this;
        }

        public AirCraftBuilder setCockPit(String cockPit) {
            this.cockPit = cockPit;
            return this;
        }

        public AirCraft build() {
            return new AirCraft(this);
        }
    }
}