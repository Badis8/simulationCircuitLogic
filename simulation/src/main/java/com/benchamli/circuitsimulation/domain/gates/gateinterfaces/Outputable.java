package com.benchamli.circuitsimulation.domain.gates.gateinterfaces;

 
import com.benchamli.circuitsimulation.domain.coreelements.Signal;
//this interface will tell if a class should output a signal or not 
//ps: we can declare a variable to be of type outputable, any class implementing outputable gets passed to that variable
// later on youll notice that every gate has many outputables as inptu

public interface Outputable {
    public Signal output();
}
