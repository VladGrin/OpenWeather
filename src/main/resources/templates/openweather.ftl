<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <style>
        table, th, td {border: 1px solid black; border-collapse: collapse; border-spacing: 5px;}
        th, td {padding: 3px;}
    </style>
    <title>Open Weather</title>
</head>
<body>
    <div><a href="index">Back</a></div>
    <div>OpenWeather</div>
        <div>
            <table>
                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>CODE</th>
                    <th>BASE</th>
                    <th>DT</th>
                    <th>VISIBILITY</th>
                </tr>
                <tr>
                    <td><b>${openweather.id}</b></td>
                    <td><span>${openweather.name}</span></td>
                    <td><span>${openweather.cod}</span></td>
                    <td><span>${openweather.base}</span></td>
                    <td><span>${openweather.dt}</span></td>
                    <td><span>${openweather.visibility}</span></td>
                </tr>
            </table>
        </div>
    <br>
    <div>Coordinates</div>
    <div>
        <table>
            <tr>
                <th>LON</th>
                <th>LAT</th>
            </tr>
            <tr>
                <td><span>${openweather.coord.lon}</span></td>
                <td><span>${openweather.coord.lat}</span></td>
            </tr>
        </table>
    </div>
    <br>
    <div>Weather</div>
    <div>
        <table>
            <tr>
                <th>ID</th>
                <th>MAIN</th>
                <th>DESCRIPTION</th>
                <th>ICON</th>
            </tr>
            <#list openweather.weather as weathers>
        <tr>
            <td><b>${weathers.id}</b></td>
            <td><span>${weathers.main}</span></td>
            <td><i>${weathers.description}</i></td>
            <td><strong>${weathers.icon}</strong></td>
        </tr>
            <#else>
        No message
            </#list>
        </table>
    </div>
    <br>
    <div>Main</div>
    <div>
        <table>
            <tr>
                <th>TEMPERATURE</th>
                <th>PRESSURE</th>
                <th>HUMIDITY</th>
                <th>TEMP MIN</th>
                <th>TEMP MAX</th>
            </tr>
            <tr>
                <td><span>${openweather.main.temp}</span></td>
                <td><span>${openweather.main.pressure}</span></td>
                <td><span>${openweather.main.humidity}</span></td>
                <td><span>${openweather.main.temp_min}</span></td>
                <td><span>${openweather.main.temp_max}</span></td>
            </tr>
        </table>
    </div>
    <br>
    <div>Wind</div>
    <div>
        <table>
            <tr>
                <th>SPEED</th>
                <th>DEG</th>
            </tr>
            <tr>
                <td><span>${openweather.wind.speed}</span></td>
                <td><span>${openweather.wind.deg}</span></td>
            </tr>
        </table>
    </div>
    <br>
    <div>Clouds</div>
    <div>
        <table>
            <tr>
                <th>ALL</th>
            </tr>
            <tr>
                <td><span>${openweather.clouds.all}</span></td>
            </tr>
        </table>
    </div>
    <br>
    <div>Sys</div>
    <div>
        <table>
            <tr>
                <th>TYPE</th>
                <th>ID</th>
                <th>MESSAGE</th>
                <th>COUNTRY</th>
                <th>SUNRISE</th>
                <th>SUNSET</th>
            </tr>
            <tr>
                <td><span>${openweather.sys.type}</span></td>
                <td><span>${openweather.sys.id}</span></td>
                <td><span>${openweather.sys.message}</span></td>
                <td><span>${openweather.sys.country}</span></td>
                <td><span>${openweather.sys.sunrise}</span></td>
                <td><span>${openweather.sys.sunset}</span></td>
            </tr>
        </table>
    </div>
</body>
</html>
