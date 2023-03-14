package weather

import weather.Now

class weather_data(
    val wind_u:List<Double>,
    val wind_v:List<Double>,
    val temperature:List<Double>,
    val gust:List<Double>,
    val humidity:List<Double>,
    val pressure:List<Double>,
    val timestamp:List<Long>,
    val now: Now,
    val cloud:List<Double>
)
