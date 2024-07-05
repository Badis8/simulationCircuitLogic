package com.benchamli.circuitsimulation.domain.gates.standardGates;

import java.util.List;

import com.benchamli.circuitsimulation.domain.gates.CoreGate;
import com.benchamli.circuitsimulation.domain.gates.gateinterfaces.Outputable;

import io.netty.util.Signal;

//these repretent the middle of the tree gates they can get linked (the link always accures behind tho)
 
public abstract class StandardNumeberedPins extends CoreGate  {
    
    private final int pinsLimit;

    public StandardNumeberedPins(int limit){

        this.pinsLimit=limit;

    }
    public void link(CoreGate gateToLink,int pinsLimit){
        if  (super.outputables.size()<this.pinsLimit){

            super.outputables.add(gateToLink);
             //else exception
        }
    }
   
}