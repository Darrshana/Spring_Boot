package com.darrshana.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
@Id
private int pid;
private String pnam;
private String tech;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPnam() {
	return pnam;
}
public void setPnam(String pnam) {
	this.pnam = pnam;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", pnam=" + pnam + ", tech=" + tech + "]";
}


}
