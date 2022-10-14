
package edu.jsu.mcis.cs310.tas_fa22;

import java.time.LocalDateTime;

public class Punch {
    
    //adjustmenttype
    // Punch(int terminalid, Badge badge, EventType punchtype); constructor for punch class
    // Punch(int id, int terminalid, Badge badge, LocalDateTime originaltimestamp, EventType punchtype);
    
    /*
    
In addition to the information about punches given in the database (in the "event" table), 
including the original timestamp, this class should include an extra instance field for the adjusted timestamp, as well as a PunchAdjustmentType field called "adjustmenttype"; 
these will become important in later features.  
(The PunchAdjustmentType data type has already been provided for you in the initial team repository, 
in the form of a simple enumeration.)
    
    
    
    */
    
    private int id;
    private final int terminalid;
    private final Badge badge;
    private LocalDateTime originaltimestamp;
    private final EventType punchtype;
    private final PunchAdjustmentType adjustmenttype;
    
    
    
    
    
    Punch(int terminalid, Badge badge, EventType punchtype, PunchAdjustmentType adjustmenttype) {
        this.terminalid = terminalid;
        this.badge = badge;
        this.punchtype = punchtype;
        this.adjustmenttype = adjustmenttype;
    }
            
            
    Punch(int id, int terminalid, Badge badge, LocalDateTime originaltimestamp, EventType punchtype, PunchAdjustmentType adjustmenttype) {
        this.id = id;
        this.terminalid = terminalid;  
        this.originaltimestamp = originaltimestamp;
        this.badge = badge;
        this.punchtype = punchtype;
        this.adjustmenttype = adjustmenttype;
    
    }
    

    public int getId() {
        return id;
    }

    public int getTerminalid() {
        return terminalid;
    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();

        s.append('#').append(id).append(' ');
        s.append('(').append(terminalid).append(')');
       

        return s.toString();
        

//return "Punch{" + "id=" + id + ", terminalid=" + terminalid + '}';
    }
    
    
    
    
    


    
}