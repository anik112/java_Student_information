/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.information.service;

import com.student.information.connect.DBconnect;
import com.student.information.domain.TelecommunictionDpt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anik
 */
public class TelecommunictionDptService {

    private Connection connection;

    public void saveRecord(TelecommunictionDpt telecommunictionDpt) {

        try {
            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO dpt_telecommuniction(student_id,student_first_name,student_surname,date_of_birth,gender,email,mobile_number,present_address,permanent_address,house_no,post_code,dpt_code,student_image) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            statement.setInt(1, telecommunictionDpt.getStudent_id());
            statement.setString(2, telecommunictionDpt.getStudent_fst_name());
            statement.setString(3, telecommunictionDpt.getStudent_sur_name());
            statement.setString(4, telecommunictionDpt.getDate_of_birth());
            statement.setString(5, telecommunictionDpt.getGander());
            statement.setString(6, telecommunictionDpt.getEmail());
            statement.setString(7, telecommunictionDpt.getNumber());
            statement.setString(8, telecommunictionDpt.getPresent_address());
            statement.setString(9, telecommunictionDpt.getPermanent_address());
            statement.setString(10, telecommunictionDpt.getHouse_no());
            statement.setInt(11, telecommunictionDpt.getPost_code());
            statement.setInt(12, telecommunictionDpt.getDpt_code());
            statement.setBlob(13, telecommunictionDpt.getImage());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TelecommunictionDptService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editRecord(TelecommunictionDpt telecommunictionDpt) {

        try {
            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE dpt_telecommuniction SET student_id=?,student_first_name=?,student_surname=?,date_of_birth=?,gender=?,email=?,mobile_number=?,present_address=?,permanent_address=?,house_no=?,post_code=?,dpt_code=?,student_image=? WHERE id=?");

            statement.setInt(1, telecommunictionDpt.getStudent_id());
            statement.setString(2, telecommunictionDpt.getStudent_fst_name());
            statement.setString(3, telecommunictionDpt.getStudent_sur_name());
            statement.setString(4, telecommunictionDpt.getDate_of_birth());
            statement.setString(5, telecommunictionDpt.getGander());
            statement.setString(6, telecommunictionDpt.getEmail());
            statement.setString(7, telecommunictionDpt.getNumber());
            statement.setString(8, telecommunictionDpt.getPresent_address());
            statement.setString(9, telecommunictionDpt.getPermanent_address());
            statement.setString(10, telecommunictionDpt.getHouse_no());
            statement.setInt(11, telecommunictionDpt.getPost_code());
            statement.setInt(12, telecommunictionDpt.getDpt_code());
            statement.setBlob(13, telecommunictionDpt.getImage());
            statement.setInt(14, telecommunictionDpt.getId());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TelecommunictionDptService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteRecord(int id) {
        try {
            if (id != 0) {
                connection = DBconnect.getConnection();
                PreparedStatement stmt = connection.prepareStatement("DELETE FROM dpt_telecommuniction WHERE id=?");

                stmt.setInt(1, id);
                stmt.executeUpdate();
                //System.out.println(i + " record Deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelecommunictionDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public TelecommunictionDpt searchRecord(int student_id) {

        TelecommunictionDpt telecommunictionDpt = new TelecommunictionDpt();

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM dpt_telecommuniction WHERE student_id=?");
            statement.setInt(1, student_id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                telecommunictionDpt.setId(rs.getInt(1));
                telecommunictionDpt.setStudent_id(rs.getInt(2));
                telecommunictionDpt.setStudent_fst_name(rs.getString(3));
                telecommunictionDpt.setStudent_sur_name(rs.getString(4));
                telecommunictionDpt.setDate_of_birth(rs.getString(5));
                telecommunictionDpt.setGander(rs.getString(6));
                telecommunictionDpt.setEmail(rs.getString(7));
                telecommunictionDpt.setNumber(rs.getString(8));
                telecommunictionDpt.setPresent_address(rs.getString(9));
                telecommunictionDpt.setPermanent_address(rs.getString(10));
                telecommunictionDpt.setHouse_no(rs.getString(11));
                telecommunictionDpt.setPost_code(rs.getInt(12));
                telecommunictionDpt.setDpt_code(rs.getInt(13));
                telecommunictionDpt.setGetImage(rs.getBytes(14));
                telecommunictionDpt.setImage(rs.getBlob(14).getBinaryStream());
            }
            return telecommunictionDpt;

        } catch (SQLException ex) {
            Logger.getLogger(TelecommunictionDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<TelecommunictionDpt> getRecordList() {

        List<TelecommunictionDpt> list = new ArrayList<>();
        TelecommunictionDpt telecommunictionDpt;

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM dpt_telecommuniction");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                telecommunictionDpt = new TelecommunictionDpt();

                telecommunictionDpt.setId(rs.getInt(1));
                telecommunictionDpt.setStudent_id(rs.getInt(2));
                telecommunictionDpt.setStudent_fst_name(rs.getString(3));
                telecommunictionDpt.setStudent_sur_name(rs.getString(4));
                telecommunictionDpt.setDate_of_birth(rs.getString(5));
                telecommunictionDpt.setGander(rs.getString(6));
                telecommunictionDpt.setEmail(rs.getString(7));
                telecommunictionDpt.setNumber(rs.getString(8));
                telecommunictionDpt.setPresent_address(rs.getString(9));
                telecommunictionDpt.setPermanent_address(rs.getString(10));
                telecommunictionDpt.setHouse_no(rs.getString(11));
                telecommunictionDpt.setPost_code(rs.getInt(12));
                telecommunictionDpt.setDpt_code(rs.getInt(13));
                telecommunictionDpt.setGetImage(rs.getBytes(14));

                list.add(telecommunictionDpt);
            }

            return list;
        } catch (SQLException ex) {
            Logger.getLogger(TelecommunictionDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public byte[] getImage(int id) {

        byte[] getImage;

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT student_image FROM dpt_telecommuniction WHERE student_id=?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                getImage = rs.getBytes(1);
                return getImage;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ComputerDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
