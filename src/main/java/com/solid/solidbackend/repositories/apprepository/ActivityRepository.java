package com.solid.solidbackend.repositories.apprepository;

import com.solid.solidbackend.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

    Optional<Activity> findActivityByName(String activity);

}
