package com.example.worldclock.repository

import com.example.worldclock.entity.AccessLog
import org.springframework.data.jpa.repository.JpaRepository

interface AccessLogRepository : JpaRepository<AccessLog, Long>
