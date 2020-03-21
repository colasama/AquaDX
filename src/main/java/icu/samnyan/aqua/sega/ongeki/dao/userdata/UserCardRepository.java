package icu.samnyan.aqua.sega.ongeki.dao.userdata;

import icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard;
import icu.samnyan.aqua.sega.ongeki.model.userdata.UserData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author samnyan (privateamusement@protonmail.com)
 */
@Repository("OngekiUserCardRepository")
public interface UserCardRepository extends JpaRepository<UserCard, Long> {
    Optional<UserCard> findByUserAndCardId(UserData userData, int cardId);

    Page<UserCard> findByUser_Card_ExtId(int userId, Pageable page);

    Optional<UserCard> findByUser_Card_ExtIdAndCardId(int aimeId, int cardId);
}
