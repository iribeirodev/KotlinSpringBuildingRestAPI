package com.z.springkotlinz.dto

import java.time.LocalDateTime
import java.time.chrono.ChronoLocalDateTime

data class ErrorResponse (
        val title: String = "Bad Request",
        val message: String,
        val dateTime: LocalDateTime = LocalDateTime.now()
)