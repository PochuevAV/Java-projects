package org.example.DAO;

import org.example.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAO implements User_DAO {

    private static final String GET_BY_ID_QUERY = "SELECT * FROM USERDATA U WHERE U.ID = ?;";
    private static final String INSERT_USER_QUERY = "INSERT INTO USERDATA(NAME, ID, SURNAME, LASTNAME, JOBTITLE, DEPARTMENT, SALARY) VALUES(?,?,?,?,?,?,?);";
    private static final String DELETE_USER_QUERY = "DELETE FROM USERDATA WHERE ID = ?";


    public UserDAO() {
    }

    @Override
    public User getById(int id) {
        try (Connection connection = DbConnector.getConnection()) {
            PreparedStatement selectStatement = connection.prepareStatement(GET_BY_ID_QUERY);
            selectStatement.setInt(1, id);
            ResultSet result = selectStatement.executeQuery();
            result.next();

            User user = new User();
            user.setName(result.getString("name"));
            user.setId(result.getInt("id"));
            user.setSurname(result.getString("surname"));
            user.setLastname(result.getString("lastname"));
            user.setJobtitle(result.getString("jobtitle"));
            user.setDepartment(result.getString("department"));
            user.setSalary(result.getInt("salary"));

            return user;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(User user) {
        try (Connection connection = DbConnector.getConnection()) {
            PreparedStatement insertStatement = connection.prepareStatement(INSERT_USER_QUERY);
            insertStatement.setString(1, user.getName());
            insertStatement.setInt(2, user.getId());
            insertStatement.setString(3, user.getSurname());
            insertStatement.setString(4, user.getLastname());
            insertStatement.setString(5, user.getJobtitle());
            insertStatement.setString(6, user.getDepartment());
            insertStatement.setInt(7, user.getSalary());
            insertStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (Connection connection = DbConnector.getConnection()) {
            PreparedStatement st = connection.prepareStatement(DELETE_USER_QUERY);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update1(int id, int id2) {
        try (Connection connection = DbConnector.getConnection()) {
            PreparedStatement st = connection.prepareStatement("UPDATE USERDATA SET ID = ? WHERE id = " + id + ";");
            st.setInt(1, id2);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update2(int id, String Name) {
        try (Connection connection = DbConnector.getConnection()) {
            PreparedStatement st = connection.prepareStatement("UPDATE USERDATA SET NAME = ? WHERE id = " + id + ";");
            st.setString(1, Name);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update3(int id, String Surname) {
        try (Connection connection = DbConnector.getConnection()) {
            PreparedStatement st = connection.prepareStatement("UPDATE USERDATA SET SURNAME = ? WHERE id = " + id + ";");
            st.setString(1, Surname);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update4(int id, String Lastname) {
        try (Connection connection = DbConnector.getConnection()) {
            PreparedStatement st = connection.prepareStatement("UPDATE USERDATA SET LASTNAME = ? WHERE id = " + id + ";");
            st.setString(1, Lastname);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update5(int id, String Jobtitle) {
        try (Connection connection = DbConnector.getConnection()) {
            PreparedStatement st = connection.prepareStatement("UPDATE USERDATA SET JOBTITLE = ? WHERE id = " + id + ";");
            st.setString(1, Jobtitle);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update6(int id, String Department) {
        try (Connection connection = DbConnector.getConnection()) {
            PreparedStatement st = connection.prepareStatement("UPDATE USERDATA SET DEPARTMENT = ? WHERE id = " + id + ";");
            st.setString(1, Department);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update7(int id, int Salary) {
        try (Connection connection = DbConnector.getConnection()) {
            PreparedStatement st = connection.prepareStatement("UPDATE USERDATA SET SALARY = ? WHERE id = " + id + ";");
            st.setInt(1, Salary);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
