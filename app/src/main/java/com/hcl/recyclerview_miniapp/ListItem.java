package com.hcl.recyclerview_miniapp;

public class ListItem {

    private String heading;
    private String descrip;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public ListItem(String heading, String descrip) {
        this.heading = heading;
        this.descrip = descrip;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "heading='" + heading + '\'' +
                ", descrip='" + descrip + '\'' +
                '}';
    }
}
