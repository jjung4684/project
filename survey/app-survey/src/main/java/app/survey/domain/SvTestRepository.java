package app.survey.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SvTestRepository extends JpaRepository<SvTest, Long> {

    SvTest findById(long id);
    SvTest findByDescription(String description);
}
