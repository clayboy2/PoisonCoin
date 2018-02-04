/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import people.Employee;
import people.Person;

/**
 *
 * @author amclay2
 */
public class Defs {
    public static class ACCESS
    {
        public static int EMPLOYEE = 0;
        public static int MANAGER = 1;
        public static int ADMIN = 2;
        public static int OWNER = 3;
    }
    
    public static class ExitInfo
    {
        //Const defs
        public static int ERR_NOT_ALLOWED = -1;
        public static int SUCCESSFUL = 0;
        
        //Class Variables
        private final int errCode;
        private final String detailMessage;
        
        public ExitInfo(int errCode, String detailMessage)
        {
            this.errCode = errCode;
            this.detailMessage = detailMessage;
        }
        
        public int getCode()
        {
            return this.errCode;
        }
        
        public String getMessage()
        {
            return this.detailMessage;
        }
    }
    
    public static class SecurityLog
    {
        private final int code;
        private final String message;
        private final Employee offender;
        private final Person victim;
        
        public SecurityLog(int code, String message, Employee offender, Person victim)
        {
            this.code = code;
            this.message = message;
            this.offender = offender;
            this.victim = victim;
        }
        
        public int getCode()
        {
            return this.code;
        }
        
        public String getMessage()
        {
            return this.message;
        }
        
        public Employee getOffender()
        {
            return this.offender;
        }
        
        public Person getVictim()
        {
            return this.victim;
        }
        
        public void log()
        {
            
        }
    }
}
