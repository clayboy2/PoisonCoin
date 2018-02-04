/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import utils.Contact;
import utils.Defs;
import utils.Defs.ExitInfo;
import utils.Defs.SecurityLog;

/**
 *
 * @author amclay2
 */
public class Employee extends Person{
    private int ACCESS_LEVEL;
    
    public Employee(String name,Contact contactInfo)
    {
        super(name,contactInfo);
        this.ACCESS_LEVEL = 0;
    }
    
    public int getAccessLevel()
    {
        return this.ACCESS_LEVEL;
    }
    
    public ExitInfo setAccessLevel(int newLevel, Employee authority)
    {
        //If an authority tries to give higher access then the authority's access level
        if (authority.ACCESS_LEVEL < newLevel)
        {
            new SecurityLog(ExitInfo.ERR_NOT_ALLOWED, "Attempt to give user elevated priveleges", authority, this).log();
            return new ExitInfo(ExitInfo.ERR_NOT_ALLOWED, "Attempt to give user elevated priveleges");
        }
        //If an authority tries to change a higher authority
        if (authority.ACCESS_LEVEL < getAccessLevel())
        {
            new SecurityLog(ExitInfo.ERR_NOT_ALLOWED, "Attempt to change higher authority's access level", authority, this).log();
            return new ExitInfo(ExitInfo.ERR_NOT_ALLOWED, "Attempt to change higher authority's access level");
        }
        this.ACCESS_LEVEL = newLevel;
        return new ExitInfo(ExitInfo.SUCCESSFUL, "Success setting new privs");
    }
}
