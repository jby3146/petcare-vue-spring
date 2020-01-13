package com.ssafy.deepening.dto;

import java.util.Objects;

public class SitterDto {
    String id;
    String name;
    String phone;
    String address;
    String subject;
    String created_at;
    String residence_type_id;
    String sitter_period_id;
    String pet_size_id;
    String sitter_type_id;
    String user_email;
    String residence_type;
    String sitter_period;
    String pet_size;
    String sitter_type;
    int daycare;
    int staycare;
    String imgurl;

    public SitterDto() {
    }

    public SitterDto(String id, String name, String phone, String address, String subject, String created_at, String residence_type_id, String sitter_period_id, String pet_size_id, String sitter_type_id, String user_email, String residence_type, String sitter_period, String pet_size, String sitter_type, int daycare, int staycare, String imgurl) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.subject = subject;
        this.created_at = created_at;
        this.residence_type_id = residence_type_id;
        this.sitter_period_id = sitter_period_id;
        this.pet_size_id = pet_size_id;
        this.sitter_type_id = sitter_type_id;
        this.user_email = user_email;
        this.residence_type = residence_type;
        this.sitter_period = sitter_period;
        this.pet_size = pet_size;
        this.sitter_type = sitter_type;
        this.daycare = daycare;
        this.staycare = staycare;
        this.imgurl = imgurl;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getResidence_type_id() {
        return this.residence_type_id;
    }

    public void setResidence_type_id(String residence_type_id) {
        this.residence_type_id = residence_type_id;
    }

    public String getSitter_period_id() {
        return this.sitter_period_id;
    }

    public void setSitter_period_id(String sitter_period_id) {
        this.sitter_period_id = sitter_period_id;
    }

    public String getPet_size_id() {
        return this.pet_size_id;
    }

    public void setPet_size_id(String pet_size_id) {
        this.pet_size_id = pet_size_id;
    }

    public String getSitter_type_id() {
        return this.sitter_type_id;
    }

    public void setSitter_type_id(String sitter_type_id) {
        this.sitter_type_id = sitter_type_id;
    }

    public String getUser_email() {
        return this.user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getResidence_type() {
        return this.residence_type;
    }

    public void setResidence_type(String residence_type) {
        this.residence_type = residence_type;
    }

    public String getSitter_period() {
        return this.sitter_period;
    }

    public void setSitter_period(String sitter_period) {
        this.sitter_period = sitter_period;
    }

    public String getPet_size() {
        return this.pet_size;
    }

    public void setPet_size(String pet_size) {
        this.pet_size = pet_size;
    }

    public String getSitter_type() {
        return this.sitter_type;
    }

    public void setSitter_type(String sitter_type) {
        this.sitter_type = sitter_type;
    }

    public int getDaycare() {
        return this.daycare;
    }

    public void setDaycare(int daycare) {
        this.daycare = daycare;
    }

    public int getStaycare() {
        return this.staycare;
    }

    public void setStaycare(int staycare) {
        this.staycare = staycare;
    }

    public String getImgurl() {
        return this.imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public SitterDto id(String id) {
        this.id = id;
        return this;
    }

    public SitterDto name(String name) {
        this.name = name;
        return this;
    }

    public SitterDto phone(String phone) {
        this.phone = phone;
        return this;
    }

    public SitterDto address(String address) {
        this.address = address;
        return this;
    }

    public SitterDto subject(String subject) {
        this.subject = subject;
        return this;
    }

    public SitterDto created_at(String created_at) {
        this.created_at = created_at;
        return this;
    }

    public SitterDto residence_type_id(String residence_type_id) {
        this.residence_type_id = residence_type_id;
        return this;
    }

    public SitterDto sitter_period_id(String sitter_period_id) {
        this.sitter_period_id = sitter_period_id;
        return this;
    }

    public SitterDto pet_size_id(String pet_size_id) {
        this.pet_size_id = pet_size_id;
        return this;
    }

    public SitterDto sitter_type_id(String sitter_type_id) {
        this.sitter_type_id = sitter_type_id;
        return this;
    }

    public SitterDto user_email(String user_email) {
        this.user_email = user_email;
        return this;
    }

    public SitterDto residence_type(String residence_type) {
        this.residence_type = residence_type;
        return this;
    }

    public SitterDto sitter_period(String sitter_period) {
        this.sitter_period = sitter_period;
        return this;
    }

    public SitterDto pet_size(String pet_size) {
        this.pet_size = pet_size;
        return this;
    }

    public SitterDto sitter_type(String sitter_type) {
        this.sitter_type = sitter_type;
        return this;
    }

    public SitterDto daycare(int daycare) {
        this.daycare = daycare;
        return this;
    }

    public SitterDto staycare(int staycare) {
        this.staycare = staycare;
        return this;
    }

    public SitterDto imgurl(String imgurl) {
        this.imgurl = imgurl;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SitterDto)) {
            return false;
        }
        SitterDto sitterDto = (SitterDto) o;
        return Objects.equals(id, sitterDto.id) && Objects.equals(name, sitterDto.name) && Objects.equals(phone, sitterDto.phone) && Objects.equals(address, sitterDto.address) && Objects.equals(subject, sitterDto.subject) && Objects.equals(created_at, sitterDto.created_at) && Objects.equals(residence_type_id, sitterDto.residence_type_id) && Objects.equals(sitter_period_id, sitterDto.sitter_period_id) && Objects.equals(pet_size_id, sitterDto.pet_size_id) && Objects.equals(sitter_type_id, sitterDto.sitter_type_id) && Objects.equals(user_email, sitterDto.user_email) && Objects.equals(residence_type, sitterDto.residence_type) && Objects.equals(sitter_period, sitterDto.sitter_period) && Objects.equals(pet_size, sitterDto.pet_size) && Objects.equals(sitter_type, sitterDto.sitter_type) && daycare == sitterDto.daycare && staycare == sitterDto.staycare && Objects.equals(imgurl, sitterDto.imgurl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, address, subject, created_at, residence_type_id, sitter_period_id, pet_size_id, sitter_type_id, user_email, residence_type, sitter_period, pet_size, sitter_type, daycare, staycare, imgurl);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", phone='" + getPhone() + "'" +
            ", address='" + getAddress() + "'" +
            ", subject='" + getSubject() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", residence_type_id='" + getResidence_type_id() + "'" +
            ", sitter_period_id='" + getSitter_period_id() + "'" +
            ", pet_size_id='" + getPet_size_id() + "'" +
            ", sitter_type_id='" + getSitter_type_id() + "'" +
            ", user_email='" + getUser_email() + "'" +
            ", residence_type='" + getResidence_type() + "'" +
            ", sitter_period='" + getSitter_period() + "'" +
            ", pet_size='" + getPet_size() + "'" +
            ", sitter_type='" + getSitter_type() + "'" +
            ", daycare='" + getDaycare() + "'" +
            ", staycare='" + getStaycare() + "'" +
            ", imgurl='" + getImgurl() + "'" +
            "}";
    }


    


}