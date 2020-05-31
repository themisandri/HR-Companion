/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRCompanion;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Team {
    public ArrayList<User> reg_members;
    public ArrayList<User> empl_members;
    
    
     
    Team(ArrayList<User> reg_members,ArrayList<User> empl_members) { 
           this.reg_members = reg_members;
           this.empl_members = empl_members;
           
        }
}
