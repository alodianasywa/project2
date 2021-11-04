package com.alodia_arum.hotel.service;

import com.alodia_arum.hotel.model.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
    /* Custom queries with join */
    Guest findByLogin(String login);
}