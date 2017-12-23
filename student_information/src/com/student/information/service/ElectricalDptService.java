/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.information.service;

import com.student.information.connect.DBconnect;
import com.student.information.domain.ElectricalDpt;
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
public class ElectricalDptService {
    
    
    private Connection connection;
    

    public void saveRecord(ElectricalDpt electricalDpt) {

        try {
            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO dpt_electrical(student_id,student_first_name,student_surname,date_of_birth,gender,email,mobile_number,present_address,permanent_address,house_no,post_code,dpt_code,student_image) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            statement.setInt(1, electricalDpt.getStudent_id());
            statement.setString(2, electricalDpt.getStudent_fst_name());
            statement.setString(3, electricalDpt.getStudent_sur_name());
            statement.setString(4, electricalDpt.getDate_of_birth());
            statement.setString(5, electricalDpt.getGander());
            statement.setString(6, electricalDpt.getEmail());
            statement.setString(7, electricalDpt.getNumber());
            statement.setString(8, electricalDpt.getPresent_address());
            statement.setString(9, electricalDpt.getPermanent_address());
            statement.setString(10, electricalDpt.getHouse_no());
            statement.setInt(11, electricalDpt.getPost_code());
            statement.setInt(12, electricalDpt.getDpt_code());
            statement.setBlob(13, electricalDpt.getImage());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ElectricalDptService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editRecord(ElectricalDpt electricalDpt) {

        try {
            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE dpt_electrical SET student_id=?,student_first_name=?,student_surname=?,date_of_birth=?,gender=?,email=?,mobile_number=?,present_address=?,permanent_address=?,house_no=?,post_code=?,dpt_code=?,student_image=? WHERE id=?");

            statement.setInt(1, electricalDpt.getStudent_id());
            statement.setString(2, electricalDpt.getStudent_fst_name());
            statement.setString(3, electricalDpt.getStudent_sur_name());
            statement.setString(4, electricalDpt.getDate_of_birth());
            statement.setString(5, electricalDpt.getGander());
            statement.setString(6, electricalDpt.getEmail());
            statement.setString(7, electricalDpt.getNumber());
            statement.setString(8, electricalDpt.getPresent_address());
            statement.setString(9, electricalDpt.getPermanent_address());
            statement.setString(10, electricalDpt.getHouse_no());
            statement.setInt(11, electricalDpt.getPost_code());
            statement.setInt(12, electricalDpt.getDpt_code());
            statement.setBlob(13, electricalDpt.getImage());
            statement.setInt(14, electricalDpt.getId());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ElectricalDptService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteRecord(int id) {
        try {
            if (id != 0) {
                connection = DBconnect.getConnection();
                PreparedStatement stmt = connection.prepareStatement("DELETE FROM dpt_electrical WHERE id=?");

                stmt.setInt(1, id);
                stmt.executeUpdate();
                //System.out.println(i + " record Deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ElectricalDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ElectricalDpt searchRecord(int student_id) {

        ElectricalDpt electricalDpt=new ElectricalDpt();

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM dpt_electrical WHERE student_id=?");
            statement.setInt(1, student_id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                electricalDpt.setId(rs.getInt(1));
                electricalDpt.setStudent_id(rs.getInt(2));
                electricalDpt.setStudent_fst_name(rs.getString(3));
                electricalDpt.setStudent_sur_name(rs.getString(4));
                electricalDpt.setDate_of_birth(rs.getString(5));
                electricalDpt.setGander(rs.getString(6));
                electricalDpt.setEmail(rs.getString(7));
                electricalDpt.setNumber(rs.getString(8));
                electricalDpt.setPresent_address(rs.getString(9));
                electricalDpt.setPermanent_address(rs.getString(10));
                electricalDpt.setHouse_no(rs.getString(11));
                electricalDpt.setPost_code(rs.getInt(12));
                electricalDpt.setDpt_code(rs.getInt(13));
                electricalDpt.setGetImage(rs.getBytes(14));
                electricalDpt.setImage(rs.getBlob(14).getBinaryStream());
            }
            return electricalDpt;

        } catch (SQLException ex) {
            Logger.getLogger(ElectricalDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<ElectricalDpt> getRecordList() {

        List<ElectricalDpt> list = new ArrayList<>();
        ElectricalDpt electricalDpt;

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM dpt_electrical");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                electricalDpt=new ElectricalDpt();

                electricalDpt.setId(rs.getInt(1));
                electricalDpt.setStudent_id(rs.getInt(2));
                electricalDpt.setStudent_fst_name(rs.getString(3));
                electricalDpt.setStudent_sur_name(rs.getString(4));
                electricalDpt.setDate_of_birth(rs.getString(5));
                electricalDpt.setGander(rs.getString(6));
                electricalDpt.setEmail(rs.getString(7));
                electricalDpt.setNumber(rs.getString(8));
                electricalDpt.setPresent_address(rs.getString(9));
                electricalDpt.setPermanent_address(rs.getString(10));
                electricalDpt.setHouse_no(rs.getString(11));
                electricalDpt.setPost_code(rs.getInt(12));
                electricalDpt.setDpt_code(rs.getInt(13));
                electricalDpt.setGetImage(rs.getBytes(14));

                list.add(electricalDpt);
            }

            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ElectricalDptService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public byte[] getImage(int id) {

        byte[] getImage;

        try {

            connection = DBconnect.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT student_image FROM dpt_electrical WHERE student_id=?");
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
