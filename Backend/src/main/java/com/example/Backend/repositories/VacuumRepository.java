package com.example.Backend.repositories;

import com.example.Backend.enums.Status;
import com.example.Backend.model.User;
import com.example.Backend.model.Vacuum;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface VacuumRepository extends JpaRepository<Vacuum, Long> {

    List<Vacuum> findByNameContainsAndStatusInAndAndDateFromGreaterThanEqualAndUser(String name, List<Status> statuses, LocalDate dateFrom, User user);

//    List<Vacuum> findAllByNameContainsAndStatusAndUser_Id(String name, Status status, Long user_id);


//    @Query("SELECT v FROM Vacuum v WHERE v.name LIKE CONCAT('%',:name,'%') AND v.status = ANY(:statuses) AND v.user = :user")
//    List<Vacuum> findAllBy(@Param("name") String name, @Param("statuses") List<Status> statuses, @Param("user") User user);
}
