package ru.gb.familytree.FamilyTree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Human implements Serializable {
    private String name;
    private Gender gender;
    private LocalDate birthDate, deathDate;
    private List<Human> parents;
    private List<Human> children;

    public Human() {
        birthDate = LocalDate.MIN;
        deathDate = LocalDate.MAX;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public List<Human> getParents() {
        return parents;
    }

    public void setParents(List<Human> parents) {
        this.parents = parents;
    }

    public void addParent(Human parent) {
        this.parents.add(parent);
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void addChild(Human child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + "'" +
                ", gender='" + this.gender + "'" +
                ", birthdate='" + this.birthDate.toString() + "'" +
                ", deathdate='" + this.deathDate.toString() + "'";
    }
}
