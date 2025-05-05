package worldclock.controller

import com.example.worldclock.dto.WorldTimeResponse
import com.example.worldclock.service.WorldTimeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WorldTimeController(
    private val worldTimeService: WorldTimeService
) {
    @GetMapping("/api/world-time")
    fun getWorldTimes(): List<WorldTimeResponse> = worldTimeService.fetchWorldTimes() 
}
