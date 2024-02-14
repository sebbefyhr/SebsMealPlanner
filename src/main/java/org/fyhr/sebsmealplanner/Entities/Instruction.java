package org.fyhr.sebsmealplanner.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Instruction")
public class Instruction {

    @Id
    @Column(name="instruciton_name")
    private String instruction;

    public Instruction(){

    }

    public Instruction(String instruction) {
        this.instruction = instruction;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "instruction='" + instruction + '\'' +
                '}';
    }
}
