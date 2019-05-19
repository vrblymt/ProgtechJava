package Backend.Model;

import Backend.Model.Builder.Karakter;
import java.sql.*;
import java.util.logging.Logger;

public class AdatbazisKezelo {

    private static final Logger LOG = Logger.getLogger(AdatbazisKezelo.class.getName());

    String url = "jdbc:mysql://localhost:3306/progtech?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    Connection conn = null;
    Statement statement = null;

    /**
     * visszaadja a legutoljára létrehozott karakter példányát.
     *
     * @return Karakter
     */
    public Karakter Select() {
        Karakter temp = new Karakter();
        Csatlakozas();
        try {

            String sql = "SELECT nev, kaszt, ruha FROM karakterek WHERE id = (SELECT MAX(id) FROM karakterek)";
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                temp.setNev(rs.getString("nev"));
                temp.setKaszt(rs.getString("kaszt"));
                temp.setRuhaSzin(rs.getString("ruha"));
            }
            conn.close();
            LOG.info("Karakter lekérdezése sikeres, adatbázis kapcsolat bontva.");

        } catch (Exception e) {
            e.printStackTrace();
            LOG.info(e.getMessage());
        }
        return temp;
    }

    /**
     * Egy karaktert tudunk az adatbázishoz adni.
     *
     * @param karakter egy karaktert adatbázisban tárol el
     */
    public void Insert(Karakter karakter) {
        Csatlakozas();
        try {
            String sql = "INSERT INTO karakterek (nev, kaszt, ruha)"
                    + "VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, karakter.getNev());
            preparedStatement.setString(2, karakter.getKaszt());
            preparedStatement.setString(3, karakter.getRuhaSzin());
            preparedStatement.executeUpdate();
            conn.close();
            LOG.info("Insert sikeres, adatbázis kapcsolat bontva.");
        } catch (Exception e) {
            e.printStackTrace();
            LOG.info(e.getMessage());
        }

    }

    private void Csatlakozas() {
        try {

            conn = DriverManager.getConnection(url, "root", "");
            LOG.info("Database connection established");
        } catch (Exception e) {
            LOG.info(e.getMessage());
            e.printStackTrace();

        }
    }

}
