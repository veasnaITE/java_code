import model.Students;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static Jdbc jdbc;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       jdbc = new Jdbc();
       input = new Scanner(System.in);
        int option=0;
        do{
            System.out.println("1.Insertion");
            System.out.println("2.Deteting");
            System.out.println("3.SerchByName");
            System.out.println("4.SearchById");
            System.out.println("5.Updating");
            System.out.println("6.Show");
            System.out.println("7.Exit../.");
            option = input.nextInt();
            switch (option) {
                case 1:insertStudent();break;
                case 2:deletion();break;
                case 3:searchByname();break;
                case 4:searchById();break;
                case 5:updatedata();break;
                case 6:selectJdbc();break;
            }
        }while (option!=7);

    }
    static void selectJdbc(){
        try (Connection connection = jdbc.dataSource().getConnection()) {
           //1. Create SQL statement
           String selectSql = "SELECT * FROM students";
            PreparedStatement statement = connection.prepareStatement(selectSql);
            //2.Execute statement Object
            ResultSet resultSet = statement.executeQuery();
            //3. Process Result Statement object
            List<Students> students = new ArrayList<>();
            while (resultSet.next()){
                int id =resultSet.getInt("id");
                String name = resultSet.getString("name");
                String decription= resultSet.getString("decription");
                students.add(new Students(id, name, decription));
            }
            students.forEach(System.out::println);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
  static  void insertStudent(){
      Students student = new Students();
      System.out.println("Name: ");
      student.setName(input.nextLine());
      System.out.println("Desciption: ");
      student.setDescription(input.nextLine());
        try(Connection conn = jdbc.dataSource().getConnection()) {
          String insertSql=("INSERT INTO students(name,decription) VALUES(?, ?)");
          PreparedStatement preparedStatement = conn.prepareStatement(insertSql)  ;
          preparedStatement.setString(1,student.getName());
          preparedStatement.setString(2,student.getDescription());
          preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void deletion(){
        System.out.println("Enter id: ");
        int id = input.nextInt();
        try (Connection conn = jdbc.dataSource().getConnection()){
                String deletesql = "DELETE FROM students WHERE id = ?";
            PreparedStatement delete = conn.prepareStatement(deletesql);
            delete.setInt(1, id);
            delete.executeUpdate();
            System.out.println("Delete success!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    static void updatedata(){
        try (Connection conn = jdbc.dataSource().getConnection()){
            System.out.println("Enter id: ");
            int id = input.nextInt();
            System.out.println("Enter name: "); input.nextLine();
            String name = input.nextLine();
            System.out.println("Desciption: ");
            String desc = input.nextLine();
            String updatesql = "update students set name = ?, decription = ? where id = ?";
            PreparedStatement update = conn.prepareStatement(updatesql);
            update.setString(1, name);
            update.setString(2, desc);
            update.setInt(3, id);
            update.executeUpdate();
            System.out.println("Updated!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    static void searchByname(){
        Students student = new Students();
        try (Connection conn = jdbc.dataSource().getConnection()){
            String selectname = "select * from students where name = 'tola'";
            PreparedStatement preparedStatement = conn.prepareStatement(selectname)  ;
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String decription= resultSet.getString("decription");
                int id = resultSet.getInt("id");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Description: " + decription);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
    static void searchById(){
        Students student = new Students();
        try (Connection conn = jdbc.dataSource().getConnection()){
            String selectid = "select * from students where id = 2";
            PreparedStatement preparedStatement = conn.prepareStatement(selectid)  ;
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String decription= resultSet.getString("decription");
                System.out.println("Name: " + name);
                System.out.println("Description: " + decription);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }