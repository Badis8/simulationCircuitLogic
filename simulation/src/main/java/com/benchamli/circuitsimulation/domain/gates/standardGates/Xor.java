package com.benchamli.circuitsimulation.domain.gates.standardGates;

import com.benchamli.circuitsimulation.domain.coreelements.Signal;
import com.benchamli.circuitsimulation.domain.gates.gateinterfaces.Outputable;

public class Xor extends StandardNumeberedPins{

  public Xor(int limit){
        super(limit);
    }
    @Override
    public Signal output() {
        Signal result=super.outputables.get(0).output();
        for (int i = 1; i < super.outputables.size(); i++) {  
            Outputable input = super.outputables.get(i);
            result = Signal.values()[result.ordinal() ^ input.output().ordinal()]; //we lost the befenits of readability from declaring an enum , i'am open to delete the enum
        }
        return result;
    }
 
    
}
