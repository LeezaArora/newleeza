package com.hexaware.ftp88;
import java.util.Objects;

public class Employ {
    private int empno;
    private String name;
    private String dept;
    private String design;
    private int basic;

    public Employ() {

    }

    public Employ (final int argempno,final String argname,
    final String argdept,final String argdesign,final int argbasic) {
        this.empno = argempno;
        this.name = argname;
        this.dept = argdept;
        this.design = argdesign;
        this.basic = argbasic;
    
    }
    public final int getEmpno() {
        return empno;
    }
    public final void setEmpno(final int argempno) {
        this.empno = argempno;
    }
    public final String getname() {
        return name;
    }
    public final void setname(final String argname) {
        this.name = argname;
    }
    public final String getdept() {
        return dept; 
    }
    public final void setdept(final String argdept) {
        this.dept = argdept;
    }
    public final String getdesign() {
        return design;
    }
    public final void setdesign(final String argdesign) {
        this.design = argdesign;
    }
    public final int getbasic() {
        return basic;
    }
    public final void setbasic(final int argbasic) {
        this.basic = argbasic;
    }
   /* @Override
    public final int hashcode() {
        return Objects.hash(empno,name,dept,design,basic);
    }*/
    @Override
    public final boolean equals(final Object ob) {
        if(ob == null) {
            return false;
        }
       if(getClass() !=ob.getClass()) {
           return false;
       }
       Employ e = (Employ) ob;
       if(Objects.equals(empno,e.empno) && Objects.equals(name, e.name) && Objects.equals(dept,e.dept) && Objects.equals(design,e.design)
       && Objects.equals(basic,e.basic))
       {
           return true;
       }
       return false;
    }
}