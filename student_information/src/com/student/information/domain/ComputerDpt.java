/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.information.domain;

import java.awt.Image;
import java.io.InputStream;


/**
 *
 * @author anik
 */
public class ComputerDpt {
    
    private int id;
    private int student_id;
    private String student_fst_name;
    private String student_sur_name;
    private String date_of_birth;
    private String gander;
    private String email;
    private String number;
    private String present_address;
    private String permanent_address;
    private String house_no;
    private int post_code;
    private int dpt_code;
    private InputStream image;
    private byte[] getImage;
   
    
    
    public ComputerDpt() {
          
    }

    public ComputerDpt(int student_id, String student_fst_name, String student_sur_name, String date_of_birth, String gander, String email, String number, String present_address, String permanent_address, String house_no, int post_code, int dpt_code) {
        this.student_id = student_id;
        this.student_fst_name = student_fst_name;
        this.student_sur_name = student_sur_name;
        this.date_of_birth = date_of_birth;
        this.gander = gander;
        this.email = email;
        this.number = number;
        this.present_address = present_address;
        this.permanent_address = permanent_address;
        this.house_no = house_no;
        this.post_code = post_code;
        this.dpt_code = dpt_code;
    }
    

    public byte[] getGetImage() {
        return getImage;
    }

    public void setGetImage(byte[] getImage) {
        this.getImage = getImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_fst_name() {
        return student_fst_name;
    }

    public void setStudent_fst_name(String student_fst_name) {
        this.student_fst_name = student_fst_name;
    }

    public String getStudent_sur_name() {
        return student_sur_name;
    }

    public void setStudent_sur_name(String student_sur_name) {
        this.student_sur_name = student_sur_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPresent_address() {
        return present_address;
    }

    public void setPresent_address(String present_address) {
        this.present_address = present_address;
    }

    public String getPermanent_address() {
        return permanent_address;
    }

    public void setPermanent_address(String permanent_address) {
        this.permanent_address = permanent_address;
    }

    public String getHouse_no() {
        return house_no;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public int getPost_code() {
        return post_code;
    }

    public void setPost_code(int post_code) {
        this.post_code = post_code;
    }

    public int getDpt_code() {
        return dpt_code;
    }

    public void setDpt_code(int dpt_code) {
        this.dpt_code = dpt_code;
    }

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }

    
}
