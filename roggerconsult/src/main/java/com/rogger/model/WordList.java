package com.rogger.model;

public class WordList {
    private String id;

    private String dictype;

    private String dictypename;

    private String dicno;

    private String dicname;

    private String isdel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDictype() {
        return dictype;
    }

    public void setDictype(String dictype) {
        this.dictype = dictype == null ? null : dictype.trim();
    }

    public String getDictypename() {
        return dictypename;
    }

    public void setDictypename(String dictypename) {
        this.dictypename = dictypename == null ? null : dictypename.trim();
    }

    public String getDicno() {
        return dicno;
    }

    public void setDicno(String dicno) {
        this.dicno = dicno == null ? null : dicno.trim();
    }

    public String getDicname() {
        return dicname;
    }

    public void setDicname(String dicname) {
        this.dicname = dicname == null ? null : dicname.trim();
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel == null ? null : isdel.trim();
    }
}