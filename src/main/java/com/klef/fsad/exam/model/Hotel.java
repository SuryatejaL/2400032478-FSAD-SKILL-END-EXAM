package com.klef.fsad.exam.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    private int id;   // manual ID (IMPORTANT: no @GeneratedValue)

    private String name;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String status;

    public Hotel() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}