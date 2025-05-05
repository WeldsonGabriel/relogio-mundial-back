package com.example.worldclock.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class AccessLog(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val timestamp: LocalDateTime,

    val totalTimezones: Int
)
