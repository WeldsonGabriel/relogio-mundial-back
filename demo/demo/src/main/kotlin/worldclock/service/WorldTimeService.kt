package com.example.worldclock.service

import com.example.worldclock.dto.WorldTimeResponse
import com.example.worldclock.entity.AccessLog
import com.example.worldclock.repository.AccessLogRepository
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.time.LocalDateTime

@Service
class WorldTimeService(
    private val accessLogRepository: AccessLogRepository
) {
    private val restTemplate = RestTemplate()
    private val timezones = listOf(
        "America/Sao_Paulo", "Europe/London", "Asia/Tokyo", "America/New_York", "Australia/Sydney"
    )

    fun fetchWorldTimes(): List<WorldTimeResponse> {
        val responses = timezones.mapNotNull { tz ->
            try {
                val response = restTemplate.getForObject(
                    "http://worldtimeapi.org/api/timezone/$tz",
                    Map::class.java
                )
                WorldTimeResponse(
                    timezone = tz,
                    datetime = response?.get("datetime") as? String ?: "Unavailable"
                )
            } catch (e: Exception) {
                null
            }
        }

        accessLogRepository.save(
            AccessLog(timestamp = LocalDateTime.now(), totalTimezones = responses.size)
        )

        return responses
    }
}
