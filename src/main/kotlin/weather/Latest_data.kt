package weather

data class latest_data(
    val TWS_GUST_MAX: tws_gust_max,
    val TWD:Int,
    val RAIN_DAY:Int,
    val TWS:Double,
    val LOCALTIME:Int,
    val valHUMIDITY_IN:Int,
    val WINDCHILL:Double,
    val TEMP_IN:String,
    val ICON_NOW:String,
    val ICON_FOR:Int,
    val TEMPERATURE:Double,
    val TWS_GUST:Double,
    val RAIN:Int,
    val PRESSURE:Double,
    val LONGITUDE:Double,
    val PRESSURE_TRval :Double,
    val RAIN_MONTH:Double,
    val HUMIDEX:Double,
    val HUMIDITY:Int,
    val TIME_STRING:String,
    val TIME:Long,
    val LATITUDE:Double,
    val WEATHER_DES:String
)
