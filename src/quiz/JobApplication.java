/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Dimas
 */
public class JobApplication implements ProgrammerCriteria, DesignerCriteria, ManagerCriteria{
    double input1, input2, input3;
    double hasil;
    String nama;

    public JobApplication(String nama) {
        this.nama = nama;
    }
    
    public double keputusan(){
        return (input1+input2+input3)/3;
    }

    @Override
    public boolean ProgrammingKnowledge(double prog) {
        input1 = prog;
        return (prog>=0 && prog<=100) ? true : false;
    }

    @Override
    public boolean CleanCoding(double prog) {
        input2 = prog;
        return (prog>=0 && prog<=100) ? true : false;
    }

    @Override
    public boolean Debugging(double prog) {
        input3 = prog;
        return (prog>=0 && prog<=100) ? true : false;
    }

    @Override
    public boolean designPortofolio(double desain) {
        input1 = desain;
        return (desain>=0 && desain<=100) ? true : false;
    }

    @Override
    public boolean Prototyping(double desain) {
        input2 = desain;
        return (desain>=0 && desain<=100) ? true : false;
    }

    @Override
    public boolean Creativity(double desain) {
       input3 = desain;
        return (desain>=0 && desain<=100) ? true : false;
    }

    @Override
    public boolean Innovation(double manager) {
        input1 = manager;
        return (manager>=0 && manager<=100) ? true : false;
    }

    @Override
    public boolean DecisionMaking(double manager) {
        input2 = manager;
        return (manager>=0 && manager<=100) ? true : false;
    }

    @Override
    public boolean Communication(double manager) {
        input3 = manager;
        return (manager>=0 && manager<=100) ? true : false;
    }
    
}
