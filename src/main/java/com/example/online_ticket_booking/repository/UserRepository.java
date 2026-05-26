package com.example.online_ticket_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_ticket_booking.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}