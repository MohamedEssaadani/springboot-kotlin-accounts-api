package com.essaadani.springkotlin.services

import com.essaadani.springkotlin.entities.Account
import com.essaadani.springkotlin.repositories.AccountRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class AccountService(val repository: AccountRepository) {
    fun getAll(): List<Account> = repository.findAll()
    fun getById(id: Long): Account = repository.findByIdOrNull(id)
            ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)

    fun create(account: Account) = repository.saveAndFlush(account);
    fun remove(id: Long) {
        if (repository.existsById(id)) repository.deleteById(id)
        else throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }
}
