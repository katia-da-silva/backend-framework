package weather

import weather.latest_data

data class station_data(
    val TEMPERATURE:MutableMap<String, Double>,
    val TWD:MutableMap<String, Double>,
    val LATEST_DATA: latest_data,
    val TIMESTAMP:MutableMap<String, String>,
    val RAIN:MutableMap<String, Int>,
    val HUMIDITY:MutableMap<String, Int>,
    val TWS:MutableMap<String, Int>,
    val length:Int,
    val TIME:MutableMap<String, Long>,
    val PRESSURE:MutableMap<String, Double>,
    val SHIFTINDEX:Int,
    val ACTIVE:String
)
