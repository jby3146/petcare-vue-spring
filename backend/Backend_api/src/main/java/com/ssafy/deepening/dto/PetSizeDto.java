package com.ssafy.deepening.dto;

public class PetSizeDto {
    String id;
    String type;

    public PetSizeDto() {
    }

    public PetSizeDto(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PetSizeDto id(String id) {
        this.id = id;
        return this;
    }

    public PetSizeDto type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }


}