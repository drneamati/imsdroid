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
package oma.xml.prs.pidf.oma_pres;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "network-availability", strict=false)
@Namespace(reference = "urn:oma:xml:prs:pidf:oma-pres")
@Default(DefaultType.FIELD)
public class NetworkAvailability {

    @ElementList(entry="network", inline=true, required = true)
    protected List<NetworkAvailability.Network> network;
    
    public List<NetworkAvailability.Network> getNetwork() {
        if (network == null) {
            network = new ArrayList<NetworkAvailability.Network>();
        }
        return this.network;
    }

    
    @Root(strict=false)
    @Namespace(reference = "urn:oma:xml:prs:pidf:oma-pres")
    @Default(DefaultType.FIELD)
    public static class Network {
    	@Element(required=false)
        protected EmptyType active;
    	@Element(required=false)
        protected EmptyType terminated;
        @Attribute(required = true)
        protected String id;
        
        public EmptyType getActive() {
            return active;
        }
       
        public void setActive(EmptyType value) {
            this.active = value;
        }
       
        public EmptyType getTerminated() {
            return terminated;
        }
       
        public void setTerminated(EmptyType value) {
            this.terminated = value;
        }
       
        public String getId() {
            return id;
        }
       
        public void setId(String value) {
            this.id = value;
        }
    }
}
