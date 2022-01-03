package app.survey.jpa;

import app.survey.domain.SvTest;
import app.survey.domain.SvTestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

//@DataJpaTest
@SpringBootTest(properties = {"spring.config.location=classpath:application-dev.xml"})
public class SvTestRepositoryTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    SvTestRepository svTestRepository;

    @Test
    public void svTest() throws SQLException {
        /*try(Connection connection = dataSource.getConnection()){
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.getURL());
            System.out.println(metaData.getDriverName());
            System.out.println(metaData.getUserName());
        }*/

        SvTest svTest = new SvTest();
        svTest.setId(1L);
        svTest.setName("첫번쨰");
        svTest.setDescription("테스트");

        SvTest newSvTest = svTestRepository.save(svTest);
        assertThat(newSvTest).isNotNull();

        SvTest description = svTestRepository.findByDescription(newSvTest.getDescription());
        assertThat(description).isNotNull();

        SvTest noneDescription = svTestRepository.findByDescription("두번째");
        assertThat(noneDescription).isNull();

    }
}
