import org.postgresql.ds.PGSimpleDataSource;

import javax.naming.ldap.spi.LdapDnsProvider;
import javax.sql.DataSource;

public class Jdbc {
    public DataSource dataSource(){
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUser("postgres");
        dataSource.setPassword("344334");
        dataSource.setDatabaseName("data_analytic");
        return dataSource;
    }
}
