/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.information.service;

import com.student.information.connect.DBconnect;
import com.student.information.domain.CivilDpt;
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
public class CivilDptService {

    private Connection connection;

    public void saveRecord(CivilDpt civilDpt) {

        try {
            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO dpt_civil(student_id,student_first_name,student_surname,date_of_birth,gender,email,mobile_number,present_address,permanent_address,house_no,post_code,dpt_code,student_image) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            statement.setInt(1, civilDpt.getStudent_id());
            statement.setString(2, civilDpt.getStudent_fst_name());
            statement.setString(3, civilDpt.getStudent_sur_name());
            statement.setString(4, civilDpt.getDate_of_birth());
            statement.setString(5, civilDpt.getGander());
            statement.setString(6, civilDpt.getEmail());
            statement.setString(7, civilDpt.getNumber());
            statement.setString(8, civilDpt.getPresent_address());
            statement.setString(9, civilDpt.getPermanent_address());
            statement.setString(10, civilDpt.getHouse_no());
            statement.setInt(11, civilDpt.getPost_code());
            statement.setInt(12, civilDpt.getDpt_code());
            statement.setBlob(13, civilDpt.getImage());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CivilDptService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editRecord(CivilDpt civilDpt) {

        try {
            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE dpt_civil SET student_id=?,student_first_name=?,student_surname=?,date_of_birth=?,gender=?,email=?,mobile_number=?,present_address=?,permanent_address=?,house_no=?,post_code=?,dpt_code=?,student_image=? WHERE id=?");

            statement.setInt(1, civilDpt.getStudent_id());
            statement.setString(2, civilDpt.getStudent_fst_name());
            statement.setString(3, civilDpt.getStudent_sur_name());
            statement.setString(4, civilDpt.getDate_of_birth());
            statement.setString(5, civilDpt.getGander());
            statement.setString(6, civilDpt.getEmail());
            statement.setString(7, civilDpt.getNumber());
            statement.setString(8, civilDpt.getPresent_address());
            statement.setString(9, civilDpt.getPermanent_address());
            statement.setString(10, civilDpt.getHouse_no());
            statement.setInt(11, civilDpt.getPost_code());
            statement.setInt(12, civilDpt.getDpt_code());
            statement.setBlob(13, civilDpt.getImage());
            statement.setInt(14, civilDpt.getId());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CivilDptService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteRecord(int id) {
        try {
            if (id != 0) {
                connection = DBconnect.getConnection();
                PreparedStatement stmt = connection.prepareStatement("DELETE FROM dpt_civil WHERE id=?");

                stmt.setInt(1, id);
                stmt.executeUpdate();
                //System.out.println(i + " record Deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CivilDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public CivilDpt searchRecord(int student_id) {

        CivilDpt civilDpt = new CivilDpt();

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM dpt_civil WHERE student_id=?");
            statement.setInt(1, student_id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                civilDpt.setId(rs.getInt(1));
                civilDpt.setStudent_id(rs.getInt(2));
                civilDpt.setStudent_fst_name(rs.getString(3));
                civilDpt.setStudent_sur_name(rs.getString(4));
                civilDpt.setDate_of_birth(rs.getString(5));
                civilDpt.setGander(rs.getString(6));
                civilDpt.setEmail(rs.getString(7));
                civilDpt.setNumber(rs.getString(8));
                civilDpt.setPresent_address(rs.getString(9));
                civilDpt.setPermanent_address(rs.getString(10));
                civilDpt.setHouse_no(rs.getString(11));
                civilDpt.setPost_code(rs.getInt(12));
                civilDpt.setDpt_code(rs.getInt(13));
                civilDpt.setGetImage(rs.getBytes(14));
                civilDpt.setImage(rs.getBlob(14).getBinaryStream());
            }
            return civilDpt;

        } catch (SQLException ex) {
            Logger.getLogger(CivilDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<CivilDpt> getRecordList() {

        List<CivilDpt> list = new ArrayList<>();
        CivilDpt civilDpt;

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM dpt_civil");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                civilDpt = new CivilDpt();

                civilDpt.setId(rs.getInt(1));
                civilDpt.setStudent_id(rs.getInt(2));
                civilDpt.setStudent_fst_name(rs.getString(3));
                civilDpt.setStudent_sur_name(rs.getString(4));
                civilDpt.setDate_of_birth(rs.getString(5));
                civilDpt.setGander(rs.getString(6));
                civilDpt.setEmail(rs.getString(7));
                civilDpt.setNumber(rs.getString(8));
                civilDpt.setPresent_address(rs.getString(9));
                civilDpt.setPermanent_address(rs.getString(10));
                civilDpt.setHouse_no(rs.getString(11));
                civilDpt.setPost_code(rs.getInt(12));
                civilDpt.setDpt_code(rs.getInt(13));
                civilDpt.setGetImage(rs.getBytes(14));

                list.add(civilDpt);
            }

            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CivilDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public byte[] getImage(int id) {

        byte[] getImage;

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT student_image FROM dpt_civil WHERE student_id=?");
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
