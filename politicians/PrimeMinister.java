/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_task.politicians;

/**
 *
 * @author nisha
 */
public class PrimeMinister {
    public String name;
    public int salary;
    public int numOfBodyGuard;
    public String party;
    
    public void info(Security security,State state,House house ) {
        if(security!=null) {
            security.info();
            security.danger();
        } else System.err.println("Null exception inside info of Primeminister class for security");
        
        if(state!=null) {
            state.name();
            state.address();
        } else System.err.println("Null exception inside info of Primeminister class for state");
        
        if(house!=null) {
            house.name();
            house.color();
        } else System.err.println("Null exception inside info of Primeminister classfpr house");
        
        
        
    }
    
    // Calling Minister
    Minister minister;
    void callMinister() {
        minister.call();
    }
}
