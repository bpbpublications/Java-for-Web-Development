/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author AMIT
 */
public class Login2 {
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    public Login2() {
    }
    
    public String execute() throws Exception {
          if(uname.equals("Sarika"))
        return("Success");
    else
        return("Invalid");
    
     
    }
    
}
