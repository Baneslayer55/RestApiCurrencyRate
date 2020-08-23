package com.currencyrateinfo.currencyrateinfo.classes;

public class ErrorMessages {

    private Integer Id;

    private String Text;

    public ErrorMessages(Integer id, String text) {
        Id = id;
        Text = text;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
