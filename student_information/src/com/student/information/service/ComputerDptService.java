/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.information.service;

import com.student.information.connect.DBconnect;
import com.student.information.domain.ComputerDpt;
import java.awt.Image;
import java.io.InputStream;
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
public class ComputerDptService {

    private Connection connection;

    public void saveRecord(ComputerDpt cpComputerDpt) {

        try {
            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO dpt_computer(student_id,student_first_name,student_surname,date_of_birth,gender,email,mobile_number,present_address,permanent_address,house_no,post_code,dpt_code,student_image) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            statement.setInt(1, cpComputerDpt.getStudent_id());
            statement.setString(2, cpComputerDpt.getStudent_fst_name());
            statement.setString(3, cpComputerDpt.getStudent_sur_name());
            statement.setString(4, cpComputerDpt.getDate_of_birth());
            statement.setString(5, cpComputerDpt.getGander());
            statement.setString(6, cpComputerDpt.getEmail());
            statement.setString(7, cpComputerDpt.getNumber());
            statement.setString(8, cpComputerDpt.getPresent_address());
            statement.setString(9, cpComputerDpt.getPermanent_address());
            statement.setString(10, cpComputerDpt.getHouse_no());
            statement.setInt(11, cpComputerDpt.getPost_code());
            statement.setInt(12, cpComputerDpt.getDpt_code());
            statement.setBlob(13, cpComputerDpt.getImage());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ComputerDptService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editRecord(ComputerDpt cpComputerDpt) {

        try {
            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE dpt_computer SET student_id=?,student_first_name=?,student_surname=?,date_of_birth=?,gender=?,email=?,mobile_number=?,present_address=?,permanent_address=?,house_no=?,post_code=?,dpt_code=?,student_image=? WHERE id=?");

            statement.setInt(1, cpComputerDpt.getStudent_id());
            statement.setString(2, cpComputerDpt.getStudent_fst_name());
            statement.setString(3, cpComputerDpt.getStudent_sur_name());
            statement.setString(4, cpComputerDpt.getDate_of_birth());
            statement.setString(5, cpComputerDpt.getGander());
            statement.setString(6, cpComputerDpt.getEmail());
            statement.setString(7, cpComputerDpt.getNumber());
            statement.setString(8, cpComputerDpt.getPresent_address());
            statement.setString(9, cpComputerDpt.getPermanent_address());
            statement.setString(10, cpComputerDpt.getHouse_no());
            statement.setInt(11, cpComputerDpt.getPost_code());
            statement.setInt(12, cpComputerDpt.getDpt_code());
            statement.setBlob(13, cpComputerDpt.getImage());
            statement.setInt(14, cpComputerDpt.getId());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ComputerDptService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteRecord(int id) {
        try {
            if (id != 0) {
                connection = DBconnect.getConnection();
                PreparedStatement stmt = connection.prepareStatement("DELETE FROM dpt_computer WHERE id=?");

                stmt.setInt(1, id);
                stmt.executeUpdate();
                //System.out.println(i + " record Deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComputerDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ComputerDpt searchRecord(int student_id) {

        ComputerDpt cpComputerDpt = new ComputerDpt();

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM dpt_computer WHERE student_id=?");
            statement.setInt(1, student_id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                cpComputerDpt.setId(rs.getInt(1));
                cpComputerDpt.setStudent_id(rs.getInt(2));
                cpComputerDpt.setStudent_fst_name(rs.getString(3));
                cpComputerDpt.setStudent_sur_name(rs.getString(4));
                cpComputerDpt.setDate_of_birth(rs.getString(5));
                cpComputerDpt.setGander(rs.getString(6));
                cpComputerDpt.setEmail(rs.getString(7));
                cpComputerDpt.setNumber(rs.getString(8));
                cpComputerDpt.setPresent_address(rs.getString(9));
                cpComputerDpt.setPermanent_address(rs.getString(10));
                cpComputerDpt.setHouse_no(rs.getString(11));
                cpComputerDpt.setPost_code(rs.getInt(12));
                cpComputerDpt.setDpt_code(rs.getInt(13));
                cpComputerDpt.setGetImage(rs.getBytes(14));
                cpComputerDpt.setImage(rs.getBlob(14).getBinaryStream());
            }
            return cpComputerDpt;

        } catch (SQLException ex) {
            Logger.getLogger(ComputerDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<ComputerDpt> getRecordList() {

        List<ComputerDpt> list = new ArrayList<>();
        ComputerDpt cpComputerDpt;

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM dpt_computer");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                cpComputerDpt = new ComputerDpt();

                cpComputerDpt.setId(rs.getInt(1));
                cpComputerDpt.setStudent_id(rs.getInt(2));
                cpComputerDpt.setStudent_fst_name(rs.getString(3));
                cpComputerDpt.setStudent_sur_name(rs.getString(4));
                cpComputerDpt.setDate_of_birth(rs.getString(5));
                cpComputerDpt.setGander(rs.getString(6));
                cpComputerDpt.setEmail(rs.getString(7));
                cpComputerDpt.setNumber(rs.getString(8));
                cpComputerDpt.setPresent_address(rs.getString(9));
                cpComputerDpt.setPermanent_address(rs.getString(10));
                cpComputerDpt.setHouse_no(rs.getString(11));
                cpComputerDpt.setPost_code(rs.getInt(12));
                cpComputerDpt.setDpt_code(rs.getInt(13));
                cpComputerDpt.setGetImage(rs.getBytes(14));

                list.add(cpComputerDpt);
            }

            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ComputerDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public byte[] getImage(int id) {

        byte[] getImage;

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT student_image FROM dpt_computer WHERE student_id=?");
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
