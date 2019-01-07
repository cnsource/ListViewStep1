package com.listview.demo.myapplication;

public class UserContent {
    public int iconId;
    public String name;
    public int age ;
    public String sex;

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public UserContent(int iconId, String name, int age, String sex){
        this.iconId=iconId;
        this.name=name;
        this.age=age;
        this.sex=sex;

    }
}
