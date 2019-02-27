package com.rghatkari.connectionpool;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;

public class BasicConnectionPoolUnitTest {

    private static ConnectionPool connectionPool;

    @BeforeClass
    public static void setUpBasicConnectionPoolInstance() throws SQLException {
        connectionPool = BasicConnectionPool.createConnectionPool("jdbc:h2:mem:test", "user", "password");
    }

    @Test
    public void connectionPoolSizeTest() throws SQLException {
        System.out.println(connectionPool.getSize());
        assertTrue(connectionPool.getConnection().isValid(1));
    }

    @Test
    public void givenBasicConnectionPoolInstance_whenCalledreleaseConnection_thenCorrect() throws Exception {
        Connection connection = connectionPool.getConnection();
        assertThat(connectionPool.releaseConnection(connection)).isTrue();
    }


    @Test(expected = RuntimeException.class)
    public void givenBasicConnectionPoolInstance_whenAskedForMoreThanMax_thenError() throws Exception {
        // this test needs to be independent so it doesn't share the same connection pool as other tests
        ConnectionPool cp = BasicConnectionPool.createConnectionPool("jdbc:h2:mem:test", "user", "password");
        final int MAX_POOL_SIZE = 20;
        for (int i = 0; i < MAX_POOL_SIZE + 1; i++) {
            cp.getConnection();
        }
        fail();
    }

    @Test
    public void givenBasicConnectionPoolInstance_whenShutdown_thenEmpty() throws Exception {
        ConnectionPool cp = BasicConnectionPool.createConnectionPool("jdbc:h2:mem:test", "user", "password");
        assertThat(((BasicConnectionPool)cp).getSize()).isEqualTo(10);

        ((BasicConnectionPool) cp).shutdown();
        assertThat(((BasicConnectionPool)cp).getSize()).isEqualTo(0);
    }
}
