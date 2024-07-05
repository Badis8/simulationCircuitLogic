package com.benchamli.circuitsimulation.domain.gates.standardGates;

import com.benchamli.circuitsimulation.domain.coreelements.Signal;
import com.benchamli.circuitsimulation.domain.gates.CoreGate;
import com.benchamli.circuitsimulation.domain.gates.gateinterfaces.Outputable;

public class NotGate extends CoreGate{




    public void link(Outputable output){
        if(super.outputables.size() == 1){
            
            super.outputables.add(output);
        }
    }

    @Override
    public Signal output() {
       return Signal.values()[super.outputables.get(0).output().ordinal() ^ 1]; //too ugly from the enum , if you aggree ill replace the enum with a skibidi wrapper, i dont use a skibi silple int type becasue they 
                                                                                        //say le tout est class dans java, dont know why tho , but want to see the benefits
    }

 
    
}
