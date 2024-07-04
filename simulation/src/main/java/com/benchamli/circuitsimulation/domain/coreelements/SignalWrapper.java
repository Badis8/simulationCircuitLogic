package com.benchamli.circuitsimulation.domain.coreelements;

import com.benchamli.circuitsimulation.domain.gates.gateinterfaces.Outputable;

import com.benchamli.circuitsimulation.domain.coreelements.Signal;

//this class  represent the wires at the bottom of the circuit tree , or actually any wires !!! 
//we can bruit force ones and zeros with this simpal signalWrapper, and the gates , could get just something outputable

public class SignalWrapper implements Outputable {

    private Signal signal;
 
    @Override
    public Signal output() {
       return this.signal;
}
   public void setPassing(){
    this.signal=Signal.PASSING;
   } 

 
public void setBlocking(){
 this.signal=Signal.BLOCKING;
}

}

 