/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

/**
 *
 * @author UCC
 */
public class Data {
    
    String power;
    String name;
    String alias;
    int age;

    public Data() {
        this.power = "";
        this.name = "";
        this.alias = "";
        this.age = 0;
    }
    
    public Data(String name, String power, String alias, int age) { 
    this.name = name;
    this.power = power;
    this.alias = alias;
    this.age = age;
}

    
    
    
    public String getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public int getAge() {
        return age;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Data{" + "power=" + power + ", name=" + name + ", alias=" + alias + ", age=" + age + '}';
    }
    
    
    
    
    
}
