package com.look.tracking.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "patient")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Patient {

    @Id
    private ObjectId _id;
    private String code;
    private String name;

    /*public Patient(ObjectId _id, String code, String name) {
        this._id = _id;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "_id=" + _id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectId get_id() {
        return _id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }*/
}
