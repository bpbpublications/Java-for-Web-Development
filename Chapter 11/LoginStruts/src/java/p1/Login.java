/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
public class Login {
    private String uname;
    public Login(){}
 public String execute() throws Exception {
        
    
    if(uname.equals("Sarika"))
        return("Success");
    else
        return("Invalid");
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    
}
