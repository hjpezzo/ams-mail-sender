package br.com.mesttra.mailsender.repository;

import br.com.mesttra.mailsender.entity.MailRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRecordRepository extends JpaRepository<MailRecord, Long> {

}
