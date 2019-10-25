package com.example.arquieiNFE;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "nfe" )
public class NFE {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonAlias(value = "acess-key")
    @NaturalId
    private String accessKey;

    @Column(length = 80000)
    private String xml;

    public NFE(){}

    public NFE(String accessKey, String xml) {
        this.accessKey = accessKey;
        this.xml = xml;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }
}
