package com.essaadani.springkotlin.entities

import org.springframework.data.annotation.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table


@Entity
@Table(name = "tbl_account")
data class Account(
        @javax.persistence.Id @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,
        val name: String,
        val balance: Double,
        val currency: String
)
