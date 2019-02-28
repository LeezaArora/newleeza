package com.hexaware.ftp88;
import java.util.Date;



 class Student {
    private int sno;
    private String firstname;
    private String lastname;
    private Date dateofbirth;
    private String city;
    private double cgp;  


public Student() {

}

public Student (final int argsno,final String argfirstname,
    final String arglastname,final Date argdateofbirth,final String argcity, final double argcgp) {
        this.sno =  argsno;
        this.firstname = argfirstname;
        this.lastname= arglastname;
        this.dateofbirth = argdateofbirth;
        this.city = argcity;
        this.cgp = argcgp;
    
    }

    public final int getsno() {
        return sno;
    }
    public final void setsno(final int argsno) {
        this.sno = argsno;
    }
    public final String getfirstname() {
        return firstname;
    }
    public final void setfirstname(final String argfirstname) {
        this.firstname= argfirstname;
    }
    public final String getlastname() {
        return lastname; 
    }
    public final void setlastname(final String arglastname) {
        this.lastname = arglastname;
    }
    public final Date getdateofbirth() {
        return dateofbirth;
    }
    public final void setdateofbirth(final Date argdateofbirth) {
        this.dateofbirth = argdateofbirth;
    }
    public final String getcity() {
        return city;
    }
    public final void setcity(final String argcity) {
        this.city = argcity;
    }
    public final double getcgp() {
        return cgp;
    }
    public final void setcgp(final double argcgp) {
        this.cgp = argcgp;
    }
}