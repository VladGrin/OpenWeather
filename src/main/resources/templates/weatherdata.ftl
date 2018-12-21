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
    <title>Weather Data</title>
</head>
<body>
    <div><a href="index">Back</a></div>
    <div>Location</div>
        <div>
            <table>
                <tr>
                    <th>NAME</th>
                    <th>COUNTRY</th>
                    <th>Altitude</th>
                    <th>Latitude</th>
                    <th>Longitude</th>
                    <th>Geobase</th>
                    <th>Geobaseid</th>
                    <th>Sun rise</th>
                    <th>Sun set</th>
                </tr>
                <tr>
                    <td><b>${weatherdata.location.name}</b></td>
                    <td><span>${weatherdata.location.country}</span></td>
                    <td><span>${weatherdata.location.innerLocation.altitude}</span></td>
                    <td><span>${weatherdata.location.innerLocation.latitude}</span></td>
                    <td><span>${weatherdata.location.innerLocation.longitude}</span></td>
                    <td><span>${weatherdata.location.innerLocation.geobase}</span></td>
                    <td><span>${weatherdata.location.innerLocation.geobaseid}</span></td>
                    <td><span>${weatherdata.sun.rise}</span></td>
                    <td><span>${weatherdata.sun.set}</span></td>
                </tr>
            </table>
        </div>
    <br>
    <div>FORECAST</div>
    <div>
        <table>
            <tr>
                <th>DAY</th>
                <th>Symbol</th>
                <th>Precipitation</th>
                <th>Wind Direction</th>
                <th>Wind Speed</th>
                <th>Temperature</th>
                <th>Pressure</th>
                <th>Humidity</th>
                <th>Clouds</th>
            </tr>
            <#list weatherdata.forecast.time as times>
        <tr>
            <td><b>${times.day}</b></td>
            <td><b>${times.symbol.name}</b></td>
            <td><b>${times.precipitation.type}</b></td>
            <td><b>${times.windDirection.name}</b></td>
            <td><b>${times.windSpeed.mps}</b></td>
            <td><b>${times.temperature.day}</b></td>
            <td><b>${times.pressure.value}</b></td>
            <td><b>${times.humidity.value}</b></td>
            <td><b>${times.clouds.value}</b></td>
        </tr>
            <#else>
        No message
            </#list>
        </table>
    </div>
</body>
</html>
