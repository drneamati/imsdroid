/*
* Copyright (C) 2010 Mamadou Diop.
*
* Contact: Mamadou Diop <diopmamadou(at)doubango.org>
*	
* This file is part of imsdroid Project (http://code.google.com/p/imsdroid)
*
* imsdroid is free software: you can redistribute it and/or modify it under the terms of 
* the GNU General Public License as published by the Free Software Foundation, either version 3 
* of the License, or (at your option) any later version.
*	
* imsdroid is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
* See the GNU General Public License for more details.
*	
* You should have received a copy of the GNU General Public License along 
* with this program; if not, write to the Free Software Foundation, Inc., 
* 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*
*/
package ietf.params.xml.ns.pidf.rpid;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "sphere", strict=false)
@Namespace(reference = "urn:ietf:params:xml:ns:pidf:rpid")
@Default(DefaultType.FIELD)
public class Sphere {

    protected Empty home;
    protected Empty work;
    protected Empty unknown;

    @Attribute
    protected String id;
    @Attribute
    protected String from; //FIXME: datetime
    @Attribute
    protected String until; //FIXME: datetime

    public Empty getHome() {
        return home;
    }
    
    public void setHome(Empty value) {
        this.home = value;
    }
    
    public Empty getWork() {
        return work;
    }
    
    public void setWork(Empty value) {
        this.work = value;
    }
    
    public Empty getUnknown() {
        return unknown;
    }
    
    public void setUnknown(Empty value) {
        this.unknown = value;
    }    
    
    public String getId() {
        return id;
    }
    
    public void setId(String value) {
        this.id = value;
    }
   
    public String getFrom() {
        return from;
    }
    
    public void setFrom(String value) {
        this.from = value;
    }

   
    public String getUntil() {
        return until;
    }

    
    public void setUntil(String value) {
        this.until = value;
    }
}
