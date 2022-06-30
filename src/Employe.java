public  class Employe { // parent class, super class , base class
    //inheritence => existing character transfers from parent to child
    private String ename;
    private int esal;

    Employe(String name,int sal){
        this.ename=name;
        this.esal=sal;
    }
    Employe(){

    }

    public void getName(){
        System.out.println(ename);
    }
    public void setName(String str){
        this.ename=str;
    }
    public  int getSal(){
     return esal;
    }
    public void setSal(int sal){
        this.esal=sal;
    }

}

class Manager extends Employe{ // child class,sub class

    private int bonus;

    Manager(String name , int sal,int bonus){
        super(name,sal);
        this.bonus=bonus;
    }
    public void getBonus(){
        System.out.println(bonus);
    }
    public void setBonus(int b){
        this.bonus=b;
    }

    @Override
    public int getSal() {
        return bonus;
    }
    // method overriding



}
