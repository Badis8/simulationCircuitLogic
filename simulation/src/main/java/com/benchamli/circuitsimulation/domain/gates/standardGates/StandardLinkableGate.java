package com.benchamli.circuitsimulation.domain.gates.standardGates;

import java.util.List;

import com.benchamli.circuitsimulation.domain.gates.CoreGate;
import com.benchamli.circuitsimulation.domain.gates.gateinterfaces.Outputable;

import io.netty.util.Signal;

//these repretent the middle of the tree gates they can get linked (the link always accures behind tho)
 
public abstract class StandardLinkableGate extends CoreGate  {
  
    
   
 

    
    public void link(CoreGate gateToLink){
        if  (super.outputables.size()<2){

            super.outputables.add(gateToLink);
        }
    }
   
}