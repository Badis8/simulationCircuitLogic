package com.benchamli.circuitsimulation.domain.gates;


import java.util.List;

import com.benchamli.circuitsimulation.domain.gates.gateinterfaces.Outputable;



//for me the most basicGate possible is just an element that returns a signal (so an outputable)
//also  a gat should have some inputs, those inputs are also outputables ! (outputables can be ever a gate, or a simple signal wrapper)
//an abstract function can not implmenet the interface right away
public abstract class CoreGate implements Outputable{

    protected List<Outputable> outputables;

    
    public   CoreGate( ) {
       
    }

 
   
}