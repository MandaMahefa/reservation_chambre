package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.List;

public class DataProject implements Serializable {
    private List<Tache>tacheList ;
    private InformationProject informationProject;

    public List<Tache> getTacheList() {
        return tacheList;
    }

    public void setTacheList(List<Tache> tacheList) {
        this.tacheList = tacheList;
    }

    public InformationProject getInformationProject() {
        return informationProject;
    }

    public void setInformationProject(InformationProject informationProject) {
        this.informationProject = informationProject;
    }

    public DataProject() {
    }

    public DataProject(List<Tache> tacheList, InformationProject informationProject) {
        this.tacheList = tacheList;
        this.informationProject = informationProject;
    }
}
