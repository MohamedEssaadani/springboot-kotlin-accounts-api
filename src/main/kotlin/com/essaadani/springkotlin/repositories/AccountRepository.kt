package com.essaadani.springkotlin.repositories

import com.essaadani.springkotlin.entities.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository: JpaRepository<Account, Long>
